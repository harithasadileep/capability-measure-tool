package com.capability.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author dsomajohassula
 * 
 * The primary key class for the DIMENSION_SPECIFIC database table.
 * 
 */
@Embeddable
public class DimensionSpecificEntityKey implements Serializable {
	
	/** The Constant serialVersionUID. */
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	/** The capability id. */
	@Column(name="CAPABILITY_ID")
	private String capabilityId;

	/** The map id. */
	@Column(name="MAP_ID")
	private String mapId;

	/** The version id. */
	@Column(name="VERSION_ID")
	private String versionId;

	/** The sector id. */
	@Column(name="SECTOR_ID")
	private String sectorId;

	/** The dim id. */
	@Column(name="DIM_ID")
	private String dimId;

	/**
	 * Instantiates a new dimension specific pk.
	 */
	public DimensionSpecificEntityKey() {
	}
	
	/**
	 * Gets the capability id.
	 *
	 * @return the capability id
	 */
	public String getCapabilityId() {
		return this.capabilityId;
	}
	
	/**
	 * Sets the capability id.
	 *
	 * @param capabilityId the new capability id
	 */
	public void setCapabilityId(String capabilityId) {
		this.capabilityId = capabilityId;
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
	 * Gets the dim id.
	 *
	 * @return the dim id
	 */
	public String getDimId() {
		return this.dimId;
	}
	
	/**
	 * Sets the dim id.
	 *
	 * @param dimId the new dim id
	 */
	public void setDimId(String dimId) {
		this.dimId = dimId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DimensionSpecificEntityKey)) {
			return false;
		}
		DimensionSpecificEntityKey castOther = (DimensionSpecificEntityKey)other;
		return 
			this.capabilityId.equals(castOther.capabilityId)
			&& this.mapId.equals(castOther.mapId)
			&& this.versionId.equals(castOther.versionId)
			&& this.sectorId.equals(castOther.sectorId)
			&& this.dimId.equals(castOther.dimId);
	}

	/* (non-Javadoc)
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
		
		return hash;
	}
}