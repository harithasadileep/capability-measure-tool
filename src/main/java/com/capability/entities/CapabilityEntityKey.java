package com.capability.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the capability database table.
 * 
 */
@Embeddable
public class CapabilityEntityKey implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CAPABILITY_ID")
	private String capabilityId;

	@Column(name="MAP_ID")
	private String mapId;

	@Column(name="VERSION_ID")
	private String versionId;

	@Column(name="SECTOR_ID")
	private String sectorId;

	public CapabilityEntityKey() {
	}
	public String getCapabilityId() {
		return this.capabilityId;
	}
	public void setCapabilityId(String capabilityId) {
		this.capabilityId = capabilityId;
	}
	public String getMapId() {
		return this.mapId;
	}
	public void setMapId(String mapId) {
		this.mapId = mapId;
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CapabilityEntityKey)) {
			return false;
		}
		CapabilityEntityKey castOther = (CapabilityEntityKey)other;
		return 
			this.capabilityId.equals(castOther.capabilityId)
			&& this.mapId.equals(castOther.mapId)
			&& this.versionId.equals(castOther.versionId)
			&& this.sectorId.equals(castOther.sectorId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.capabilityId.hashCode();
		hash = hash * prime + this.mapId.hashCode();
		hash = hash * prime + this.versionId.hashCode();
		hash = hash * prime + this.sectorId.hashCode();
		
		return hash;
	}
}