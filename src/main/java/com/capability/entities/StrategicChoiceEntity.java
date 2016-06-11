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
 * The persistent class for the strategic_choice database table.
 * 
 */
@Entity
@Table(name = "strategic_choice")
public class StrategicChoiceEntity implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@EmbeddedId
	private StrategicChoiceEntitykey id;

	/** The create dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DT")
	private Date createDt;

	/** The last update dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATE_DT")
	private Date lastUpdateDt;

	/** The strategic choice nm. */
	@Column(name = "STRATEGIC_CHOICE_NM")
	private String strategicChoiceNm;

	/** The usr nm last upd. */
	@Column(name = "USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	/**
	 * Instantiates a new strategic choice entity.
	 */
	public StrategicChoiceEntity() {
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public StrategicChoiceEntitykey getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(StrategicChoiceEntitykey id) {
		this.id = id;
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
	 * Gets the strategic choice nm.
	 *
	 * @return the strategic choice nm
	 */
	public String getStrategicChoiceNm() {
		return this.strategicChoiceNm;
	}

	/**
	 * Sets the strategic choice nm.
	 *
	 * @param strategicChoiceNm the new strategic choice nm
	 */
	public void setStrategicChoiceNm(String strategicChoiceNm) {
		this.strategicChoiceNm = strategicChoiceNm;
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