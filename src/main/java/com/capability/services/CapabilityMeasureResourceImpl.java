package com.capability.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.capability.dao.CapabilityDAO;
import com.capability.entities.CapabilityEntity;
import com.capability.entities.ClusterEntity;
import com.capability.entities.MapEntity;
import com.capability.entities.PasswordEntity;
import com.capability.entities.SectorEntity;
import com.capability.mapper.CustomBeanConverter;
import com.capability.mapper.DozerHelper;
import com.capability.mapper.GenericValidator;
import com.capability.raml.model.Cause;
import com.capability.raml.model.Cluster;
import com.capability.raml.model.ClusterView;
import com.capability.raml.model.ExceptionMessage;
import com.capability.raml.model.ExceptionObject;
import com.capability.raml.model.ExceptionObject.HttpCode;
import com.capability.raml.model.GetClusterViewResponse;
import com.capability.raml.model.GetMapViewResponse;
import com.capability.raml.model.GetMapsResponse;
import com.capability.raml.model.Map;
import com.capability.raml.model.MapView;
import com.capability.raml.model.PutClusterListResponse;
import com.capability.raml.model.PutClusterResponse;
import com.capability.raml.model.PutClustrList;
import com.capability.raml.model.PutMapsResponse;
import com.capability.raml.resource.CapabilityMeasureResource;

/**
 *
 * @author dsomajohassula
 * 
 *         The Class CapabilityResourceImpl.
 */
@Component
@EnableTransactionManagement
public class CapabilityMeasureResourceImpl implements CapabilityMeasureResource {

	@Autowired
	private CapabilityDAO capabilityDAO;

	@Autowired
	private CustomBeanConverter customBeanConverter;

	@Override
	@Transactional
	public GetCapabilityMeasureMapViewByMapNameBySectorNameResponse getCapabilityMeasureMapViewByMapNameBySectorName(
			String mapName, String sectorName, String password) throws Exception {

		List<ClusterEntity> clusterList = null;
		List<MapView> mapViewModelList = new ArrayList<MapView>();
		GetMapViewResponse getMapViewResponse = new GetMapViewResponse();
		try {
			MapEntity mapEntity = null;
			String mapId = null;
			String sectorId = null;
			PasswordEntity passwordEntity = null;
			mapEntity = capabilityDAO.getMapByMapNameSectorName(mapName, sectorName);
			if (mapEntity != null) {
				mapId = mapEntity.getMapEntityKey().getMapId();
				sectorId = mapEntity.getMapEntityKey().getSectorId();
				passwordEntity = capabilityDAO.getPasswordByMapIdSectorId(mapId, sectorId);
			}

			if (passwordEntity != null) {

				String passwordFromDb = passwordEntity.getPassword();
				if (password == null || !(password.equals(passwordFromDb))) {
					ExceptionMessage exMessage = new ExceptionMessage();
					ExceptionObject obj = new ExceptionObject();
					obj.setMessage("Incorrect Password");
					exMessage.setExceptionObject(obj);
					return GetCapabilityMeasureMapViewByMapNameBySectorNameResponse.withJsonBadRequest(exMessage);
				}
			}
			clusterList = capabilityDAO.getClusters(mapName, sectorName);
			if (clusterList != null && clusterList.size() > 0) {
				mapViewModelList = DozerHelper.map(customBeanConverter, clusterList, MapView.class);
				getMapViewResponse.setMapView(mapViewModelList);
				getMapViewResponse.setSize(String.valueOf(mapViewModelList.size()));
			}
		} catch (Exception exception) {
			ExceptionMessage exMessage = new ExceptionMessage();
			ExceptionObject obj = new ExceptionObject();
			obj.setHttpCode(HttpCode._500);
			obj.setMessage("Internal server eroor Please again again later");
			exMessage.setExceptionObject(obj);
			return GetCapabilityMeasureMapViewByMapNameBySectorNameResponse.withJsonInternalServerError(exMessage);
		}
		if (mapViewModelList.size() == 0) {
			ExceptionMessage exMessage = new ExceptionMessage();
			ExceptionObject obj = new ExceptionObject();
			obj.setHttpCode(HttpCode._404);
			obj.setMessage("No Records found");
			obj.setAdditionalProperty("Record List size", "0");
			exMessage.setExceptionObject(obj);
			return GetCapabilityMeasureMapViewByMapNameBySectorNameResponse.withJsonNotFound(exMessage);

		}
		return GetCapabilityMeasureMapViewByMapNameBySectorNameResponse.withJsonOK(getMapViewResponse);

	}

