
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
    "sectorId",
    "clusterNm"
})
public class ClusterList {

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

    public ClusterList withClusterId(String clusterId) {
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

    public ClusterList withMapId(String mapId) {
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

    public ClusterList withSectorId(String sectorId) {
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

    public ClusterList withClusterNm(String clusterNm) {
        this.clusterNm = clusterNm;
        return this;
    }

}
