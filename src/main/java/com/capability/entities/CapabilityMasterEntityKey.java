package com.capability.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;

/**
 * @author dsomajohassula
 * 
 *         The primary key class for the CapabilityMaster database table.
 * 
 */
@Embeddable
public class CapabilityMasterEntityKey implements Serializable {

	/** The Constant serialVersionUID. */

	private static final long serialVersionUID = 1L;

	/** The capability id. */
	@Column(name = "CAPABILITY_ID")
	private String capabilityId;

	/** The map id. */
	@Column(name = "MAP_ID")
	private String mapId;

	/** The version id. */
	@Column(name = "VERSION_ID")
	private String versionId;

	/** The sector id. */
	@Column(name = "SECTOR_ID")
	private String sectorId;

	/** The cluster id. */
	@Column(name = "CLUSTER_ID")
	private String clusterId;

	/** The dim id. */
	@Column(name = "DIM_ID")
	private String dimId;
	
	/**
	 * Instantiates a new capability entity key.
	 */
	public CapabilityMasterEntityKey() {
	}

	public String getCapabilityId() {
		return capabilityId;
	}

	public void setCapabilityId(String capabilityId) {
		this.capabilityId = capabilityId;
	}

	public String getMapId() {
		return mapId;
	}

	public void setMapId(String mapId) {
		this.mapId = mapId;
	}

	public String getVersionId() {
		return versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}

	public String getClusterId() {
		return clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getDimId() {
		return dimId;
	}

	public void setDimId(String dimId) {
		this.dimId = dimId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CapabilityMasterEntityKey)) {
			return false;
		}
		CapabilityMasterEntityKey castOther = (CapabilityMasterEntityKey) other;
		return this.capabilityId.equals(castOther.capabilityId) && this.mapId.equals(castOther.mapId)
				&& this.versionId.equals(castOther.versionId) && this.sectorId.equals(castOther.sectorId)
				&& this.clusterId.equals(castOther.clusterId) 
				&& this.dimId.equals(castOther.dimId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.capabilityId.hashCode();
		hash = hash * prime + this.mapId.hashCode();
		hash = hash * prime + this.versionId.hashCode();
		hash = hash * prime + this.sectorId.hashCode();
		hash = hash * prime + this.dimId.hashCode();
		hash = hash * prime + this.clusterId.hashCode();
		return hash;
	}
}