	@Override
	@Transactional
	public GetCapabilityMeasureMapsResponse getCapabilityMeasureMaps(String mapType, String searchDesc)
			throws Exception {
		List<Map> mapModelListTemp = new ArrayList<Map>();
		List<Map> mapModelList = new ArrayList<Map>();
		GetMapsResponse getMapsResponse = new GetMapsResponse();
		List<MapEntity> mapEntityList = null;
		try {
			mapEntityList = capabilityDAO.getMaps(mapType, searchDesc);
			mapModelListTemp = DozerHelper.map(customBeanConverter, mapEntityList, Map.class);
			for (Map map : mapModelListTemp) {
				String sectorId = map.getSectorId();
				SectorEntity sectorEntity = capabilityDAO.getSector(sectorId);
				String sectorName = sectorEntity.getSector();
				PasswordEntity passwordEntity = capabilityDAO.getPasswordByMapIdSectorId(map.getMapId(), sectorId);
				if (passwordEntity != null && passwordEntity.getPassword() != null
						&& passwordEntity.getPassword() != "") {
					map.setIsPrivateMap(true);
				} else {
					map.setIsPrivateMap(false);
				}
				map.setSectorName(sectorName);
				mapModelList.add(map);
			}
			getMapsResponse.setMap(mapModelList);
			getMapsResponse.setSize(String.valueOf(mapModelList.size()));

		} catch (Exception exception) {
			ExceptionMessage exMessage = new ExceptionMessage();
			ExceptionObject obj = new ExceptionObject();
			obj.setHttpCode(HttpCode._500);
			obj.setMessage("Internal server eroor Please again again later");
			exMessage.setExceptionObject(obj);
			GetCapabilityMeasureMapsResponse.withJsonInternalServerError(exMessage);
		}
		if (mapEntityList.size() == 0) {
			ExceptionMessage exMessage = new ExceptionMessage();
			ExceptionObject obj = new ExceptionObject();
			obj.setHttpCode(HttpCode._404);
			obj.setMessage("No Records found");
			obj.setAdditionalProperty("Record List size", "0");
			exMessage.setExceptionObject(obj);
			return GetCapabilityMeasureMapsResponse.withJsonNotFound(exMessage);

		}
		return GetCapabilityMeasureMapsResponse.withJsonOK(getMapsResponse);
	}

	@Override
	@Transactional
	public GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse getCapabilityMeasureClusterViewByMapNameBySectorNameByClusterName(
			String mapName, String sectorName, String clusterName) throws Exception {

		List<CapabilityEntity> capabilityEntityList = null;
		List<ClusterView> clusterViewModelList = new ArrayList<ClusterView>();
		GetClusterViewResponse getClusterViewResponse = new GetClusterViewResponse();
		try {
			capabilityEntityList = capabilityDAO.getCapabilities(mapName, sectorName, clusterName);
			if (capabilityEntityList != null && capabilityEntityList.size() > 0) {
				clusterViewModelList = DozerHelper.map(customBeanConverter, capabilityEntityList, ClusterView.class);
				getClusterViewResponse.setClusterView(clusterViewModelList);
				getClusterViewResponse.setSize(String.valueOf(clusterViewModelList.size()));
			}
		} catch (Exception exception) {
			ExceptionMessage exMessage = new ExceptionMessage();
			ExceptionObject obj = new ExceptionObject();
			obj.setHttpCode(HttpCode._500);
			obj.setMessage("Internal server eroor Please again again later");
			exMessage.setExceptionObject(obj);
			return GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse
					.withJsonInternalServerError(exMessage);
		}
		if (clusterViewModelList.size() == 0) {
			ExceptionMessage exMessage = new ExceptionMessage();
			ExceptionObject obj = new ExceptionObject();
			obj.setHttpCode(HttpCode._404);
			obj.setMessage("No Records found");
			obj.setAdditionalProperty("Record List size", "0");
			exMessage.setExceptionObject(obj);
			return GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse
					.withJsonNotFound(exMessage);

		}
		return GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse
				.withJsonOK(getClusterViewResponse);

	}

	private ExceptionMessage createExceptionMessage(Exception exception, java.util.Map<String, String> errorMessageMap,
			ExceptionObject.HttpCode httpCode, String coRelationId, String message) {
		ExceptionMessage exceptionMessage = new ExceptionMessage();
		ExceptionObject exceptionObject = new ExceptionObject();
		exceptionObject.setHttpCode(httpCode);
		exceptionObject.setCorrelationId(coRelationId);
		exceptionObject.setMessage(message);
		exceptionObject
				.setTimeStamp(new SimpleDateFormat("MM-dd-yyyy HH:mm:ssZ").format(Calendar.getInstance().getTime()));
		List<Cause> causeList = null;
		if (null != errorMessageMap) {
			causeList = new ArrayList<Cause>();
			for (java.util.Map.Entry<String, String> e : errorMessageMap.entrySet()) {
				Cause cause = new Cause();
				cause.setCausedetail(e.getKey() + " " + e.getValue());
				causeList.add(cause);
			}
		} else {
			String issue = null;
			if (exception != null) {
				if (exception.getCause() != null) {
					issue = new String(exception.getCause().toString());
				} else {
					issue = new String(exception.getMessage());
				}
				causeList = new ArrayList<Cause>();
				Cause cause = new Cause();

				causeList.add(cause);
			}
		}
		exceptionObject.setCauses(causeList);
		exceptionMessage.setExceptionObject(exceptionObject);
		return exceptionMessage;
	}

