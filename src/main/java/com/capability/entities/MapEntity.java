package com.capability.entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;

/**
 * The persistent class for the map database table.
 * 
 */
@Entity
@Table(name = "MAP")
public class MapEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MapEntityKey mapEntityKey;

	@Column(name = "ARCHIVE_IND")
	private String archiveInd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DT")
	private Date createDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATE_DT")
	private Date lastUpdateDt;

	@Column(name = "MAP_DESC")
	private String mapDesc;

	@Column(name = "MAP_LAST_UPDATE_DT")
	private String mapLastUpdateDt;

	@Column(name = "MAP_NM")
	private String mapNm;

	@Column(name = "MAP_STATUS")
	private String mapStatus;

	@Column(name = "MAP_TYP")
	private String mapTyp;

	@Column(name = "USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	public MapEntity() {
	}

	public MapEntityKey getMapEntityKey() {
		return mapEntityKey;
	}

	public void setMapEntityKey(MapEntityKey mapEntityKey) {
		this.mapEntityKey = mapEntityKey;
	}

	public String getArchiveInd() {
		return this.archiveInd;
	}

	public void setArchiveInd(String archiveInd) {
		this.archiveInd = archiveInd;
	}

	public Date getCreateDt() {
		return this.createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getLastUpdateDt() {
		return this.lastUpdateDt;
	}

	public void setLastUpdateDt(Date lastUpdateDt) {
		this.lastUpdateDt = lastUpdateDt;
	}

	public String getMapDesc() {
		return this.mapDesc;
	}

	public void setMapDesc(String mapDesc) {
		this.mapDesc = mapDesc;
	}

	public String getMapLastUpdateDt() {
		return this.mapLastUpdateDt;
	}

	public void setMapLastUpdateDt(String mapLastUpdateDt) {
		this.mapLastUpdateDt = mapLastUpdateDt;
	}

	public String getMapNm() {
		return this.mapNm;
	}

	public void setMapNm(String mapNm) {
		this.mapNm = mapNm;
	}

	public String getMapStatus() {
		return this.mapStatus;
	}

	public void setMapStatus(String mapStatus) {
		this.mapStatus = mapStatus;
	}

	public String getMapTyp() {
		return this.mapTyp;
	}

	public void setMapTyp(String mapTyp) {
		this.mapTyp = mapTyp;
	}

	public String getUsrNmLastUpd() {
		return this.usrNmLastUpd;
	}

	public void setUsrNmLastUpd(String usrNmLastUpd) {
		this.usrNmLastUpd = usrNmLastUpd;
	}

}