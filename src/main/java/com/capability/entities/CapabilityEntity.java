package com.capability.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the capability database table.
 * 
 */
@Entity
@Table(name = "CAPABILITY")
public class CapabilityEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CapabilityEntityKey capabilityEntityKey;

	@Column(name = "CAP_NOTES")
	private String capNotes;

	@Column(name = "CAPABILITY_DESC")
	private String capabilityDesc;

	@Column(name = "CAPABILITY_NM")
	private String capabilityNm;

	@Column(name = "CAPABILITY_POS")
	private String capabilityPos;

	@Column(name = "CLUSTER_ID")
	private String clusterId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DT")
	private Date createDt;

	@Column(name = "HIGH_VALUE")
	private String highValue;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATE_DT")
	private Date lastUpdateDt;

	@Column(name = "TRUNC_CAPABILITY_NM")
	private String truncCapabilityNm;

	@Column(name = "USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	public CapabilityEntity() {
	}

	public String getCapNotes() {
		return this.capNotes;
	}

	public void setCapNotes(String capNotes) {
		this.capNotes = capNotes;
	}

	public String getCapabilityDesc() {
		return this.capabilityDesc;
	}

	public void setCapabilityDesc(String capabilityDesc) {
		this.capabilityDesc = capabilityDesc;
	}

	public String getCapabilityNm() {
		return this.capabilityNm;
	}

	public void setCapabilityNm(String capabilityNm) {
		this.capabilityNm = capabilityNm;
	}

	public String getCapabilityPos() {
		return this.capabilityPos;
	}

	public void setCapabilityPos(String capabilityPos) {
		this.capabilityPos = capabilityPos;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public Date getCreateDt() {
		return this.createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public String getHighValue() {
		return this.highValue;
	}

	public void setHighValue(String highValue) {
		this.highValue = highValue;
	}

	public Date getLastUpdateDt() {
		return this.lastUpdateDt;
	}

	public void setLastUpdateDt(Date lastUpdateDt) {
		this.lastUpdateDt = lastUpdateDt;
	}

	public String getTruncCapabilityNm() {
		return this.truncCapabilityNm;
	}

	public void setTruncCapabilityNm(String truncCapabilityNm) {
		this.truncCapabilityNm = truncCapabilityNm;
	}

	public String getUsrNmLastUpd() {
		return this.usrNmLastUpd;
	}

	public void setUsrNmLastUpd(String usrNmLastUpd) {
		this.usrNmLastUpd = usrNmLastUpd;
	}

	public CapabilityEntityKey getCapabilityEntityKey() {
		return capabilityEntityKey;
	}

	public void setCapabilityEntityKey(CapabilityEntityKey capabilityEntityKey) {
		this.capabilityEntityKey = capabilityEntityKey;
	}

	
}