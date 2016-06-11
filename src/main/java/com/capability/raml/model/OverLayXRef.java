
package com.capability.raml.model;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * overLayXRef
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "strategicChoiceId",
    "capabilityId",
    "mapId",
    "versionId",
    "sectorId",
    "createDt",
    "lastUpdateDt",
    "performanceMaturity",
    "scope",
    "serviceDelivery",
    "strategicPriority",
    "usrNmLastUpd"
})
public class OverLayXRef {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("strategicChoiceId")
    @NotNull
    private String strategicChoiceId;
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
    @JsonProperty("versionId")
    @NotNull
    private String versionId;
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
    @JsonProperty("createDt")
    @NotNull
    private String createDt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lastUpdateDt")
    @NotNull
    private String lastUpdateDt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("performanceMaturity")
    @NotNull
    private String performanceMaturity;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("scope")
    @NotNull
    private String scope;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceDelivery")
    @NotNull
    private String serviceDelivery;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("strategicPriority")
    @NotNull
    private String strategicPriority;
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
     *     The strategicChoiceId
     */
    @JsonProperty("strategicChoiceId")
    public String getStrategicChoiceId() {
        return strategicChoiceId;
    }

    /**
     * 
     * (Required)
     * 
     * @param strategicChoiceId
     *     The strategicChoiceId
     */
    @JsonProperty("strategicChoiceId")
    public void setStrategicChoiceId(String strategicChoiceId) {
        this.strategicChoiceId = strategicChoiceId;
    }

    public OverLayXRef withStrategicChoiceId(String strategicChoiceId) {
        this.strategicChoiceId = strategicChoiceId;
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

    public OverLayXRef withCapabilityId(String capabilityId) {
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

    public OverLayXRef withMapId(String mapId) {
        this.mapId = mapId;
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

    public OverLayXRef withVersionId(String versionId) {
        this.versionId = versionId;
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

    public OverLayXRef withSectorId(String sectorId) {
        this.sectorId = sectorId;
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

    public OverLayXRef withCreateDt(String createDt) {
        this.createDt = createDt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The lastUpdateDt
     */
    @JsonProperty("lastUpdateDt")
    public String getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * 
     * (Required)
     * 
     * @param lastUpdateDt
     *     The lastUpdateDt
     */
    @JsonProperty("lastUpdateDt")
    public void setLastUpdateDt(String lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
    }

    public OverLayXRef withLastUpdateDt(String lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The performanceMaturity
     */
    @JsonProperty("performanceMaturity")
    public String getPerformanceMaturity() {
        return performanceMaturity;
    }

    /**
     * 
     * (Required)
     * 
     * @param performanceMaturity
     *     The performanceMaturity
     */
    @JsonProperty("performanceMaturity")
    public void setPerformanceMaturity(String performanceMaturity) {
        this.performanceMaturity = performanceMaturity;
    }

    public OverLayXRef withPerformanceMaturity(String performanceMaturity) {
        this.performanceMaturity = performanceMaturity;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The scope
     */
    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    /**
     * 
     * (Required)
     * 
     * @param scope
     *     The scope
     */
    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    public OverLayXRef withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The serviceDelivery
     */
    @JsonProperty("serviceDelivery")
    public String getServiceDelivery() {
        return serviceDelivery;
    }

    /**
     * 
     * (Required)
     * 
     * @param serviceDelivery
     *     The serviceDelivery
     */
    @JsonProperty("serviceDelivery")
    public void setServiceDelivery(String serviceDelivery) {
        this.serviceDelivery = serviceDelivery;
    }

    public OverLayXRef withServiceDelivery(String serviceDelivery) {
        this.serviceDelivery = serviceDelivery;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The strategicPriority
     */
    @JsonProperty("strategicPriority")
    public String getStrategicPriority() {
        return strategicPriority;
    }

    /**
     * 
     * (Required)
     * 
     * @param strategicPriority
     *     The strategicPriority
     */
    @JsonProperty("strategicPriority")
    public void setStrategicPriority(String strategicPriority) {
        this.strategicPriority = strategicPriority;
    }

    public OverLayXRef withStrategicPriority(String strategicPriority) {
        this.strategicPriority = strategicPriority;
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

    public OverLayXRef withUsrNmLastUpd(String usrNmLastUpd) {
        this.usrNmLastUpd = usrNmLastUpd;
        return this;
    }

}
