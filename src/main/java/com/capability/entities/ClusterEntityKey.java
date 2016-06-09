package com.capability.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the cluster database table.
 * 
 */
@Embeddable
public class ClusterEntityKey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CLUSTER_ID")
	private String clusterId;

	@Column(name="VERSION_ID")
	private String versionId;

	@Column(name="SECTOR_ID")
	private String sectorId;

	@Column(name="MAP_ID")
	private String mapId;

	public ClusterEntityKey() {
	}
	public String getClusterId() {
		return this.clusterId;
	}
	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}
	public String getVersionId() {
		return this.versionId;
	}
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}
	public String getSectorId() {
		return this.sectorId;
	}
	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}
	public String getMapId() {
		return this.mapId;
	}
	public void setMapId(String mapId) {
		this.mapId = mapId;
	}

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