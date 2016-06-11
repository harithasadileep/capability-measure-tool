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
 * The persistent class for the OVERLAY_XREF database table.
 * 
 */
@Entity
@Table(name="OVERLAY_XREF")
public class OverlayXrefEntity implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@EmbeddedId
	private OverlayXrefEntityKey id;

	/** The create dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DT")
	private Date createDt;

	/** The last update dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATE_DT")
	private Date lastUpdateDt;

	/** The performance maturity. */
	@Column(name="PERFORMANCE_MATURITY")
	private String performanceMaturity;

	/** The scope. */
	@Column(name="SCOPE")
	private String scope;

	/** The service delivery. */
	@Column(name="SERVICE_DELIVERY")
	private String serviceDelivery;

	/** The strategic priority. */
	@Column(name="STRATEGIC_PRIORITY")
	private String strategicPriority;

	/** The usr nm last upd. */
	@Column(name="USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	/**
	 * Instantiates a new overlay xref entity.
	 */
	public OverlayXrefEntity() {
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public OverlayXrefEntityKey getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(OverlayXrefEntityKey id) {
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
	 * Gets the performance maturity.
	 *
	 * @return the performance maturity
	 */
	public String getPerformanceMaturity() {
		return this.performanceMaturity;
	}

	/**
	 * Sets the performance maturity.
	 *
	 * @param performanceMaturity the new performance maturity
	 */
	public void setPerformanceMaturity(String performanceMaturity) {
		this.performanceMaturity = performanceMaturity;
	}

	/**
	 * Gets the scope.
	 *
	 * @return the scope
	 */
	public String getScope() {
		return this.scope;
	}

	/**
	 * Sets the scope.
	 *
	 * @param scope the new scope
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

	/**
	 * Gets the service delivery.
	 *
	 * @return the service delivery
	 */
	public String getServiceDelivery() {
		return this.serviceDelivery;
	}

	/**
	 * Sets the service delivery.
	 *
	 * @param serviceDelivery the new service delivery
	 */
	public void setServiceDelivery(String serviceDelivery) {
		this.serviceDelivery = serviceDelivery;
	}

	/**
	 * Gets the strategic priority.
	 *
	 * @return the strategic priority
	 */
	public String getStrategicPriority() {
		return this.strategicPriority;
	}

	/**
	 * Sets the strategic priority.
	 *
	 * @param strategicPriority the new strategic priority
	 */
	public void setStrategicPriority(String strategicPriority) {
		this.strategicPriority = strategicPriority;
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