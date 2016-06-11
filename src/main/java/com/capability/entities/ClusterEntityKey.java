
package com.capability.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author dsomajohassula
 * 
 * The primary key class for the cluster database table.
 * 
 */
@Embeddable
public class ClusterEntityKey implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The cluster id. */
	@Column(name="CLUSTER_ID")
	private String clusterId;

	/** The version id. */
	@Column(name="VERSION_ID")
	private String versionId;

	/** The sector id. */
	@Column(name="SECTOR_ID")
	private String sectorId;

	/** The map id. */
	@Column(name="MAP_ID")
	private String mapId;

	/**
	 * Instantiates a new cluster entity key.
	 */
	public ClusterEntityKey() {
	}
	
	/**
	 * Gets the cluster id.
	 *
	 * @return the cluster id
	 */
	public String getClusterId() {
		return this.clusterId;
	}
	
	/**
	 * Sets the cluster id.
	 *
	 * @param clusterId the new cluster id
	 */
	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}
	
	/**
	 * Gets the version id.
	 *
	 * @return the version id
	 */
	public String getVersionId() {
		return this.versionId;
	}
	
	/**
	 * Sets the version id.
	 *
	 * @param versionId the new version id
	 */
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}
	
	/**
	 * Gets the sector id.
	 *
	 * @return the sector id
	 */
	public String getSectorId() {
		return this.sectorId;
	}
	
	/**
	 * Sets the sector id.
	 *
	 * @param sectorId the new sector id
	 */
	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}
	
	/**
	 * Gets the map id.
	 *
	 * @return the map id
	 */
	public String getMapId() {
		return this.mapId;
	}
	
	/**
	 * Sets the map id.
	 *
	 * @param mapId the new map id
	 */
	public void setMapId(String mapId) {
		this.mapId = mapId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ClusterEntityKey)) {
			return false;
		}
		ClusterEntityKey castOther = (ClusterEntityKey)other;
		return 
			this.clusterId.equals(castOther.clusterId)
			&& this.versionId.equals(castOther.versionId)
			&& this.sectorId.equals(castOther.sectorId)
			&& this.mapId.equals(castOther.mapId);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.clusterId.hashCode();
		hash = hash * prime + this.versionId.hashCode();
		hash = hash * prime + this.sectorId.hashCode();
		hash = hash * prime + this.mapId.hashCode();
		
		return hash;
	}
}