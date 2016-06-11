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
 * The persistent class for the ELEMENT database table.
 * 
 */
@Entity
@Table(name="ELEMENT")
public class Element implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@EmbeddedId
	private ElementPK id;

	/** The create dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DT")
	private Date createDt;

	/** The element key quest. */
	@Column(name="ELEMENT_KEY_QUEST")
	private String elementKeyQuest;

	/** The element nm. */
	@Column(name="ELEMENT_NM")
	private String elementNm;

	/** The last update dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATE_DT")
	private Date lastUpdateDt;

	/** The usr nm last upd. */
	@Column(name="USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	/** The dimension specific. */
	//bi-directional many-to-one association to DimensionSpecific
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
	 * Instantiates a new element.
	 */
	public Element() {
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public ElementPK getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(ElementPK id) {
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
	 * Gets the element key quest.
	 *
	 * @return the element key quest
	 */
	public String getElementKeyQuest() {
		return this.elementKeyQuest;
	}

	/**
	 * Sets the element key quest.
	 *
	 * @param elementKeyQuest the new element key quest
	 */
	public void setElementKeyQuest(String elementKeyQuest) {
		this.elementKeyQuest = elementKeyQuest;
	}

	/**
	 * Gets the element nm.
	 *
	 * @return the element nm
	 */
	public String getElementNm() {
		return this.elementNm;
	}

	/**
	 * Sets the element nm.
	 *
	 * @param elementNm the new element nm
	 */
	public void setElementNm(String elementNm) {
		this.elementNm = elementNm;
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