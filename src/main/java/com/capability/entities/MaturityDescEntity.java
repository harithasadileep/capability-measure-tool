package com.capability.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author dsomajohassula
 * 
 * The persistent class for the MATURITY_DESC database table.
 * 
 */
@Entity
@Table(name="MATURITY_DESC")
public class MaturityDescEntity implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@EmbeddedId
	private MaturityDescEntityKey id;

	/** The create dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DT")
	private Date createDt;

	/** The element id. */
	@Column(name="ELEMENT_ID")
	private String elementId;

	/** The last update dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATE_DT")
	private Date lastUpdateDt;

	/** The maturity desc. */
	@Column(name="MATURITY_DESC")
	private String maturityDesc;

	/** The maturity typ. */
	@Column(name="MATURITY_TYP")
	private String maturityTyp;

	/** The usr nm last upd. */
	@Column(name="USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	/** The dimension specific. */
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CAPABILITY_ID", referencedColumnName="CAPABILITY_ID",insertable=false, updatable=false),
		@JoinColumn(name="DIM_ID", referencedColumnName="DIM_ID",insertable=false, updatable=false),
		@JoinColumn(name="MAP_ID", referencedColumnName="MAP_ID",insertable=false, updatable=false),
		@JoinColumn(name="SECTOR_ID", referencedColumnName="SECTOR_ID",insertable=false, updatable=false),
		@JoinColumn(name="VERSION_ID", referencedColumnName="VERSION_ID",insertable=false, updatable=false)
		})
	private DimensionSpecific dimensionSpecific;
	

	/**
	 * Instantiates a new maturity desc entity.
	 */
	public MaturityDescEntity() {
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public MaturityDescEntityKey getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(MaturityDescEntityKey id) {
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
	 * Gets the element id.
	 *
	 * @return the element id
	 */
	public String getElementId() {
		return this.elementId;
	}

	/**
	 * Sets the element id.
	 *
	 * @param elementId the new element id
	 */
	public void setElementId(String elementId) {
		this.elementId = elementId;
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
	 * Gets the maturity desc.
	 *
	 * @return the maturity desc
	 */
	public String getMaturityDesc() {
		return this.maturityDesc;
	}

	/**
	 * Sets the maturity desc.
	 *
	 * @param maturityDesc the new maturity desc
	 */
	public void setMaturityDesc(String maturityDesc) {
		this.maturityDesc = maturityDesc;
	}

	/**
	 * Gets the maturity typ.
	 *
	 * @return the maturity typ
	 */
	public String getMaturityTyp() {
		return this.maturityTyp;
	}

	/**
	 * Sets the maturity typ.
	 *
	 * @param maturityTyp the new maturity typ
	 */
	public void setMaturityTyp(String maturityTyp) {
		this.maturityTyp = maturityTyp;
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
	 * Gets the dimension specific.
	 *
	 * @return the dimension specific
	 */
	public DimensionSpecific getDimensionSpecific() {
		return this.dimensionSpecific;
	}

	/**
	 * Sets the dimension specific.
	 *
	 * @param dimensionSpecific the new dimension specific
	 */
	public void setDimensionSpecific(DimensionSpecific dimensionSpecific) {
		this.dimensionSpecific = dimensionSpecific;
	}

}