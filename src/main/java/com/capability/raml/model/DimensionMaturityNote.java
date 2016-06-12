
package com.capability.raml.model;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "capabilityId",
    "mapId",
    "versionId",
    "sectorId",
    "dimId",
    "clusterId",
    "dimNotes",
    "currentMaturity",
    "futureMaturity",
    "dimMatGap",
    "capabilityCurrentMat",
    "capabilityFutureMat",
    "capMatGap",
    "createDt",
    "lastupdateDt"
})
public class DimensionMaturityNote {

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
    @JsonProperty("dimId")
    @NotNull
    private String dimId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("clusterId")
    @NotNull
    private String clusterId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dimNotes")
    @NotNull
    private String dimNotes;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currentMaturity")
    @NotNull
    private String currentMaturity;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("futureMaturity")
    @NotNull
    private String futureMaturity;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dimMatGap")
    @NotNull
    private String dimMatGap;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capabilityCurrentMat")
    @NotNull
    private String capabilityCurrentMat;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capabilityFutureMat")
    @NotNull
    private String capabilityFutureMat;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capMatGap")
    @NotNull
    private String capMatGap;
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

    public DimensionMaturityNote withCapabilityId(String capabilityId) {
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

    public DimensionMaturityNote withMapId(String mapId) {
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

    public DimensionMaturityNote withVersionId(String versionId) {
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

    public DimensionMaturityNote withSectorId(String sectorId) {
        this.sectorId = sectorId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The dimId
     */
    @JsonProperty("dimId")
    public String getDimId() {
        return dimId;
    }

    /**
     * 
     * (Required)
     * 
     * @param dimId
     *     The dimId
     */
    @JsonProperty("dimId")
    public void setDimId(String dimId) {
        this.dimId = dimId;
    }

    public DimensionMaturityNote withDimId(String dimId) {
        this.dimId = dimId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The clusterId
     */
    @JsonProperty("clusterId")
    public String getClusterId() {
        return clusterId;
    }

    /**
     * 
     * (Required)
     * 
     * @param clusterId
     *     The clusterId
     */
    @JsonProperty("clusterId")
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DimensionMaturityNote withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The dimNotes
     */
    @JsonProperty("dimNotes")
    public String getDimNotes() {
        return dimNotes;
    }

    /**
     * 
     * (Required)
     * 
     * @param dimNotes
     *     The dimNotes
     */
    @JsonProperty("dimNotes")
    public void setDimNotes(String dimNotes) {
        this.dimNotes = dimNotes;
    }

    public DimensionMaturityNote withDimNotes(String dimNotes) {
        this.dimNotes = dimNotes;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The currentMaturity
     */
    @JsonProperty("currentMaturity")
    public String getCurrentMaturity() {
        return currentMaturity;
    }

    /**
     * 
     * (Required)
     * 
     * @param currentMaturity
     *     The currentMaturity
     */
    @JsonProperty("currentMaturity")
    public void setCurrentMaturity(String currentMaturity) {
        this.currentMaturity = currentMaturity;
    }

    public DimensionMaturityNote withCurrentMaturity(String currentMaturity) {
        this.currentMaturity = currentMaturity;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The futureMaturity
     */
    @JsonProperty("futureMaturity")
    public String getFutureMaturity() {
        return futureMaturity;
    }

    /**
     * 
     * (Required)
     * 
     * @param futureMaturity
     *     The futureMaturity
     */
    @JsonProperty("futureMaturity")
    public void setFutureMaturity(String futureMaturity) {
        this.futureMaturity = futureMaturity;
    }

    public DimensionMaturityNote withFutureMaturity(String futureMaturity) {
        this.futureMaturity = futureMaturity;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The dimMatGap
     */
    @JsonProperty("dimMatGap")
    public String getDimMatGap() {
        return dimMatGap;
    }

    /**
     * 
     * (Required)
     * 
     * @param dimMatGap
     *     The dimMatGap
     */
    @JsonProperty("dimMatGap")
    public void setDimMatGap(String dimMatGap) {
        this.dimMatGap = dimMatGap;
    }

    public DimensionMaturityNote withDimMatGap(String dimMatGap) {
        this.dimMatGap = dimMatGap;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The capabilityCurrentMat
     */
    @JsonProperty("capabilityCurrentMat")
    public String getCapabilityCurrentMat() {
        return capabilityCurrentMat;
    }

    /**
     * 
     * (Required)
     * 
     * @param capabilityCurrentMat
     *     The capabilityCurrentMat
     */
    @JsonProperty("capabilityCurrentMat")
    public void setCapabilityCurrentMat(String capabilityCurrentMat) {
        this.capabilityCurrentMat = capabilityCurrentMat;
    }

    public DimensionMaturityNote withCapabilityCurrentMat(String capabilityCurrentMat) {
        this.capabilityCurrentMat = capabilityCurrentMat;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The capabilityFutureMat
     */
    @JsonProperty("capabilityFutureMat")
    public String getCapabilityFutureMat() {
        return capabilityFutureMat;
    }

    /**
     * 
     * (Required)
     * 
     * @param capabilityFutureMat
     *     The capabilityFutureMat
     */
    @JsonProperty("capabilityFutureMat")
    public void setCapabilityFutureMat(String capabilityFutureMat) {
        this.capabilityFutureMat = capabilityFutureMat;
    }

    public DimensionMaturityNote withCapabilityFutureMat(String capabilityFutureMat) {
        this.capabilityFutureMat = capabilityFutureMat;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The capMatGap
     */
    @JsonProperty("capMatGap")
    public String getCapMatGap() {
        return capMatGap;
    }

    /**
     * 
     * (Required)
     * 
     * @param capMatGap
     *     The capMatGap
     */
    @JsonProperty("capMatGap")
    public void setCapMatGap(String capMatGap) {
        this.capMatGap = capMatGap;
    }

    public DimensionMaturityNote withCapMatGap(String capMatGap) {
        this.capMatGap = capMatGap;
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

    public DimensionMaturityNote withCreateDt(String createDt) {
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

    public DimensionMaturityNote withLastupdateDt(String lastupdateDt) {
        this.lastupdateDt = lastupdateDt;
        return this;
    }

}
