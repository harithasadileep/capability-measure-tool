package com.capability.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author dsomajohassula
 * 
 * The persistent class for the map database table.
 * 
 */
@Entity
@Table(name = "MAP")
public class MapEntity implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The map entity key. */
	@EmbeddedId
	private MapEntityKey mapEntityKey;

	/** The archive ind. */
	@Column(name = "ARCHIVE_IND")
	private String archiveInd;

	/** The create dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DT")
	private Date createDt;

	/** The last update dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATE_DT")
	private Date lastUpdateDt;

	/** The map desc. */
	@Column(name = "MAP_DESC")
	private String mapDesc;

	/** The map last update dt. */
	@Column(name = "MAP_LAST_UPDATE_DT")
	private String mapLastUpdateDt;

	/** The map nm. */
	@Column(name = "MAP_NM")
	private String mapNm;

	/** The map status. */
	@Column(name = "MAP_STATUS")
	private String mapStatus;

	/** The map typ. */
	@Column(name = "MAP_TYP")
	private String mapTyp;

	/** The usr nm last upd. */
	@Column(name = "USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	/**
	 * Instantiates a new map entity.
	 */
	public MapEntity() {
	}

	/**
	 * Gets the map entity key.
	 *
	 * @return the map entity key
	 */
	public MapEntityKey getMapEntityKey() {
		return mapEntityKey;
	}

	/**
	 * Sets the map entity key.
	 *
	 * @param mapEntityKey the new map entity key
	 */
	public void setMapEntityKey(MapEntityKey mapEntityKey) {
		this.mapEntityKey = mapEntityKey;
	}

	/**
	 * Gets the archive ind.
	 *
	 * @return the archive ind
	 */
	public String getArchiveInd() {
		return this.archiveInd;
	}

	/**
	 * Sets the archive ind.
	 *
	 * @param archiveInd the new archive ind
	 */
	public void setArchiveInd(String archiveInd) {
		this.archiveInd = archiveInd;
	}

	/**
	 * Gets the creates the dt.
	 *
	 * @return the creates the dt
	 */
	public Date getCreateDt() {
		return this.createDt;
	}

	/**
	 * Sets the creates the dt.
	 *
	 * @param createDt the new creates the dt
	 */
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	/**
	 * Gets the last update dt.
	 *
	 * @return the last update dt
	 */
	public Date getLastUpdateDt() {
		return this.lastUpdateDt;
	}

	/**
	 * Sets the last update dt.
	 *
	 * @param lastUpdateDt the new last update dt
	 */
	public void setLastUpdateDt(Date lastUpdateDt) {
		this.lastUpdateDt = lastUpdateDt;
	}

	/**
	 * Gets the map desc.
	 *
	 * @return the map desc
	 */
	public String getMapDesc() {
		return this.mapDesc;
	}

	/**
	 * Sets the map desc.
	 *
	 * @param mapDesc the new map desc
	 */
	public void setMapDesc(String mapDesc) {
		this.mapDesc = mapDesc;
	}

	/**
	 * Gets the map last update dt.
	 *
	 * @return the map last update dt
	 */
	public String getMapLastUpdateDt() {
		return this.mapLastUpdateDt;
	}

	/**
	 * Sets the map last update dt.
	 *
	 * @param mapLastUpdateDt the new map last update dt
	 */
	public void setMapLastUpdateDt(String mapLastUpdateDt) {
		this.mapLastUpdateDt = mapLastUpdateDt;
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
	 * Gets the map status.
	 *
	 * @return the map status
	 */
	public String getMapStatus() {
		return this.mapStatus;
	}

	/**
	 * Sets the map status.
	 *
	 * @param mapStatus the new map status
	 */
	public void setMapStatus(String mapStatus) {
		this.mapStatus = mapStatus;
	}

	/**
	 * Gets the map typ.
	 *
	 * @return the map typ
	 */
	public String getMapTyp() {
		return this.mapTyp;
	}

	/**
	 * Sets the map typ.
	 *
	 * @param mapTyp the new map typ
	 */
	public void setMapTyp(String mapTyp) {
		this.mapTyp = mapTyp;
	}

	/**
	 * Gets the usr nm last upd.
	 *
	 * @return the usr nm last upd
	 */
	public String getUsrNmLastUpd() {
		return this.usrNmLastUpd;
	}

	/**
	 * Sets the usr nm last upd.
	 *
	 * @param usrNmLastUpd the new usr nm last upd
	 */
	public void setUsrNmLastUpd(String usrNmLastUpd) {
		this.usrNmLastUpd = usrNmLastUpd;
	}

}