	@Override
	@Transactional
	public PostCapabilityMeasureArchiveByMapNameBySectorNameResponse postCapabilityMeasureArchiveByMapNameBySectorName(
			String mapName, String sectorName) throws Exception {

		PutMapsResponse response = new PutMapsResponse();

		MapEntity mapEntity = null;

		try {
			mapEntity = capabilityDAO.getMapByMapNameSectorName(mapName, sectorName);
			if (mapEntity != null) {
				capabilityDAO.archiveMap(mapEntity);
				response.setKey("Map : " + mapName + " & " + "sector :" + sectorName);
				response.setResult("Archived successfully");
				return PostCapabilityMeasureArchiveByMapNameBySectorNameResponse.withJsonOK(response);
			} else {
				ExceptionMessage exceptionMessage = createExceptionMessage(new Exception(mapName), null, HttpCode._404,
						"coRelationId", "record not found");
				return PostCapabilityMeasureArchiveByMapNameBySectorNameResponse.withJsonNotFound(exceptionMessage);
			}

		} catch (Exception ex) {
			ExceptionMessage exceptionMessage = createExceptionMessage(ex, null, HttpCode._500, "coRelationId",
					"Internal server problem");
			return PostCapabilityMeasureArchiveByMapNameBySectorNameResponse
					.withJsonInternalServerError(exceptionMessage);
		}
	}

	@Override
	@Transactional(rollbackFor = RuntimeException.class)
	public PostCapabilityMeasureClusterResponse postCapabilityMeasureCluster(PutClustrList entity) throws Exception {
		List<PutClusterListResponse> respList = new ArrayList<PutClusterListResponse>();

		for (Cluster cluster : entity.getCluster()) {

			java.util.Map<String, String> errMsgMap = GenericValidator.validate(entity, PutClustrList.class);
			if (errMsgMap == null) {
				String clusterId = cluster.getClusterId();
				String mapName = cluster.getMapName();
				String sectorName = cluster.getSectorName();
				String clusterName = cluster.getClusterNm();
				String sectorId = capabilityDAO.getSectorIdBySectorName(sectorName);
				MapEntity mapEntity = capabilityDAO.getMapEntityByMapName(mapName, sectorId);
				String mapId = null;
				if (mapEntity != null) {
					mapId = mapEntity.getMapEntityKey().getMapId();
				}
				ClusterEntity clusterentity = capabilityDAO.getClusterByClusterId(clusterId, mapId, sectorId);
				if (clusterentity != null && sectorId != null && mapId != null) {

					clusterentity.setClusterNm(clusterName);
					try {
						capabilityDAO.updateCluster(clusterentity);

					} catch (Exception ex) {
						ExceptionMessage exceptionMessage = createExceptionMessage(ex, null, HttpCode._500,
								"coRelationId", "Internal server problem");
						return PostCapabilityMeasureClusterResponse.withJsonInternalServerError(exceptionMessage);
					}
				} else {
					TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
					ExceptionMessage exMessage = new ExceptionMessage();
					ExceptionObject obj = new ExceptionObject();

					obj.setHttpCode(HttpCode._404);
					obj.setMessage("Record Not Found with given criteria : clusterId- " + clusterId + " , mapName- "
							+ mapName + " , sectorName- " + sectorName);
					exMessage.setExceptionObject(obj);
					return PostCapabilityMeasureClusterResponse.withJsonNotFound(exMessage);
				}

			} else {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
				ExceptionMessage exceptionMessage = createExceptionMessage(null, errMsgMap, HttpCode._400,
						"coRelationId", "Bad request for " + cluster.getClusterId());
				return PostCapabilityMeasureClusterResponse.withJsonBadRequest(exceptionMessage);
			}
		}
		PutClusterListResponse resp = new PutClusterListResponse();
		List<String> clusterIds= new ArrayList<String>();
		resp.setResult("Successfully updated");
		for (Cluster cluster : entity.getCluster()) {
			clusterIds.add(cluster.getClusterId());
		}
		resp.setKey("ClusterId's :" + clusterIds.toString());

		return PostCapabilityMeasureClusterResponse.withJsonOK(resp);

	}

	/*
	 * @ExceptionHandler(ClusterNotFoundException.class)
	 * 
	 * @ResponseBody public ClusterNotFoundException
	 * handleException(ClusterNotFoundException ex) { System.out.println(
	 * "exception in handler"); return ex; }
	 */

}