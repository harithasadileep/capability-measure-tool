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
 * The persistent class for the cluster database table.
 * 
 */
@Entity
@Table(name = "CLUSTER")
public class ClusterEntity implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The cluster entity key. */
	@EmbeddedId
	private ClusterEntityKey clusterEntityKey;

	/** The cluster nm. */
	@Column(name = "CLUSTER_NM")
	private String clusterNm;

	/** The cluster pos. */
	@Column(name = "CLUSTER_POS")
	private String clusterPos;

	/** The create dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DT")
	private Date createDt;

	/** The last update dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATE_DT")
	private Date lastUpdateDt;

	/** The usr nm last upd. */
	@Column(name = "USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	/** The value chain id. */
	@Column(name = "VALUE_CHAIN_ID")
	private String valueChainId;

	/**
	 * Instantiates a new cluster entity.
	 */
	public ClusterEntity() {
	}

	/**
	 * Gets the cluster entity key.
	 *
	 * @return the cluster entity key
	 */
	public ClusterEntityKey getClusterEntityKey() {
		return clusterEntityKey;
	}

	/**
	 * Sets the cluster entity key.
	 *
	 * @param clusterEntityKey the new cluster entity key
	 */
	public void setClusterEntityKey(ClusterEntityKey clusterEntityKey) {
		this.clusterEntityKey = clusterEntityKey;
	}

	/**
	 * Gets the cluster nm.
	 *
	 * @return the cluster nm
	 */
	public String getClusterNm() {
		return this.clusterNm;
	}

	/**
	 * Sets the cluster nm.
	 *
	 * @param clusterNm the new cluster nm
	 */
	public void setClusterNm(String clusterNm) {
		this.clusterNm = clusterNm;
	}

	/**
	 * Gets the cluster pos.
	 *
	 * @return the cluster pos
	 */
	public String getClusterPos() {
		return this.clusterPos;
	}

	/**
	 * Sets the cluster pos.
	 *
	 * @param clusterPos the new cluster pos
	 */
	public void setClusterPos(String clusterPos) {
		this.clusterPos = clusterPos;
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
	 * Gets the value chain id.
	 *
	 * @return the value chain id
	 */
	public String getValueChainId() {
		return this.valueChainId;
	}

	/**
	 * Sets the value chain id.
	 *
	 * @param valueChainId the new value chain id
	 */
	public void setValueChainId(String valueChainId) {
		this.valueChainId = valueChainId;
	}

}