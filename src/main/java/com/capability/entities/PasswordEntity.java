package com.capability.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the password database table.
 * 
 */
@Entity
@Table(name = "PASSWORD")
public class PasswordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PasswordEntityKey id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DT")
	private Date createDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATE_DT")
	private Date lastUpdateDt;

	private String password;

	public PasswordEntity() {
	}

	public PasswordEntityKey getId() {
		return this.id;
	}

	public void setId(PasswordEntityKey id) {
		this.id = id;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}