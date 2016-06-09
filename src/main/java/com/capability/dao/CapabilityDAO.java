package com.capability.dao;

import java.util.List;

import com.capability.entities.CapabilityEntity;
import com.capability.entities.ClusterEntity;
import com.capability.entities.MapEntity;
import com.capability.entities.PasswordEntity;
import com.capability.entities.SectorEntity;

/**
 *
 * @author dsomajohassula
 * 
 *         The Interface CapabilityDAO.
 */
public interface CapabilityDAO {

	public List<MapEntity> getMaps(String mapType, String searchDesc) throws Exception;
	
	public List<ClusterEntity> getClusters(String mapName, String sectorName) throws Exception;
	
	public List<CapabilityEntity> getCapabilities(String mapName, String sectorName, String clusterName) throws Exception;
	
	public SectorEntity getSector(String sectorId) throws Exception;
	
	public MapEntity getMapByMapNameSectorName(String mapName,String sectorName) throws Exception;
	
	public boolean archiveMap(MapEntity mapEntity) throws Exception;
	
	public PasswordEntity getPasswordByMapIdSectorId(String mapId,String sectorId) throws Exception;
	
	public String getSectorIdBySectorName(String sectorName);
	
	public MapEntity getMapEntityByMapName(String mapName, String sectorId) ;

	public ClusterEntity getClusterByClusterId(String clusterId, String mapId, String sectorId);
	
	public boolean updateCluster(ClusterEntity clusterEntity) throws Exception;

}
