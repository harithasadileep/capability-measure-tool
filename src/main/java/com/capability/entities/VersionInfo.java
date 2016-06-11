package com.capability.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



/**
 * @author dsomajohassula
 * 
 * The persistent class for the VERSION_INFO database table.
 * 
 */
@Entity
@Table(name="VERSION_INFO")
@NamedQuery(name="VersionInfo.findAll", query="SELECT v FROM VersionInfo v")
public class VersionInfo implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The map nm. */
	@Column(name="MAP_NM")
	private String mapNm;

	/** The version id. */
	@Column(name="VERSION_ID")
	private String versionId;

	/**
	 * Instantiates a new version info.
	 */
	public VersionInfo() {
	}

	/**
	 * Gets the map nm.
	 *
	 * @return the map nm
	 */
	public String getMapNm() {
		return this.mapNm;
	}

	/**
	 * Sets the map nm.
	 *
	 * @param mapNm the new map nm
	 */
	public void setMapNm(String mapNm) {
		this.mapNm = mapNm;
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

}