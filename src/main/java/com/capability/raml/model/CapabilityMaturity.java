
package com.capability.raml.model;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * capabilityMaturity
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "maturityDesc",
    "capabilityId",
    "mapId",
    "sectorId",
    "maturityId",
    "dimensionId",
    "elmentId",
    "maturityTyp",
    "versionId",
    "createDt",
    "lastupdateDt",
    "usrNmLastUpd"
})
public class CapabilityMaturity {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("maturityDesc")
    @NotNull
    private String maturityDesc;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capabilityId")
    @NotNull
    private String capabilityId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mapId")
    @NotNull
    private String mapId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sectorId")
    @NotNull
    private String sectorId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("maturityId")
    @NotNull
    private String maturityId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dimensionId")
    @NotNull
    private String dimensionId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("elmentId")
    @NotNull
    private String elmentId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("maturityTyp")
    @NotNull
    private String maturityTyp;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("versionId")
    @NotNull
    private String versionId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("createDt")
    @NotNull
    private String createDt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastupdateDt")
    @NotNull
    private String lastupdateDt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("usrNmLastUpd")
    @NotNull
    private String usrNmLastUpd;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The maturityDesc
     */
    @JsonProperty("maturityDesc")
    public String getMaturityDesc() {
        return maturityDesc;
    }

    /**
     * 
     * (Required)
     * 
     * @param maturityDesc
     *     The maturityDesc
     */
    @JsonProperty("maturityDesc")
    public void setMaturityDesc(String maturityDesc) {
        this.maturityDesc = maturityDesc;
    }

    public CapabilityMaturity withMaturityDesc(String maturityDesc) {
        this.maturityDesc = maturityDesc;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The capabilityId
     */
    @JsonProperty("capabilityId")
    public String getCapabilityId() {
        return capabilityId;
    }

    /**
     * 
     * (Required)
     * 
     * @param capabilityId
     *     The capabilityId
     */
    @JsonProperty("capabilityId")
    public void setCapabilityId(String capabilityId) {
        this.capabilityId = capabilityId;
    }

    public CapabilityMaturity withCapabilityId(String capabilityId) {
        this.capabilityId = capabilityId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The mapId
     */
    @JsonProperty("mapId")
    public String getMapId() {
        return mapId;
    }

    /**
     * 
     * (Required)
     * 
     * @param mapId
     *     The mapId
     */
    @JsonProperty("mapId")
    public void setMapId(String mapId) {
        this.mapId = mapId;
    }

    public CapabilityMaturity withMapId(String mapId) {
        this.mapId = mapId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The sectorId
     */
    @JsonProperty("sectorId")
    public String getSectorId() {
        return sectorId;
    }

    /**
     * 
     * (Required)
     * 
     * @param sectorId
     *     The sectorId
     */
    @JsonProperty("sectorId")
    public void setSectorId(String sectorId) {
        this.sectorId = sectorId;
    }

    public CapabilityMaturity withSectorId(String sectorId) {
        this.sectorId = sectorId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The maturityId
     */
    @JsonProperty("maturityId")
    public String getMaturityId() {
        return maturityId;
    }

    /**
     * 
     * (Required)
     * 
     * @param maturityId
     *     The maturityId
     */
    @JsonProperty("maturityId")
    public void setMaturityId(String maturityId) {
        this.maturityId = maturityId;
    }

    public CapabilityMaturity withMaturityId(String maturityId) {
        this.maturityId = maturityId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The dimensionId
     */
    @JsonProperty("dimensionId")
    public String getDimensionId() {
        return dimensionId;
    }

    /**
     * 
     * (Required)
     * 
     * @param dimensionId
     *     The dimensionId
     */
    @JsonProperty("dimensionId")
    public void setDimensionId(String dimensionId) {
        this.dimensionId = dimensionId;
    }

    public CapabilityMaturity withDimensionId(String dimensionId) {
        this.dimensionId = dimensionId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The elmentId
     */
    @JsonProperty("elmentId")
    public String getElmentId() {
        return elmentId;
    }

    /**
     * 
     * (Required)
     * 
     * @param elmentId
     *     The elmentId
     */
    @JsonProperty("elmentId")
    public void setElmentId(String elmentId) {
        this.elmentId = elmentId;
    }

    public CapabilityMaturity withElmentId(String elmentId) {
        this.elmentId = elmentId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The maturityTyp
     */
    @JsonProperty("maturityTyp")
    public String getMaturityTyp() {
        return maturityTyp;
    }

    /**
     * 
     * (Required)
     * 
     * @param maturityTyp
     *     The maturityTyp
     */
    @JsonProperty("maturityTyp")
    public void setMaturityTyp(String maturityTyp) {
        this.maturityTyp = maturityTyp;
    }

    public CapabilityMaturity withMaturityTyp(String maturityTyp) {
        this.maturityTyp = maturityTyp;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The versionId
     */
    @JsonProperty("versionId")
    public String getVersionId() {
        return versionId;
    }

    /**
     * 
     * (Required)
     * 
     * @param versionId
     *     The versionId
     */
    @JsonProperty("versionId")
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public CapabilityMaturity withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The createDt
     */
    @JsonProperty("createDt")
    public String getCreateDt() {
        return createDt;
    }

    /**
     * 
     * (Required)
     * 
     * @param createDt
     *     The createDt
     */
    @JsonProperty("createDt")
    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }

    public CapabilityMaturity withCreateDt(String createDt) {
        this.createDt = createDt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The lastupdateDt
     */
    @JsonProperty("lastupdateDt")
    public String getLastupdateDt() {
        return lastupdateDt;
    }

    /**
     * 
     * (Required)
     * 
     * @param lastupdateDt
     *     The lastupdateDt
     */
    @JsonProperty("lastupdateDt")
    public void setLastupdateDt(String lastupdateDt) {
        this.lastupdateDt = lastupdateDt;
    }

    public CapabilityMaturity withLastupdateDt(String lastupdateDt) {
        this.lastupdateDt = lastupdateDt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The usrNmLastUpd
     */
    @JsonProperty("usrNmLastUpd")
    public String getUsrNmLastUpd() {
        return usrNmLastUpd;
    }

    /**
     * 
     * (Required)
     * 
     * @param usrNmLastUpd
     *     The usrNmLastUpd
     */
    @JsonProperty("usrNmLastUpd")
    public void setUsrNmLastUpd(String usrNmLastUpd) {
        this.usrNmLastUpd = usrNmLastUpd;
    }

    public CapabilityMaturity withUsrNmLastUpd(String usrNmLastUpd) {
        this.usrNmLastUpd = usrNmLastUpd;
        return this;
    }

}
