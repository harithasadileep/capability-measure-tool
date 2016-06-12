package com.capability.dao;

import java.util.List;

import com.capability.entities.CapabilityEntity;
import com.capability.entities.CapabilityMasterEntity;
import com.capability.entities.ClusterEntity;
import com.capability.entities.MapEntity;
import com.capability.entities.MaturityDescEntity;
import com.capability.entities.OverlayXrefEntity;
import com.capability.entities.PasswordEntity;
import com.capability.entities.SectorEntity;

/**
 *
 * @author dsomajohassula
 * 
 *         The Interface CapabilityDAO.
 */
public interface CapabilityDAO {

	/**
	 * Gets the maps.
	 *
	 * @param mapType
	 *            the map type
	 * @param searchDesc
	 *            the search desc
	 * @return the maps
	 * @throws Exception
	 *             the exception
	 */
	public List<MapEntity> getMaps(String mapType, String searchDesc) throws Exception;

	/**
	 * Gets the clusters.
	 *
	 * @param mapName
	 *            the map name
	 * @param sectorName
	 *            the sector name
	 * @return the clusters
	 * @throws Exception
	 *             the exception
	 */
	public List<ClusterEntity> getClusters(String mapName, String sectorName) throws Exception;

	/**
	 * Gets the capabilities.
	 *
	 * @param mapName
	 *            the map name
	 * @param sectorName
	 *            the sector name
	 * @param clusterName
	 *            the cluster name
	 * @return the capabilities
	 * @throws Exception
	 *             the exception
	 */
	public List<CapabilityEntity> getCapabilities(String mapName, String sectorName, String clusterName)
			throws Exception;

	/**
	 * Gets the sector.
	 *
	 * @param sectorId
	 *            the sector id
	 * @return the sector
	 * @throws Exception
	 *             the exception
	 */
	public SectorEntity getSector(String sectorId) throws Exception;

	/**
	 * Gets the map by map name sector name.
	 *
	 * @param mapName
	 *            the map name
	 * @param sectorName
	 *            the sector name
	 * @return the map by map name sector name
	 * @throws Exception
	 *             the exception
	 */
	public MapEntity getMapByMapNameSectorName(String mapName, String sectorName) throws Exception;

	/**
	 * Archive map.
	 *
	 * @param mapEntity
	 *            the map entity
	 * @return true, if successful
	 * @throws Exception
	 *             the exception
	 */
	public boolean archiveMap(MapEntity mapEntity) throws Exception;

	/**
	 * Gets the password by map id sector id.
	 *
	 * @param mapId
	 *            the map id
	 * @param sectorId
	 *            the sector id
	 * @return the password by map id sector id
	 * @throws Exception
	 *             the exception
	 */
	public PasswordEntity getPasswordByMapIdSectorId(String mapId, String sectorId) throws Exception;

	/**
	 * Gets the sector id by sector name.
	 *
	 * @param sectorName
	 *            the sector name
	 * @return the sector id by sector name
	 */
	public String getSectorIdBySectorName(String sectorName);

	/**
	 * Gets the map entity by map name.
	 *
	 * @param mapName
	 *            the map name
	 * @param sectorId
	 *            the sector id
	 * @return the map entity by map name
	 */
	public MapEntity getMapEntityByMapName(String mapName, String sectorId);

	/**
	 * Gets the cluster by cluster id.
	 *
	 * @param clusterId
	 *            the cluster id
	 * @param mapId
	 *            the map id
	 * @param sectorId
	 *            the sector id
	 * @return the cluster by cluster id
	 */
	public ClusterEntity getClusterByClusterId(String clusterId, String mapId, String sectorId);

	/**
	 * Update cluster.
	 *
	 * @param clusterEntity
	 *            the cluster entity
	 * @return true, if successful
	 * @throws Exception
	 *             the exception
	 */
	public boolean updateCluster(ClusterEntity clusterEntity) throws Exception;

	/**
	 * Update dimention desc.
	 *
	 * @param maturityDescEntity
	 *            the maturity desc entity
	 * @return true, if successful
	 * @throws Exception
	 *             the exception
	 */
	public boolean updateDimentionDesc(MaturityDescEntity maturityDescEntity) throws Exception;

	/**
	 * Gets the maturity desc list.
	 *
	 * @param mapId
	 *            the map id
	 * @param sectorId
	 *            the sector id
	 * @param capabilityId
	 *            the capability id
	 * @param meturityId
	 *            the meturity id
	 * @param versionId
	 *            the version id
	 * @return the maturity desc list
	 * @throws Exception
	 *             the exception
	 */
	public List<MaturityDescEntity> getMaturityDescList(String mapId, String sectorId, String capabilityId,
			String meturityId, String versionId) throws Exception;

	/**
	 * Gets the capability.
	 *
	 * @param capabilityId
	 *            the capability id
	 * @param mapId
	 *            the map id
	 * @param sectorId
	 *            the sector id
	 * @param versionId
	 *            the version id
	 * @return the capability
	 * @throws Exception
	 *             the exception
	 */
	public CapabilityEntity getCapability(String capabilityId, String mapId, String sectorId, String versionId)
			throws Exception;

	/**
	 * Update capability.
	 *
	 * @param capabilityEntity
	 *            the capability entity
	 * @return true, if successful
	 * @throws Exception
	 *             the exception
	 */
	public boolean updateCapability(CapabilityEntity capabilityEntity) throws Exception;

	/**
	 * Gets the overlay xref entity.
	 *
	 * @param mapId
	 *            the map id
	 * @param sectorId
	 *            the sector id
	 * @param capabilityId
	 *            the capability id
	 * @param strategicChoiceId
	 *            the strategic choice id
	 * @param versionId
	 *            the version id
	 * @return the overlay xref entity
	 * @throws Exception
	 *             the exception
	 */
	public OverlayXrefEntity getOverlayXrefEntity(String mapId, String sectorId, String capabilityId,
			String strategicChoiceId, String versionId) throws Exception;

	/**
	 * Update over lat xref.
	 *
	 * @param overlayXrefEntity
	 *            the overlay xref entity
	 * @return true, if successful
	 * @throws Exception
	 *             the exception
	 */
	public boolean updateOverLatXref(OverlayXrefEntity overlayXrefEntity) throws Exception;

	/**
	 * Gets the capability master.
	 *
	 * @param mapId
	 *            the map id
	 * @param sectorId
	 *            the sector id
	 * @param clusterId
	 *            the cluster id
	 * @param capabilityId
	 *            the capability id
	 * @param dimId
	 *            the dim id
	 * @param versionId
	 *            the version id
	 * @return the capability master
	 */
	public CapabilityMasterEntity getCapabilityMaster(String mapId, String sectorId, String clusterId,
			String capabilityId, String dimId, String versionId) throws Exception;

	/**
	 * Update capability master.
	 *
	 * @param capabilityMasterEntity
	 *            the capability master entity
	 * @return true, if successful
	 * @throws Exception
	 *             the exception
	 */
	public boolean updateCapabilityMaster(CapabilityMasterEntity capabilityMasterEntity) throws Exception;

}
