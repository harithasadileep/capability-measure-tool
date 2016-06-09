package com.capability.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the password database table.
 * 
 */
@Embeddable
public class PasswordEntityKey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="MAP_ID", insertable=false, updatable=false)
	private String mapId;

	@Column(name="VERSION_ID", insertable=false, updatable=false)
	private String versionId;

	@Column(name="SECTOR_ID", insertable=false, updatable=false)
	private String sectorId;

	public PasswordEntityKey() {
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
		if (!(other instanceof PasswordEntityKey)) {
			return false;
		}
		PasswordEntityKey castOther = (PasswordEntityKey)other;
		return 
			this.mapId.equals(castOther.mapId)
			&& this.versionId.equals(castOther.versionId)
			&& this.sectorId.equals(castOther.sectorId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.mapId.hashCode();
		hash = hash * prime + this.versionId.hashCode();
		hash = hash * prime + this.sectorId.hashCode();
		
		return hash;
	}
}