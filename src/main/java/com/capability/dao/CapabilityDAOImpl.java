package com.capability.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capability.entities.CapabilityEntity;
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
 *         The Class CapabilityDAOImpl.
 */

@Component
public class CapabilityDAOImpl implements CapabilityDAO {

	/** The session factory. */
	@Autowired
	private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#getMaps(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<MapEntity> getMaps(String mapType, String searchDesc) throws Exception {

		StringBuffer buf = new StringBuffer();
		if (mapType != null && (searchDesc == null || searchDesc == "" || searchDesc.isEmpty())) {
			buf.append("SELECT * FROM MAP a ");
			buf.append(
					"INNER JOIN(SELECT MAP_ID, MAX(CAST(VERSION_ID AS SIGNED INTEGER)) VERSION_ID FROM MAP GROUP BY MAP_ID) ");
			buf.append("b ON a.MAP_ID = b.MAP_ID AND a.VERSION_ID = b.VERSION_ID ");

			buf.append("WHERE a.MAP_TYP = :mapTypeParam ");
		}

		if (mapType != null && searchDesc != null && searchDesc != "" && !searchDesc.isEmpty()) {

			// buf.append("UNION ");

			buf.append("SELECT * FROM MAP a ");
			buf.append(
					"INNER JOIN(SELECT MAP_ID, MAX(CAST(VERSION_ID AS SIGNED INTEGER)) VERSION_ID FROM MAP GROUP BY MAP_ID) ");
			buf.append("b ON a.MAP_ID = b.MAP_ID AND a.VERSION_ID = b.VERSION_ID ");
			buf.append("WHERE a.MAP_NM like :searchDescParam AND a.MAP_TYP= :mapTypeParam ");

			buf.append("UNION ");

			buf.append("SELECT * FROM MAP a  ");
			buf.append(
					"INNER JOIN(SELECT MAP_ID, MAX(CAST(VERSION_ID AS SIGNED INTEGER)) VERSION_ID FROM MAP GROUP BY MAP_ID) ");
			buf.append("b ON a.MAP_ID = b.MAP_ID AND a.VERSION_ID = b.VERSION_ID ");
			buf.append("WHERE a.MAP_DESC like  :searchDescParam AND a.MAP_TYP= :mapTypeParam");
			buf.append(" UNION ");

			buf.append("SELECT * FROM MAP a  ");
			buf.append(
					"INNER JOIN(SELECT MAP_ID, MAX(CAST(VERSION_ID AS SIGNED INTEGER)) VERSION_ID FROM MAP GROUP BY MAP_ID) ");
			buf.append("b ON a.MAP_ID = b.MAP_ID AND a.VERSION_ID = b.VERSION_ID ");
			buf.append(
					"WHERE a.SECTOR_ID IN (SELECT SECTOR_ID FROM SECTOR where SECTOR like :searchDescParam)AND a.MAP_TYP= :mapTypeParam  ");

		}

		List<MapEntity> mapEntityList = null;

		String queryString = buf.toString();
		SQLQuery queryObject = sessionFactory.getCurrentSession().createSQLQuery(queryString);
		if (mapType != null && mapType != "") {
			queryObject.setParameter("mapTypeParam", mapType);
		}
		if (searchDesc != null && searchDesc != "" && !searchDesc.isEmpty()) {
			queryObject.setParameter("searchDescParam", "%" + searchDesc + "%");
		}
		queryObject.addEntity(MapEntity.class);
		queryObject.setMaxResults(10);
		mapEntityList = (List<MapEntity>) queryObject.list();
		return mapEntityList;
	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#getClusters(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ClusterEntity> getClusters(String mapName, String sectorName) throws Exception {
		String mapId = null;
		String sectorId = getSectorIdBySectorName(sectorName);

		MapEntity mapEntity = getMapEntityByMapName(mapName, sectorId);
		if (mapEntity != null && mapEntity.getMapEntityKey() != null
				&& mapEntity.getMapEntityKey().getMapId() != null) {
			mapId = mapEntity.getMapEntityKey().getMapId();
		}

