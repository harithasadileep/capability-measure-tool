package com.capability.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author dsomajohassula
 * 
 * The persistent class for the DIMENSION_SPECIFIC database table.
 * 
 */
@Entity
@Table(name="DIMENSION_SPECIFIC")
public class DimensionSpecificEntity implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@EmbeddedId
	private DimensionSpecificEntityKey id;

	/** The create dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DT")
	private Date createDt;

	/** The dim def. */
	@Column(name="DIM_DEF")
	private String dimDef;

	/** The last update dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATE_DT")
	private Date lastUpdateDt;

	/** The usr nm last upd. */
	@Column(name="USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	/** The dimension xref. */
	//bi-directional many-to-one association to DimensionXref
	@ManyToOne
	@JoinColumn(name="DIM_ID",insertable=false, updatable=false)
	private DimensionXrefEntity dimensionXref;

	/** The elements. */
	//bi-directional many-to-one association to Element
	@OneToMany(mappedBy="dimensionSpecific")
	private List<ElementEntity> elements;

	/** The maturity descs. */
	//bi-directional many-to-one association to MaturityDesc
	@OneToMany(mappedBy="dimensionSpecific")
	private List<MaturityDescEntity> maturityDescs;

	/**
	 * Instantiates a new dimension specific.
	 */
	public DimensionSpecificEntity() {
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public DimensionSpecificEntityKey getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(DimensionSpecificEntityKey id) {
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
	 * Gets the dim def.
	 *
	 * @return the dim def
	 */
	public String getDimDef() {
		return this.dimDef;
	}

	/**
	 * Sets the dim def.
	 *
	 * @param dimDef the new dim def
	 */
	public void setDimDef(String dimDef) {
		this.dimDef = dimDef;
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
	 * Gets the dimension xref.
	 *
	 * @return the dimension xref
	 */
	public DimensionXrefEntity getDimensionXref() {
		return this.dimensionXref;
	}

	/**
	 * Sets the dimension xref.
	 *
	 * @param dimensionXref the new dimension xref
	 */
	public void setDimensionXref(DimensionXrefEntity dimensionXref) {
		this.dimensionXref = dimensionXref;
	}

	/**
	 * Gets the elements.
	 *
	 * @return the elements
	 */
	public List<ElementEntity> getElements() {
		return this.elements;
	}

	/**
	 * Sets the elements.
	 *
	 * @param elements the new elements
	 */
	public void setElements(List<ElementEntity> elements) {
		this.elements = elements;
	}

	/**
	 * Adds the element.
	 *
	 * @param element the element
	 * @return the element
	 */
	public ElementEntity addElement(ElementEntity element) {
		getElements().add(element);
		element.setDimensionSpecific(this);

		return element;
	}

	/**
	 * Removes the element.
	 *
	 * @param element the element
	 * @return the element
	 */
	public ElementEntity removeElement(ElementEntity element) {
		getElements().remove(element);
		element.setDimensionSpecific(null);

		return element;
	}

	/**
	 * Gets the maturity descs.
	 *
	 * @return the maturity descs
	 */
	public List<MaturityDescEntity> getMaturityDescs() {
		return this.maturityDescs;
	}

	/**
	 * Sets the maturity descs.
	 *
	 * @param maturityDescs the new maturity descs
	 */
	public void setMaturityDescs(List<MaturityDescEntity> maturityDescs) {
		this.maturityDescs = maturityDescs;
	}

	/**
	 * Adds the maturity desc.
	 *
	 * @param maturityDesc the maturity desc
	 * @return the maturity desc entity
	 */
	public MaturityDescEntity addMaturityDesc(MaturityDescEntity maturityDesc) {
		getMaturityDescs().add(maturityDesc);
		maturityDesc.setDimensionSpecific(this);

		return maturityDesc;
	}

	/**
	 * Removes the maturity desc.
	 *
	 * @param maturityDesc the maturity desc
	 * @return the maturity desc entity
	 */
	public MaturityDescEntity removeMaturityDesc(MaturityDescEntity maturityDesc) {
		getMaturityDescs().remove(maturityDesc);
		maturityDesc.setDimensionSpecific(null);

		return maturityDesc;
	}

}