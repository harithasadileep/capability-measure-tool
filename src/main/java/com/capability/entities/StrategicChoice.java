package com.capability.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author dsomajohassula
 * 
 * The persistent class for the STRATEGIC_CHOICE database table.
 * 
 */
@Entity
@Table(name="STRATEGIC_CHOICE")
@NamedQuery(name="StrategicChoice.findAll", query="SELECT s FROM StrategicChoice s")
public class StrategicChoice implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@EmbeddedId
	private StrategicChoicePK id;

	/** The create dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DT")
	private Date createDt;

	/** The last update dt. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATE_DT")
	private Date lastUpdateDt;

	/** The strategic choice nm. */
	@Column(name="STRATEGIC_CHOICE_NM")
	private String strategicChoiceNm;

	/** The usr nm last upd. */
	@Column(name="USR_NM_LAST_UPD")
	private String usrNmLastUpd;

	/** The overlay xrefs. */
	//bi-directional many-to-one association to OverlayXref
	@OneToMany(mappedBy="strategicChoice")
	private List<OverlayXref> overlayXrefs;

	/** The map. */
	//bi-directional many-to-one association to Map
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="MAP_ID", referencedColumnName="MAP_ID"),
		@JoinColumn(name="SECTOR_ID", referencedColumnName="SECTOR_ID"),
		@JoinColumn(name="VERSION_ID", referencedColumnName="VERSION_ID")
		})
	private MapEntity map;

	/**
	 * Instantiates a new strategic choice.
	 */
	public StrategicChoice() {
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public StrategicChoicePK getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(StrategicChoicePK id) {
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
	 * Gets the strategic choice nm.
	 *
	 * @return the strategic choice nm
	 */
	public String getStrategicChoiceNm() {
		return this.strategicChoiceNm;
	}

	/**
	 * Sets the strategic choice nm.
	 *
	 * @param strategicChoiceNm the new strategic choice nm
	 */
	public void setStrategicChoiceNm(String strategicChoiceNm) {
		this.strategicChoiceNm = strategicChoiceNm;
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
	 * Gets the overlay xrefs.
	 *
	 * @return the overlay xrefs
	 */
	public List<OverlayXref> getOverlayXrefs() {
		return this.overlayXrefs;
	}

	/**
	 * Sets the overlay xrefs.
	 *
	 * @param overlayXrefs the new overlay xrefs
	 */
	public void setOverlayXrefs(List<OverlayXref> overlayXrefs) {
		this.overlayXrefs = overlayXrefs;
	}

	/**
	 * Adds the overlay xref.
	 *
	 * @param overlayXref the overlay xref
	 * @return the overlay xref
	 */
	public OverlayXref addOverlayXref(OverlayXref overlayXref) {
		getOverlayXrefs().add(overlayXref);
		overlayXref.setStrategicChoice(this);

		return overlayXref;
	}

	/**
	 * Removes the overlay xref.
	 *
	 * @param overlayXref the overlay xref
	 * @return the overlay xref
	 */
	public OverlayXref removeOverlayXref(OverlayXref overlayXref) {
		getOverlayXrefs().remove(overlayXref);
		overlayXref.setStrategicChoice(null);

		return overlayXref;
	}

	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	public MapEntity getMap() {
		return this.map;
	}

	/**
	 * Sets the map.
	 *
	 * @param map the new map
	 */
	public void setMap(MapEntity map) {
		this.map = map;
	}

}