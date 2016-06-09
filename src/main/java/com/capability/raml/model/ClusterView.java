
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
    "clusterId",
    "capNotes",
    "capabilityDesc",
    "capabilityNm",
    "capabilityPos",
    "highValue",
    "createDt",
    "lastUpdateDt",
    "truncCapabilityNm",
    "usrNmLastUpd"
})
public class ClusterView {

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
    @JsonProperty("clusterId")
    @NotNull
    private String clusterId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capNotes")
    @NotNull
    private String capNotes;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capabilityDesc")
    @NotNull
    private String capabilityDesc;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capabilityNm")
    @NotNull
    private String capabilityNm;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capabilityPos")
    @NotNull
    private String capabilityPos;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("highValue")
    @NotNull
    private String highValue;
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
    @JsonProperty("truncCapabilityNm")
    @NotNull
    private String truncCapabilityNm;
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

    public ClusterView withCapabilityId(String capabilityId) {
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

    public ClusterView withMapId(String mapId) {
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

    public ClusterView withVersionId(String versionId) {
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

    public ClusterView withSectorId(String sectorId) {
        this.sectorId = sectorId;
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

    public ClusterView withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The capNotes
     */
    @JsonProperty("capNotes")
    public String getCapNotes() {
        return capNotes;
    }

    /**
     * 
     * (Required)
     * 
     * @param capNotes
     *     The capNotes
     */
    @JsonProperty("capNotes")
    public void setCapNotes(String capNotes) {
        this.capNotes = capNotes;
    }

    public ClusterView withCapNotes(String capNotes) {
        this.capNotes = capNotes;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The capabilityDesc
     */
    @JsonProperty("capabilityDesc")
    public String getCapabilityDesc() {
        return capabilityDesc;
    }

    /**
     * 
     * (Required)
     * 
     * @param capabilityDesc
     *     The capabilityDesc
     */
    @JsonProperty("capabilityDesc")
    public void setCapabilityDesc(String capabilityDesc) {
        this.capabilityDesc = capabilityDesc;
    }

    public ClusterView withCapabilityDesc(String capabilityDesc) {
        this.capabilityDesc = capabilityDesc;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The capabilityNm
     */
    @JsonProperty("capabilityNm")
    public String getCapabilityNm() {
        return capabilityNm;
    }

    /**
     * 
     * (Required)
     * 
     * @param capabilityNm
     *     The capabilityNm
     */
    @JsonProperty("capabilityNm")
    public void setCapabilityNm(String capabilityNm) {
        this.capabilityNm = capabilityNm;
    }

    public ClusterView withCapabilityNm(String capabilityNm) {
        this.capabilityNm = capabilityNm;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The capabilityPos
     */
    @JsonProperty("capabilityPos")
    public String getCapabilityPos() {
        return capabilityPos;
    }

    /**
     * 
     * (Required)
     * 
     * @param capabilityPos
     *     The capabilityPos
     */
    @JsonProperty("capabilityPos")
    public void setCapabilityPos(String capabilityPos) {
        this.capabilityPos = capabilityPos;
    }

    public ClusterView withCapabilityPos(String capabilityPos) {
        this.capabilityPos = capabilityPos;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The highValue
     */
    @JsonProperty("highValue")
    public String getHighValue() {
        return highValue;
    }

    /**
     * 
     * (Required)
     * 
     * @param highValue
     *     The highValue
     */
    @JsonProperty("highValue")
    public void setHighValue(String highValue) {
        this.highValue = highValue;
    }

    public ClusterView withHighValue(String highValue) {
        this.highValue = highValue;
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

    public ClusterView withCreateDt(String createDt) {
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

    public ClusterView withLastUpdateDt(String lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The truncCapabilityNm
     */
    @JsonProperty("truncCapabilityNm")
    public String getTruncCapabilityNm() {
        return truncCapabilityNm;
    }

    /**
     * 
     * (Required)
     * 
     * @param truncCapabilityNm
     *     The truncCapabilityNm
     */
    @JsonProperty("truncCapabilityNm")
    public void setTruncCapabilityNm(String truncCapabilityNm) {
        this.truncCapabilityNm = truncCapabilityNm;
    }

    public ClusterView withTruncCapabilityNm(String truncCapabilityNm) {
        this.truncCapabilityNm = truncCapabilityNm;
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

    public ClusterView withUsrNmLastUpd(String usrNmLastUpd) {
        this.usrNmLastUpd = usrNmLastUpd;
        return this;
    }

}
