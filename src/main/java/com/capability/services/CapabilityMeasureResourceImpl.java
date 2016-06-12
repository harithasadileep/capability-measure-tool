package com.capability.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.capability.dao.CapabilityDAO;
import com.capability.entities.CapabilityEntity;
import com.capability.entities.CapabilityMasterEntity;
import com.capability.entities.ClusterEntity;
import com.capability.entities.MapEntity;
import com.capability.entities.MaturityDescEntity;
import com.capability.entities.OverlayXrefEntity;
import com.capability.entities.PasswordEntity;
import com.capability.entities.SectorEntity;
import com.capability.mapper.CustomBeanConverter;
import com.capability.mapper.DozerHelper;
import com.capability.mapper.GenericValidator;
import com.capability.raml.model.Capability;
import com.capability.raml.model.CapabilityMaturity;
import com.capability.raml.model.CapabilityNote;
import com.capability.raml.model.Cause;
import com.capability.raml.model.Cluster;
import com.capability.raml.model.ClusterView;
import com.capability.raml.model.DimensionMaturity;
import com.capability.raml.model.DimensionMaturityNote;
import com.capability.raml.model.ExceptionMessage;
import com.capability.raml.model.ExceptionObject;
import com.capability.raml.model.ExceptionObject.HttpCode;
import com.capability.raml.model.GetClusterViewResponse;
import com.capability.raml.model.GetMapViewResponse;
import com.capability.raml.model.GetMapsResponse;
import com.capability.raml.model.Map;
import com.capability.raml.model.MapView;
import com.capability.raml.model.OverLayXRef;
import com.capability.raml.model.PutCapabilityDetails;
import com.capability.raml.model.PutCapabilityDimensionNotes;
import com.capability.raml.model.PutClusterListResponse;
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

	/** The capability dao. */
	@Autowired
	private CapabilityDAO capabilityDAO;

	/** The custom bean converter. */
	@Autowired
	private CustomBeanConverter customBeanConverter;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.capability.raml.resource.CapabilityMeasureResource#
	 * getCapabilityMeasureMapViewByMapNameBySectorName(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.capability.raml.resource.CapabilityMeasureResource#
	 * getCapabilityMeasureMaps(java.lang.String, java.lang.String)
	 */
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.capability.raml.resource.CapabilityMeasureResource#
	 * getCapabilityMeasureClusterViewByMapNameBySectorNameByClusterName(java.
	 * lang.String, java.lang.String, java.lang.String)
	 */
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

	/**
	 * Creates the exception message.
	 *
	 * @param exception
	 *            the exception
	 * @param errorMessageMap
	 *            the error message map
	 * @param httpCode
	 *            the http code
	 * @param coRelationId
	 *            the co relation id
	 * @param message
	 *            the message
	 * @return the exception message
	 */
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.capability.raml.resource.CapabilityMeasureResource#
	 * postCapabilityMeasureArchiveByMapNameBySectorName(java.lang.String,
	 * java.lang.String)
	 */
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.capability.raml.resource.CapabilityMeasureResource#
	 * postCapabilityMeasureCluster(com.capability.raml.model.PutClustrList)
	 */
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
						TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
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
		List<String> clusterIds = new ArrayList<String>();
		resp.setResult("Successfully updated");
		for (Cluster cluster : entity.getCluster()) {
			clusterIds.add(cluster.getClusterId());
		}
		resp.setKey("ClusterId's :" + clusterIds.toString());

		return PostCapabilityMeasureClusterResponse.withJsonOK(resp);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.capability.raml.resource.CapabilityMeasureResource#
	 * postCapabilityMeasureCapabilityDetailsUpdate(com.capability.raml.model.
	 * PutCapabilityDetails)
	 */
	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED)
	public PostCapabilityMeasureCapabilityDetailsUpdateResponse postCapabilityMeasureCapabilityDetailsUpdate(
			PutCapabilityDetails entity) throws Exception {
		DimensionMaturity mDesc = entity.getDimensionMaturity();
		OverLayXRef xRef = entity.getOverLayXRef();
		Capability capability = entity.getCapability();
		CapabilityMaturity capabilityMeturity = entity.getCapabilityMaturity();
		String capabilityMetDesc = capabilityMeturity.getMaturityDesc();
		String capabilityName = capability.getCapabilityNm();
		String capabilityDesc = capability.getCapabilityDesc();
		String capabilityId = mDesc.getCapabilityId();
		String mapId = mDesc.getMapId();
		String sectorId = mDesc.getSectorId();
		String dimensionId = mDesc.getDimensionId();
		String meturityId = mDesc.getMaturityId();
		String dimMeturityDesc = mDesc.getMaturityDesc();
		String versionId = mDesc.getVersionId();
		String serviceDelivery = xRef.getServiceDelivery();
		String strategicChoiceId = xRef.getStrategicChoiceId();
		String performanceMeturity = xRef.getPerformanceMaturity();
		String strategicPriority = xRef.getStrategicPriority();
		String scope = xRef.getScope();
		CapabilityEntity capabilityEntity = null;
		OverlayXrefEntity overlayXrefEntity = null;
		if (capabilityId != null && mapId != null && sectorId != null && meturityId != null && versionId != null
				&& strategicChoiceId != null) {
			try {
				capabilityEntity = capabilityDAO.getCapability(capabilityId, mapId, sectorId, versionId);
				if (capabilityEntity != null) {
					capabilityEntity.setCapabilityNm(capabilityName);
					capabilityEntity.setCapabilityDesc(capabilityDesc);
					capabilityDAO.updateCapability(capabilityEntity);
				} else {
					ExceptionMessage exMessage = new ExceptionMessage();
					ExceptionObject obj = new ExceptionObject();
					obj.setHttpCode(HttpCode._404);
					obj.setMessage("Capability Not Found with given criteria : capabilityId- " + capabilityId
							+ " , mapId- " + mapId + " , sectorId- " + sectorId + " , versionId- " + versionId);
					exMessage.setExceptionObject(obj);
					return PostCapabilityMeasureCapabilityDetailsUpdateResponse.withJsonNotFound(exMessage);
				}
				overlayXrefEntity = capabilityDAO.getOverlayXrefEntity(mapId, sectorId, capabilityId, strategicChoiceId,
						versionId);
				if (overlayXrefEntity != null) {
					overlayXrefEntity.setPerformanceMaturity(performanceMeturity);
					overlayXrefEntity.setServiceDelivery(serviceDelivery);
					overlayXrefEntity.setStrategicPriority(strategicPriority);
					overlayXrefEntity.setScope(scope);
					capabilityDAO.updateOverLatXref(overlayXrefEntity);
				} else {
					TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
					ExceptionMessage exMessage = new ExceptionMessage();
					ExceptionObject obj = new ExceptionObject();
					obj.setHttpCode(HttpCode._404);
					obj.setMessage("OverlayXref Not Found with given criteria : capabilityId- " + capabilityId
							+ " , mapId- " + mapId + " , sectorId- " + sectorId + " , versionId- " + versionId
							+ " , strategicChoiceId- " + strategicChoiceId);
					exMessage.setExceptionObject(obj);
					return PostCapabilityMeasureCapabilityDetailsUpdateResponse.withJsonNotFound(exMessage);
				}
				List<MaturityDescEntity> maturityDescEntityList = null;
				maturityDescEntityList = capabilityDAO.getMaturityDescList(mapId, sectorId, capabilityId, dimensionId,
						versionId);
				if (capabilityMetDesc != null) {
					maturityDescEntityList = capabilityDAO.getMaturityDescList(mapId, sectorId, capabilityId,
							dimensionId, versionId);
					overlayXrefEntity = capabilityDAO.getOverlayXrefEntity(mapId, sectorId, capabilityId,
							strategicChoiceId, versionId);
					String performanceMaturity = overlayXrefEntity.getPerformanceMaturity();
					if (maturityDescEntityList != null && maturityDescEntityList.size() > 0) {
						for (MaturityDescEntity maturityDescEntity2 : maturityDescEntityList) {
							String type = maturityDescEntity2.getMaturityTyp();
							if (type.substring(8, type.length()).equalsIgnoreCase(performanceMaturity)) {
								maturityDescEntity2.setElementId(capabilityMetDesc);
								capabilityDAO.updateDimentionDesc(maturityDescEntity2);
							}
						}
					}
				}
				if (dimMeturityDesc != null) {
					maturityDescEntityList = capabilityDAO.getMaturityDescList(mapId, sectorId, capabilityId,
							dimensionId, versionId);
					overlayXrefEntity = capabilityDAO.getOverlayXrefEntity(mapId, sectorId, capabilityId,
							strategicChoiceId, versionId);
					String performanceMaturity = overlayXrefEntity.getPerformanceMaturity();
					if (maturityDescEntityList != null && maturityDescEntityList.size() > 0) {
						for (MaturityDescEntity maturityDescEntity2 : maturityDescEntityList) {
							String type = maturityDescEntity2.getMaturityTyp();
							if (type.substring(8, type.length()).equalsIgnoreCase(performanceMaturity)) {
								maturityDescEntity2.setMaturityDesc(dimMeturityDesc);
								capabilityDAO.updateDimentionDesc(maturityDescEntity2);
							}
						}
					}
				}
			} catch (Exception ex) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
				ExceptionMessage exceptionMessage = createExceptionMessage(ex, null, HttpCode._500, "coRelationId",
						"Internal server problem");
				return PostCapabilityMeasureCapabilityDetailsUpdateResponse.withJsonNotFound(exceptionMessage);
			}
		}
		PutMapsResponse response = new PutMapsResponse();
		response.setResult("Successfully Updated");
		return PostCapabilityMeasureCapabilityDetailsUpdateResponse.withJsonOK(response);
	}

	/* (non-Javadoc)
	 * @see com.capability.raml.resource.CapabilityMeasureResource#postCapabilityMeasureCapabilityDimensionNote(com.capability.raml.model.PutCapabilityDimensionNotes)
	 */
	@Override
	@Transactional
	public PostCapabilityMeasureCapabilityDimensionNoteResponse postCapabilityMeasureCapabilityDimensionNote(
			PutCapabilityDimensionNotes putCapabilityDimensionNotes) throws Exception {
		CapabilityNote capabilityNote = putCapabilityDimensionNotes.getCapabilityNote();
		List<DimensionMaturityNote> dimensionMaturityNoteList = putCapabilityDimensionNotes.getDimensionMaturityNote();
		String mapId = capabilityNote.getMapId();
		String sectorId = capabilityNote.getSectorId();
		String capabilityId = capabilityNote.getCapabilityId();
		String versionId = capabilityNote.getVersionId();
		String capNotes = capabilityNote.getCapNotes();
		if (capabilityNote != null && capabilityNote.getCapabilityId() != null && capabilityNote.getMapId() != null
				&& capabilityNote.getSectorId() != null && capabilityNote.getVersionId() != null) {
			try {
				if (capNotes != null) {
					CapabilityEntity capabilityEntity = capabilityDAO.getCapability(capabilityId, mapId, sectorId,
							versionId);
					if (capabilityEntity != null) {
						capabilityEntity.setCapNotes(capNotes);
						capabilityDAO.updateCapability(capabilityEntity);
					} else {
						ExceptionMessage exMessage = new ExceptionMessage();
						ExceptionObject obj = new ExceptionObject();
						obj.setHttpCode(HttpCode._404);
						obj.setMessage("Capability Not Found with given criteria : capabilityId- " + capabilityId
								+ " , mapId- " + mapId + " , sectorId- " + sectorId + " , versionId- " + versionId);
						exMessage.setExceptionObject(obj);
						return PostCapabilityMeasureCapabilityDimensionNoteResponse.withJsonNotFound(exMessage);
					}
				}
				if (dimensionMaturityNoteList != null && dimensionMaturityNoteList.size() > 0) {
					for (DimensionMaturityNote dimensionMaturityNote : dimensionMaturityNoteList) {
						if (dimensionMaturityNote.getDimNotes() != null) {
							String clusterId = dimensionMaturityNote.getClusterId();
							String dimId = dimensionMaturityNote.getDimId();
							String dimNotes = dimensionMaturityNote.getDimNotes();
							CapabilityMasterEntity capabilityMasterEntity = capabilityDAO.getCapabilityMaster(mapId,
									sectorId, clusterId, capabilityId, dimId, versionId);
							if (capabilityMasterEntity != null) {
								capabilityMasterEntity.setDimensionNotes(dimNotes);
								capabilityDAO.updateCapabilityMaster(capabilityMasterEntity);
							} else {
								ExceptionMessage exMessage = new ExceptionMessage();
								ExceptionObject obj = new ExceptionObject();
								obj.setHttpCode(HttpCode._404);
								obj.setMessage(
										"CapabilityMaster Not Found with given criteria : capabilityId- " + capabilityId
												+ " , mapId- " + mapId + " , sectorId- " + sectorId + " , clusterId- "
												+ clusterId + " , dimId- " + dimId + " , versionId- " + versionId);
								exMessage.setExceptionObject(obj);
								return PostCapabilityMeasureCapabilityDimensionNoteResponse.withJsonNotFound(exMessage);
							}
						}
					}
				}
			} catch (Exception ex) {
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
				ExceptionMessage exceptionMessage = createExceptionMessage(ex, null, HttpCode._500, "coRelationId",
						"Internal server problem");
				return PostCapabilityMeasureCapabilityDimensionNoteResponse.withJsonNotFound(exceptionMessage);
			}
		}
		PutMapsResponse response = new PutMapsResponse();
		response.setResult("Capability Notes & Dimension Notes updated successfully");
		response.setKey(mapId + " " + sectorId + " " + capabilityId);
		return PostCapabilityMeasureCapabilityDimensionNoteResponse.withJsonOK(response);
	}
}