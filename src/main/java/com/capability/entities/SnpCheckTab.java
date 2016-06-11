package com.capability.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author dsomajohassula
 * 
 * The persistent class for the SNP_CHECK_TAB database table.
 * 
 */
@Entity
@Table(name="SNP_CHECK_TAB")
@NamedQuery(name="SnpCheckTab.findAll", query="SELECT s FROM SnpCheckTab s")
public class SnpCheckTab implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The catalog name. */
	@Column(name="CATALOG_NAME")
	private String catalogName;

	/** The check date. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CHECK_DATE")
	private Date checkDate;

	/** The cons name. */
	@Column(name="CONS_NAME")
	private String consName;

	/** The cons type. */
	@Column(name="CONS_TYPE")
	private String consType;

	/** The err count. */
	@Column(name="ERR_COUNT")
	private BigDecimal errCount;

	/** The err mess. */
	@Column(name="ERR_MESS")
	private String errMess;

	/** The err type. */
	@Column(name="ERR_TYPE")
	private String errType;

	/** The full res name. */
	@Column(name="FULL_RES_NAME")
	private String fullResName;

	/** The origin. */
	@Column(name="ORIGIN")
	private String origin;

	/** The resource name. */
	@Column(name="RESOURCE_NAME")
	private String resourceName;

	/** The schema name. */
	@Column(name="SCHEMA_NAME")
	private String schemaName;

	/**
	 * Instantiates a new snp check tab.
	 */
	public SnpCheckTab() {
	}

	/**
	 * Gets the catalog name.
	 *
	 * @return the catalog name
	 */
	public String getCatalogName() {
		return this.catalogName;
	}

	/**
	 * Sets the catalog name.
	 *
	 * @param catalogName the new catalog name
	 */
	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	/**
	 * Gets the check date.
	 *
	 * @return the check date
	 */
	public Date getCheckDate() {
		return this.checkDate;
	}

	/**
	 * Sets the check date.
	 *
	 * @param checkDate the new check date
	 */
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	/**
	 * Gets the cons name.
	 *
	 * @return the cons name
	 */
	public String getConsName() {
		return this.consName;
	}

	/**
	 * Sets the cons name.
	 *
	 * @param consName the new cons name
	 */
	public void setConsName(String consName) {
		this.consName = consName;
	}

	/**
	 * Gets the cons type.
	 *
	 * @return the cons type
	 */
	public String getConsType() {
		return this.consType;
	}

	/**
	 * Sets the cons type.
	 *
	 * @param consType the new cons type
	 */
	public void setConsType(String consType) {
		this.consType = consType;
	}

	/**
	 * Gets the err count.
	 *
	 * @return the err count
	 */
	public BigDecimal getErrCount() {
		return this.errCount;
	}

	/**
	 * Sets the err count.
	 *
	 * @param errCount the new err count
	 */
	public void setErrCount(BigDecimal errCount) {
		this.errCount = errCount;
	}

	/**
	 * Gets the err mess.
	 *
	 * @return the err mess
	 */
	public String getErrMess() {
		return this.errMess;
	}

	/**
	 * Sets the err mess.
	 *
	 * @param errMess the new err mess
	 */
	public void setErrMess(String errMess) {
		this.errMess = errMess;
	}

	/**
	 * Gets the err type.
	 *
	 * @return the err type
	 */
	public String getErrType() {
		return this.errType;
	}

	/**
	 * Sets the err type.
	 *
	 * @param errType the new err type
	 */
	public void setErrType(String errType) {
		this.errType = errType;
	}

	/**
	 * Gets the full res name.
	 *
	 * @return the full res name
	 */
	public String getFullResName() {
		return this.fullResName;
	}

	/**
	 * Sets the full res name.
	 *
	 * @param fullResName the new full res name
	 */
	public void setFullResName(String fullResName) {
		this.fullResName = fullResName;
	}

	/**
	 * Gets the origin.
	 *
	 * @return the origin
	 */
	public String getOrigin() {
		return this.origin;
	}

	/**
	 * Sets the origin.
	 *
	 * @param origin the new origin
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Gets the resource name.
	 *
	 * @return the resource name
	 */
	public String getResourceName() {
		return this.resourceName;
	}

	/**
	 * Sets the resource name.
	 *
	 * @param resourceName the new resource name
	 */
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	/**
	 * Gets the schema name.
	 *
	 * @return the schema name
	 */
	public String getSchemaName() {
		return this.schemaName;
	}

	/**
	 * Sets the schema name.
	 *
	 * @param schemaName the new schema name
	 */
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

}