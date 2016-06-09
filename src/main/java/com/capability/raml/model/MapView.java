
package com.capability.raml.model;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "clusterId",
    "mapId",
    "versionId",
    "sectorId",
    "clusterNm",
    "clusterPos",
    "createDt",
    "lastUpdateDt",
    "usrNmLastUpd",
    "valueChainId"
})
public class MapView {

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
    @JsonProperty("clusterNm")
    @NotNull
    private String clusterNm;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("clusterPos")
    @NotNull
    private String clusterPos;
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
    @JsonProperty("usrNmLastUpd")
    @NotNull
    private String usrNmLastUpd;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("valueChainId")
    @NotNull
    private String valueChainId;

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

    public MapView withClusterId(String clusterId) {
        this.clusterId = clusterId;
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

    public MapView withMapId(String mapId) {
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

    public MapView withVersionId(String versionId) {
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

    public MapView withSectorId(String sectorId) {
        this.sectorId = sectorId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The clusterNm
     */
    @JsonProperty("clusterNm")
    public String getClusterNm() {
        return clusterNm;
    }

    /**
     * 
     * (Required)
     * 
     * @param clusterNm
     *     The clusterNm
     */
    @JsonProperty("clusterNm")
    public void setClusterNm(String clusterNm) {
        this.clusterNm = clusterNm;
    }

    public MapView withClusterNm(String clusterNm) {
        this.clusterNm = clusterNm;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The clusterPos
     */
    @JsonProperty("clusterPos")
    public String getClusterPos() {
        return clusterPos;
    }

    /**
     * 
     * (Required)
     * 
     * @param clusterPos
     *     The clusterPos
     */
    @JsonProperty("clusterPos")
    public void setClusterPos(String clusterPos) {
        this.clusterPos = clusterPos;
    }

    public MapView withClusterPos(String clusterPos) {
        this.clusterPos = clusterPos;
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

    public MapView withCreateDt(String createDt) {
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

    public MapView withLastUpdateDt(String lastUpdateDt) {
        this.lastUpdateDt = lastUpdateDt;
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

    public MapView withUsrNmLastUpd(String usrNmLastUpd) {
        this.usrNmLastUpd = usrNmLastUpd;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The valueChainId
     */
    @JsonProperty("valueChainId")
    public String getValueChainId() {
        return valueChainId;
    }

    /**
     * 
     * (Required)
     * 
     * @param valueChainId
     *     The valueChainId
     */
    @JsonProperty("valueChainId")
    public void setValueChainId(String valueChainId) {
        this.valueChainId = valueChainId;
    }

    public MapView withValueChainId(String valueChainId) {
        this.valueChainId = valueChainId;
        return this;
    }

}
