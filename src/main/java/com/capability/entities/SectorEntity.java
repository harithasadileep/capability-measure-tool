package com.capability.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sector database table.
 * 
 */
@Entity
@Table(name = "SECTOR")
public class SectorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SECTOR_ID")
	private String sectorId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DT")
	private Date createDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATE_DT")
	private Date lastUpdateDt;

	@Column(name="SECTOR")
	private String sector;

	@Column(name="USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	public SectorEntity() {
	}

	public String getSectorId() {
		return this.sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
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

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getUsrNmLastUpd() {
		return this.usrNmLastUpd;
	}

	public void setUsrNmLastUpd(String usrNmLastUpd) {
		this.usrNmLastUpd = usrNmLastUpd;
	}

}