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
 *
 * @author dsomajohassula
 * 
 *         The persistent class for the capability database table.
 */
@Entity
@Table(name = "CAPABILITY_MASTER")
public class CapabilityMasterEntity implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The capability entity key. */
	@EmbeddedId
	private CapabilityMasterEntityKey capabilityMasterEntityKey;

	/** The dimension notes. */
	@Column(name = "DIM_NOTES")
	private String dimensionNotes;

	/** The current maturity. */
	@Column(name = "CURRENT_MATURITY")
	private String currentMaturity;

	/** The future maturity. */
	@Column(name = "FUTURE_MATURITY")
	private String futureMaturity;

	/** The dimensionmaturity gap. */
	@Column(name = "DIM_MAT_GAP")
	private String dimensionmaturityGap;

	/** The capability current maturity. */
	@Column(name = "CAPABILITY_CURRENT_MAT")
	private String capabilityCurrentMaturity;

	/** The capability future maturity. */
	@Column(name = "CAPABILITY_FUTURE_MAT")
	private String capabilityFutureMaturity;

	/** The capability maturity gap. */
	@Column(name = "CAP_MAT_GAP")
	private String capabilityMaturityGap;

	/** The create dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DT")
	private Date createDt;

	/** The last update dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATE_DT")
	private Date lastUpdateDt;

	
	/**
	 * Instantiates a new capability master entity.
	 */
	public CapabilityMasterEntity() {
	}

	/**
	 * Gets the capability master entity key.
	 *
	 * @return the capability master entity key
	 */
	public CapabilityMasterEntityKey getCapabilityMasterEntityKey() {
		return capabilityMasterEntityKey;
	}

	/**
	 * Sets the capability master entity key.
	 *
	 * @param capabilityMasterEntityKey the new capability master entity key
	 */
	public void setCapabilityMasterEntityKey(CapabilityMasterEntityKey capabilityMasterEntityKey) {
		this.capabilityMasterEntityKey = capabilityMasterEntityKey;
	}

	/**
	 * Gets the dimension notes.
	 *
	 * @return the dimension notes
	 */
	public String getDimensionNotes() {
		return dimensionNotes;
	}

	/**
	 * Sets the dimension notes.
	 *
	 * @param dimensionNotes the new dimension notes
	 */
	public void setDimensionNotes(String dimensionNotes) {
		this.dimensionNotes = dimensionNotes;
	}

	/**
	 * Gets the current maturity.
	 *
	 * @return the current maturity
	 */
	public String getCurrentMaturity() {
		return currentMaturity;
	}

	/**
	 * Sets the current maturity.
	 *
	 * @param currentMaturity the new current maturity
	 */
	public void setCurrentMaturity(String currentMaturity) {
		this.currentMaturity = currentMaturity;
	}

	/**
	 * Gets the future maturity.
	 *
	 * @return the future maturity
	 */
	public String getFutureMaturity() {
		return futureMaturity;
	}

	/**
	 * Sets the future maturity.
	 *
	 * @param futureMaturity the new future maturity
	 */
	public void setFutureMaturity(String futureMaturity) {
		this.futureMaturity = futureMaturity;
	}

	/**
	 * Gets the dimensionmaturity gap.
	 *
	 * @return the dimensionmaturity gap
	 */
	public String getDimensionmaturityGap() {
		return dimensionmaturityGap;
	}

	/**
	 * Sets the dimensionmaturity gap.
	 *
	 * @param dimensionmaturityGap the new dimensionmaturity gap
	 */
	public void setDimensionmaturityGap(String dimensionmaturityGap) {
		this.dimensionmaturityGap = dimensionmaturityGap;
	}

	/**
	 * Gets the capability current maturity.
	 *
	 * @return the capability current maturity
	 */
	public String getCapabilityCurrentMaturity() {
		return capabilityCurrentMaturity;
	}

	/**
	 * Sets the capability current maturity.
	 *
	 * @param capabilityCurrentMaturity the new capability current maturity
	 */
	public void setCapabilityCurrentMaturity(String capabilityCurrentMaturity) {
		this.capabilityCurrentMaturity = capabilityCurrentMaturity;
	}

	/**
	 * Gets the capability future maturity.
	 *
	 * @return the capability future maturity
	 */
	public String getCapabilityFutureMaturity() {
		return capabilityFutureMaturity;
	}

	/**
	 * Sets the capability future maturity.
	 *
	 * @param capabilityFutureMaturity the new capability future maturity
	 */
	public void setCapabilityFutureMaturity(String capabilityFutureMaturity) {
		this.capabilityFutureMaturity = capabilityFutureMaturity;
	}

	/**
	 * Gets the capability maturity gap.
	 *
	 * @return the capability maturity gap
	 */
	public String getCapabilityMaturityGap() {
		return capabilityMaturityGap;
	}

	/**
	 * Sets the capability maturity gap.
	 *
	 * @param capabilityMaturityGap the new capability maturity gap
	 */
	public void setCapabilityMaturityGap(String capabilityMaturityGap) {
		this.capabilityMaturityGap = capabilityMaturityGap;
	}

	/**
	 * Gets the creates the dt.
	 *
	 * @return the creates the dt
	 */
	public Date getCreateDt() {
		return createDt;
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
		return lastUpdateDt;
	}

	/**
	 * Sets the last update dt.
	 *
	 * @param lastUpdateDt the new last update dt
	 */
	public void setLastUpdateDt(Date lastUpdateDt) {
		this.lastUpdateDt = lastUpdateDt;
	}
}