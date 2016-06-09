package com.capability.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the cluster database table.
 * 
 */
@Entity
@Table(name = "CLUSTER")
public class ClusterEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ClusterEntityKey clusterEntityKey;

	@Column(name = "CLUSTER_NM")
	private String clusterNm;

	@Column(name = "CLUSTER_POS")
	private String clusterPos;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DT")
	private Date createDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATE_DT")
	private Date lastUpdateDt;

	@Column(name = "USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	@Column(name = "VALUE_CHAIN_ID")
	private String valueChainId;

	public ClusterEntity() {
	}

	public ClusterEntityKey getClusterEntityKey() {
		return clusterEntityKey;
	}

	public void setClusterEntityKey(ClusterEntityKey clusterEntityKey) {
		this.clusterEntityKey = clusterEntityKey;
	}

	public String getClusterNm() {
		return this.clusterNm;
	}

	public void setClusterNm(String clusterNm) {
		this.clusterNm = clusterNm;
	}

	public String getClusterPos() {
		return this.clusterPos;
	}

	public void setClusterPos(String clusterPos) {
		this.clusterPos = clusterPos;
	}

	public Date getCreateDt() {
		return this.createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getLastUpdateDt() {
		return this.lastUpdateDt;
	}

	public void setLastUpdateDt(Date lastUpdateDt) {
		this.lastUpdateDt = lastUpdateDt;
	}

	public String getUsrNmLastUpd() {
		return this.usrNmLastUpd;
	}

	public void setUsrNmLastUpd(String usrNmLastUpd) {
		this.usrNmLastUpd = usrNmLastUpd;
	}

	public String getValueChainId() {
		return this.valueChainId;
	}

	public void setValueChainId(String valueChainId) {
		this.valueChainId = valueChainId;
	}

}