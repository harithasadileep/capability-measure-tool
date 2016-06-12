package com.capability.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * @author dsomajohassula
 * 
 * The persistent class for the EMAIL database table.
 * 
 */
@Entity
@Table(name="EMAIL")
@NamedQuery(name="Email.findAll", query="SELECT e FROM Email e")
public class EmailEntity implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The email. */
	@Column(name="EMAIL")
	private String email;

	/** The name. */
	@Column(name="NAME")
	private String name;

	/**
	 * Instantiates a new email.
	 */
	public EmailEntity() {
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

}