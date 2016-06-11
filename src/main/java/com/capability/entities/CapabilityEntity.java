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
 * The persistent class for the capability database table.
 * 
 */
@Entity
@Table(name = "CAPABILITY")
public class CapabilityEntity implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The capability entity key. */
	@EmbeddedId
	private CapabilityEntityKey capabilityEntityKey;

	/** The cap notes. */
	@Column(name = "CAP_NOTES")
	private String capNotes;

	/** The capability desc. */
	@Column(name = "CAPABILITY_DESC")
	private String capabilityDesc;

	/** The capability nm. */
	@Column(name = "CAPABILITY_NM")
	private String capabilityNm;

	/** The capability pos. */
	@Column(name = "CAPABILITY_POS")
	private String capabilityPos;

	/** The cluster id. */
	@Column(name = "CLUSTER_ID")
	private String clusterId;

	/** The create dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DT")
	private Date createDt;

	/** The high value. */
	@Column(name = "HIGH_VALUE")
	private String highValue;

	/** The last update dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATE_DT")
	private Date lastUpdateDt;

	/** The trunc capability nm. */
	@Column(name = "TRUNC_CAPABILITY_NM")
	private String truncCapabilityNm;

	/** The usr nm last upd. */
	@Column(name = "USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	/**
	 * Instantiates a new capability entity.
	 */
	public CapabilityEntity() {
	}

	/**
	 * Gets the cap notes.
	 *
	 * @return the cap notes
	 */
	public String getCapNotes() {
		return this.capNotes;
	}

	/**
	 * Sets the cap notes.
	 *
	 * @param capNotes the new cap notes
	 */
	public void setCapNotes(String capNotes) {
		this.capNotes = capNotes;
	}

	/**
	 * Gets the capability desc.
	 *
	 * @return the capability desc
	 */
	public String getCapabilityDesc() {
		return this.capabilityDesc;
	}

	/**
	 * Sets the capability desc.
	 *
	 * @param capabilityDesc the new capability desc
	 */
	public void setCapabilityDesc(String capabilityDesc) {
		this.capabilityDesc = capabilityDesc;
	}

	/**
	 * Gets the capability nm.
	 *
	 * @return the capability nm
	 */
	public String getCapabilityNm() {
		return this.capabilityNm;
	}

	/**
	 * Sets the capability nm.
	 *
	 * @param capabilityNm the new capability nm
	 */
	public void setCapabilityNm(String capabilityNm) {
		this.capabilityNm = capabilityNm;
	}

	/**
	 * Gets the capability pos.
	 *
	 * @return the capability pos
	 */
	public String getCapabilityPos() {
		return this.capabilityPos;
	}

	/**
	 * Sets the capability pos.
	 *
	 * @param capabilityPos the new capability pos
	 */
	public void setCapabilityPos(String capabilityPos) {
		this.capabilityPos = capabilityPos;
	}

	/**
	 * Gets the cluster id.
	 *
	 * @return the cluster id
	 */
	public String getClusterId() {
		return this.clusterId;
	}

	/**
	 * Sets the cluster id.
	 *
	 * @param clusterId the new cluster id
	 */
	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
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
	 * Gets the high value.
	 *
	 * @return the high value
	 */
	public String getHighValue() {
		return this.highValue;
	}

	/**
	 * Sets the high value.
	 *
	 * @param highValue the new high value
	 */
	public void setHighValue(String highValue) {
		this.highValue = highValue;
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
	 * Gets the trunc capability nm.
	 *
	 * @return the trunc capability nm
	 */
	public String getTruncCapabilityNm() {
		return this.truncCapabilityNm;
	}

	/**
	 * Sets the trunc capability nm.
	 *
	 * @param truncCapabilityNm the new trunc capability nm
	 */
	public void setTruncCapabilityNm(String truncCapabilityNm) {
		this.truncCapabilityNm = truncCapabilityNm;
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

	/**
	 * Gets the capability entity key.
	 *
	 * @return the capability entity key
	 */
	public CapabilityEntityKey getCapabilityEntityKey() {
		return capabilityEntityKey;
	}

	/**
	 * Sets the capability entity key.
	 *
	 * @param capabilityEntityKey the new capability entity key
	 */
	public void setCapabilityEntityKey(CapabilityEntityKey capabilityEntityKey) {
		this.capabilityEntityKey = capabilityEntityKey;
	}

	
}