		List<ClusterEntity> clusterEntityList = null;
		if (mapId != null && sectorId != null) {
			clusterEntityList = getClustersByMapIdSectorId(mapId, sectorId);
		}
		return clusterEntityList;
	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#getCapabilities(java.lang.String, java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CapabilityEntity> getCapabilities(String mapName, String sectorName, String clusterName)
			throws Exception {
		String mapId = null;
		String sectorId = null;
		String clusterId = null;

		sectorId = getSectorIdBySectorName(sectorName);

		MapEntity mapEntity = getMapEntityByMapName(mapName, sectorId);

		if (mapEntity != null && mapEntity.getMapEntityKey() != null
				&& mapEntity.getMapEntityKey().getMapId() != null) {
			mapId = mapEntity.getMapEntityKey().getMapId();
		}

		ClusterEntity clusterEntity = getClusterEntityByMapIdSecorIdClusterName(mapId, sectorId, clusterName);

		if (clusterEntity != null && clusterEntity.getClusterEntityKey().getClusterId() != null) {
			clusterId = clusterEntity.getClusterEntityKey().getClusterId();
		}
		List<CapabilityEntity> capabilityEntityList = null;
		if (mapId != null && sectorId != null && clusterId != null) {
			StringBuffer buf = new StringBuffer();

			buf.append("SELECT a.CAPABILITY_ID,a.CLUSTER_ID,");
			buf.append("a.VERSION_ID,a.MAP_ID,a.SECTOR_ID,a.CAPABILITY_NM,a.TRUNC_CAPABILITY_NM,");
			buf.append("a.CAPABILITY_DESC,a.CAPABILITY_POS,a.HIGH_VALUE,a.CAP_NOTES,a.USR_NM_LAST_UPD,");
			buf.append("a.CREATE_DT,a.LAST_UPDATE_DT	FROM CAPABILITY a ");

			buf.append(
					"INNER JOIN(SELECT CAPABILITY_ID,MAP_ID,SECTOR_ID,CLUSTER_ID,MAX(CAST(VERSION_ID AS SIGNED INTEGER)) VERSION_ID ");
			buf.append(
					"FROM CAPABILITY GROUP BY CAPABILITY_ID,MAP_ID,SECTOR_ID,CLUSTER_ID) b ON a.CAPABILITY_ID = b.CAPABILITY_ID ");
			buf.append(
					"AND a.VERSION_ID = b.VERSION_ID and  a.MAP_ID =b.Map_ID AND a.CLUSTER_ID = b.CLUSTER_ID AND a.SECTOR_ID=b.SECTOR_ID ");
			buf.append(
					" WHERE a.MAP_ID = :mapIdParam AND a.SECTOR_ID = :sectorIdParam AND a.CLUSTER_ID = :clusterIdParam ");

			String queryString = buf.toString();
			SQLQuery queryObject = sessionFactory.getCurrentSession().createSQLQuery(queryString);
			queryObject.setParameter("mapIdParam", mapId);
			queryObject.setParameter("sectorIdParam", sectorId);
			queryObject.setParameter("clusterIdParam", clusterId);
			queryObject.addEntity(CapabilityEntity.class);
			queryObject.setMaxResults(10);
			capabilityEntityList = (List<CapabilityEntity>) queryObject.list();
		}
		return capabilityEntityList;
	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#getSector(java.lang.String)
	 */
	@Override
	public SectorEntity getSector(String sectorId) throws Exception {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(SectorEntity.class);
		criteria.add(Restrictions.eq("sectorId", sectorId));
		SectorEntity sectorEntity = (SectorEntity) criteria.uniqueResult();
		return sectorEntity;

	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#getMapByMapNameSectorName(java.lang.String, java.lang.String)
	 */
	@Override
	public MapEntity getMapByMapNameSectorName(String mapName, String sectorName) throws Exception {

		String sectorId = getSectorIdBySectorName(sectorName);
		MapEntity mapEntity = null;
		if (sectorId != null) {
			mapEntity = getMapEntityByMapName(mapName, sectorId);
		}
		return mapEntity;
	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#archiveMap(com.capability.entities.MapEntity)
	 */
	@Override
	public boolean archiveMap(MapEntity mapEntity) throws Exception {
		mapEntity.setArchiveInd("Y");
		sessionFactory.getCurrentSession().update(mapEntity);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#getPasswordByMapIdSectorId(java.lang.String, java.lang.String)
	 */
	@Override
	public PasswordEntity getPasswordByMapIdSectorId(String mapId, String sectorId) throws Exception {
		PasswordEntity passwordEntity = null;
		StringBuffer passwordBuf = new StringBuffer();
		passwordBuf.append("SELECT * FROM PASSWORD a ");
		passwordBuf.append(
				"INNER JOIN(SELECT MAP_ID, MAX(CAST(VERSION_ID AS SIGNED INTEGER)) VERSION_ID FROM MAP GROUP BY MAP_ID) ");
		passwordBuf.append("b ON a.MAP_ID = b.MAP_ID AND a.VERSION_ID = b.VERSION_ID ");
		passwordBuf.append(" where a.MAP_ID= :mapId AND a.SECTOR_Id= :sectorId ");

		String passwordQueryString = passwordBuf.toString();
		SQLQuery passwordQuery = sessionFactory.getCurrentSession().createSQLQuery(passwordQueryString);
		passwordQuery.setParameter("mapId", mapId);
		passwordQuery.setParameter("sectorId", sectorId);
		passwordQuery.addEntity(PasswordEntity.class);
		passwordEntity = (PasswordEntity) passwordQuery.uniqueResult();
		return passwordEntity;
	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#getMapEntityByMapName(java.lang.String, java.lang.String)
	 */
	@Override
	public MapEntity getMapEntityByMapName(String mapName, String sectorId) {
		StringBuffer bufMapName = new StringBuffer();
		bufMapName.append(
				"SELECT a.VERSION_ID, a.MAP_ID,a.SECTOR_ID,a.MAP_NM,a.MAP_STATUS,a.MAP_DESC,a.MAP_LAST_UPDATE_DT,a.MAP_TYP,a.ARCHIVE_IND,a.USR_NM_LAST_UPD, a.CREATE_DT,a.LAST_UPDATE_DT ");
		bufMapName.append("FROM MAP a ");
		bufMapName.append(
				"INNER JOIN(SELECT MAP_ID, SECTOR_ID,MAX(CAST(VERSION_ID AS SIGNED INTEGER)) VERSION_ID FROM MAP GROUP BY MAP_ID,SECTOR_ID) ");
		bufMapName.append("b ON a.MAP_ID = b.MAP_ID AND a.SECTOR_ID = b.SECTOR_ID AND a.VERSION_ID = b.VERSION_ID ");
		bufMapName.append("WHERE a.MAP_NM = :mapName AND a.SECTOR_ID= :sectorId ");

		MapEntity mapEntity = null;
		String mapNamequeryString = bufMapName.toString();
		SQLQuery mapNameQuery = sessionFactory.getCurrentSession().createSQLQuery(mapNamequeryString);
		mapNameQuery.setParameter("mapName", mapName);
		mapNameQuery.setParameter("sectorId", sectorId);
		mapNameQuery.addEntity(MapEntity.class);
		mapEntity = (MapEntity) mapNameQuery.uniqueResult();
		return mapEntity;

	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#getSectorIdBySectorName(java.lang.String)
	 */
	@Override
	public String getSectorIdBySectorName(String sectorName) {
		String sectorId = null;
		Criteria criteriaSector = sessionFactory.getCurrentSession().createCriteria(SectorEntity.class);
		criteriaSector.add(Restrictions.eq("sector", sectorName));
		SectorEntity sectorEntity = (SectorEntity) criteriaSector.uniqueResult();
		if (sectorEntity != null && sectorEntity.getSectorId() != null) {
			sectorId = sectorEntity.getSectorId();
		}
		return sectorId;

	}

	/**
	 * Gets the clusters by map id sector id.
	 *
	 * @param mapId the map id
	 * @param sectorId the sector id
	 * @return the clusters by map id sector id
	 */
	public List<ClusterEntity> getClustersByMapIdSectorId(String mapId, String sectorId) {

		StringBuffer buf = new StringBuffer();
		buf.append(
				"SELECT a.CLUSTER_ID,a.VERSION_ID, a.MAP_ID, a.SECTOR_ID, a.CLUSTER_NM,a.CLUSTER_POS, a.VALUE_CHAIN_ID, a.USR_NM_LAST_UPD, a.CREATE_DT,a.LAST_UPDATE_DT FROM CLUSTER a ");
		buf.append(
				"INNER JOIN(SELECT CLUSTER_ID,MAP_ID,SECTOR_ID, MAX(CAST(VERSION_ID AS SIGNED INTEGER)) VERSION_ID FROM CLUSTER GROUP BY CLUSTER_ID,MAP_ID,SECTOR_ID) ");
		buf.append(
				"b ON a.MAP_ID = b.MAP_ID AND a.CLUSTER_ID = b.CLUSTER_ID AND a.SECTOR_ID=b.SECTOR_ID AND a.VERSION_ID = b.VERSION_ID ");
		buf.append("WHERE a.MAP_ID = :mapIdParam AND a.SECTOR_ID = :sectorIdParam");

		String queryString = buf.toString();
		SQLQuery queryObject = sessionFactory.getCurrentSession().createSQLQuery(queryString);
		queryObject.setParameter("mapIdParam", mapId);
		queryObject.setParameter("sectorIdParam", sectorId);
		queryObject.addEntity(ClusterEntity.class);
		queryObject.setMaxResults(10);

		List<ClusterEntity> clusterEntityList = (List<ClusterEntity>) queryObject.list();
		return clusterEntityList;

	}

	/**
	 * Gets the cluster entity by map id secor id cluster name.
	 *
	 * @param mapId the map id
	 * @param sectorId the sector id
	 * @param clusterName the cluster name
	 * @return the cluster entity by map id secor id cluster name
	 */
	public ClusterEntity getClusterEntityByMapIdSecorIdClusterName(String mapId, String sectorId, String clusterName) {
		StringBuffer bufClusterName = new StringBuffer();
		bufClusterName.append(
				"SELECT a.CLUSTER_ID,a.VERSION_ID, a.MAP_ID, a.SECTOR_ID, a.CLUSTER_NM,a.CLUSTER_POS, a.VALUE_CHAIN_ID, a.USR_NM_LAST_UPD, a.CREATE_DT,a.LAST_UPDATE_DT FROM CLUSTER a ");
		bufClusterName.append(
				"INNER JOIN(SELECT CLUSTER_ID,MAP_ID,SECTOR_ID, MAX(CAST(VERSION_ID AS SIGNED INTEGER)) VERSION_ID FROM CLUSTER GROUP BY CLUSTER_ID,MAP_ID,SECTOR_ID) ");
		bufClusterName.append(
				"b ON a.MAP_ID = b.MAP_ID AND a.SECTOR_ID = b.SECTOR_ID AND a.CLUSTER_ID = b.CLUSTER_ID AND a.VERSION_ID = b.VERSION_ID ");
		bufClusterName.append("	WHERE a.CLUSTER_NM=:clusterName AND a.MAP_ID=:mapId AND a.SECTOR_ID=:sectorId");

		String queryStringClusterName = bufClusterName.toString();
		SQLQuery queryObjectClusterName = sessionFactory.getCurrentSession().createSQLQuery(queryStringClusterName);
		queryObjectClusterName.setParameter("clusterName", clusterName);
		queryObjectClusterName.setParameter("mapId", mapId);
		queryObjectClusterName.setParameter("sectorId", sectorId);
		queryObjectClusterName.addEntity(ClusterEntity.class);
		ClusterEntity clusterEntity = (ClusterEntity) queryObjectClusterName.uniqueResult();
		return clusterEntity;

	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#getClusterByClusterId(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public ClusterEntity getClusterByClusterId(String clusterId, String mapId, String sectorId) {

		StringBuffer buf = new StringBuffer();
		buf.append("SELECT * FROM CLUSTER a ");
		buf.append(
				"INNER JOIN(SELECT CLUSTER_ID,MAP_ID,SECTOR_ID, MAX(CAST(VERSION_ID AS SIGNED INTEGER)) VERSION_ID FROM CLUSTER GROUP BY CLUSTER_ID,MAP_ID,SECTOR_ID) ");
		buf.append(
				"b ON a.MAP_ID = b.MAP_ID AND a.CLUSTER_ID = b.CLUSTER_ID AND a.SECTOR_ID=b.SECTOR_ID AND a.VERSION_ID = b.VERSION_ID ");
		buf.append("WHERE a.MAP_ID = :mapIdParam AND a.SECTOR_ID = :sectorIdParam AND a.CLUSTER_ID=:clusterIdParam ");

		String queryString = buf.toString();
		SQLQuery queryObject = sessionFactory.getCurrentSession().createSQLQuery(queryString);
		queryObject.setParameter("mapIdParam", mapId);
		queryObject.setParameter("sectorIdParam", sectorId);
		queryObject.setParameter("clusterIdParam", clusterId);
		queryObject.addEntity(ClusterEntity.class);

		ClusterEntity clusterEntity = (ClusterEntity) queryObject.uniqueResult();

		return clusterEntity;
	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#updateCluster(com.capability.entities.ClusterEntity)
	 */
	@Override

	public boolean updateCluster(ClusterEntity clusterEntity) throws Exception {
		sessionFactory.getCurrentSession().update(clusterEntity);
		return true;
	}
	
	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#updateDimentionDesc(com.capability.entities.MaturityDescEntity)
	 */
	@Override
	public boolean updateDimentionDesc(MaturityDescEntity maturityDescEntity) throws Exception {
		sessionFactory.getCurrentSession().saveOrUpdate(maturityDescEntity);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#getMaturityDescList(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<MaturityDescEntity> getMaturityDescList(String mapId, String sectorId, String capabilityId,
			String dimensionId, String versionId) throws Exception {

		StringBuffer buf = new StringBuffer();
		buf.append("SELECT * FROM MATURITY_DESC ");
		buf.append(
				"WHERE MAP_ID = :mapId AND SECTOR_ID = :sectorId AND CAPABILITY_ID=:capabilityId AND DIM_ID=:dimId AND VERSION_ID=:versionId  ");

		String queryString = buf.toString();
		SQLQuery queryObject = sessionFactory.getCurrentSession().createSQLQuery(queryString);
		queryObject.setParameter("mapId", mapId);
		queryObject.setParameter("sectorId", sectorId);
		queryObject.setParameter("capabilityId", capabilityId);
		queryObject.setParameter("versionId", versionId);
		queryObject.setParameter("dimId", dimensionId);
		queryObject.addEntity(MaturityDescEntity.class);

		List<MaturityDescEntity> maturityDescEntityList = queryObject.list();

		return maturityDescEntityList;
	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#getCapability(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public CapabilityEntity getCapability(String capabilityId, String mapId, String sectorId, String versionId)
			throws Exception {

		String strategicChoiceId = null;

		StringBuffer buf = new StringBuffer();
		buf.append("SELECT * FROM CAPABILITY ");
		buf.append(
				"WHERE MAP_ID = :mapId AND SECTOR_ID = :sectorId AND VERSION_ID=:versionId AND CAPABILITY_ID=:capabilityId ");

		String queryString = buf.toString();
		SQLQuery queryObject = sessionFactory.getCurrentSession().createSQLQuery(queryString);
		queryObject.setParameter("mapId", mapId);
		queryObject.setParameter("sectorId", sectorId);
		queryObject.setParameter("versionId", versionId);
		queryObject.setParameter("capabilityId", capabilityId);
		queryObject.addEntity(CapabilityEntity.class);
		CapabilityEntity capabilityEntity = (CapabilityEntity) queryObject.uniqueResult();
		return capabilityEntity;
	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#updateCapability(com.capability.entities.CapabilityEntity)
	 */
	@Override
	public boolean updateCapability(CapabilityEntity capabilityEntity) throws Exception {
		sessionFactory.getCurrentSession().update(capabilityEntity);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#getOverlayXrefEntity(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public OverlayXrefEntity getOverlayXrefEntity(String mapId, String sectorId, String capabilityId, String strategicChoiceId,
			String versionId) throws Exception {

		StringBuffer buf = new StringBuffer();
		
		
		buf.append("SELECT * FROM OVERLAY_XREF ");
		buf.append(
				"WHERE MAP_ID = :mapId AND SECTOR_ID = :sectorId AND VERSION_ID=:versionId AND CAPABILITY_ID=:capabilityId AND STRATEGIC_CHOICE_ID=:strategicChoiceId ");
		String queryString = buf.toString();
		SQLQuery queryObject = sessionFactory.getCurrentSession().createSQLQuery(queryString);
		queryObject.setParameter("mapId", mapId);
		queryObject.setParameter("sectorId", sectorId);
		queryObject.setParameter("versionId", versionId);
		queryObject.setParameter("capabilityId", capabilityId);
		queryObject.setParameter("strategicChoiceId", strategicChoiceId);
		queryObject.addEntity(OverlayXrefEntity.class);
		OverlayXrefEntity overlayXrefEntity = (OverlayXrefEntity) queryObject.uniqueResult();
		return overlayXrefEntity;
	}

	/* (non-Javadoc)
	 * @see com.capability.dao.CapabilityDAO#updateOverLatXref(com.capability.entities.OverlayXrefEntity)
	 */
	@Override
	public boolean updateOverLatXref(OverlayXrefEntity overlayXrefEntity) throws Exception {
		sessionFactory.getCurrentSession().update(overlayXrefEntity);
		return true;
	}

	

}
