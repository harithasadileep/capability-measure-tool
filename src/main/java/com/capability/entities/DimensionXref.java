package com.capability.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author dsomajohassula
 * 
 * The persistent class for the DIMENSION_XREF database table.
 * 
 */
@Entity
@Table(name="DIMENSION_XREF")
public class DimensionXref implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The dim id. */
	@Id
	@Column(name="DIM_ID")
	private String dimId;

	/** The create dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DT")
	private Date createDt;

	/** The dim desc. */
	@Column(name="DIM_DESC")
	private String dimDesc;

	/** The dim nm. */
	@Column(name="DIM_NM")
	private String dimNm;

	/** The last update dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATE_DT")
	private Date lastUpdateDt;

	/** The usr nm last upd. */
	@Column(name="USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	/** The dimension specifics. */
	//bi-directional many-to-one association to DimensionSpecific
	@OneToMany(mappedBy="dimensionXref")
	private List<DimensionSpecific> dimensionSpecifics;

	/**
	 * Instantiates a new dimension xref.
	 */
	public DimensionXref() {
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
	 * Gets the dim desc.
	 *
	 * @return the dim desc
	 */
	public String getDimDesc() {
		return this.dimDesc;
	}

	/**
	 * Sets the dim desc.
	 *
	 * @param dimDesc the new dim desc
	 */
	public void setDimDesc(String dimDesc) {
		this.dimDesc = dimDesc;
	}

	/**
	 * Gets the dim nm.
	 *
	 * @return the dim nm
	 */
	public String getDimNm() {
		return this.dimNm;
	}

	/**
	 * Sets the dim nm.
	 *
	 * @param dimNm the new dim nm
	 */
	public void setDimNm(String dimNm) {
		this.dimNm = dimNm;
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
	 * Gets the dimension specifics.
	 *
	 * @return the dimension specifics
	 */
	public List<DimensionSpecific> getDimensionSpecifics() {
		return this.dimensionSpecifics;
	}

	/**
	 * Sets the dimension specifics.
	 *
	 * @param dimensionSpecifics the new dimension specifics
	 */
	public void setDimensionSpecifics(List<DimensionSpecific> dimensionSpecifics) {
		this.dimensionSpecifics = dimensionSpecifics;
	}

	/**
	 * Adds the dimension specific.
	 *
	 * @param dimensionSpecific the dimension specific
	 * @return the dimension specific
	 */
	public DimensionSpecific addDimensionSpecific(DimensionSpecific dimensionSpecific) {
		getDimensionSpecifics().add(dimensionSpecific);
		dimensionSpecific.setDimensionXref(this);

		return dimensionSpecific;
	}

	/**
	 * Removes the dimension specific.
	 *
	 * @param dimensionSpecific the dimension specific
	 * @return the dimension specific
	 */
	public DimensionSpecific removeDimensionSpecific(DimensionSpecific dimensionSpecific) {
		getDimensionSpecifics().remove(dimensionSpecific);
		dimensionSpecific.setDimensionXref(null);

		return dimensionSpecific;
	}

}