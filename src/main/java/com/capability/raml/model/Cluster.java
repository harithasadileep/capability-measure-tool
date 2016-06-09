
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
    "mapName",
    "sectorName",
    "clusterNm"
})
public class Cluster {

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
    @JsonProperty("mapName")
    @NotNull
    private String mapName;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sectorName")
    @NotNull
    private String sectorName;
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

    public Cluster withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The mapName
     */
    @JsonProperty("mapName")
    public String getMapName() {
        return mapName;
    }

    /**
     * 
     * (Required)
     * 
     * @param mapName
     *     The mapName
     */
    @JsonProperty("mapName")
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public Cluster withMapName(String mapName) {
        this.mapName = mapName;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The sectorName
     */
    @JsonProperty("sectorName")
    public String getSectorName() {
        return sectorName;
    }

    /**
     * 
     * (Required)
     * 
     * @param sectorName
     *     The sectorName
     */
    @JsonProperty("sectorName")
    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public Cluster withSectorName(String sectorName) {
        this.sectorName = sectorName;
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

    public Cluster withClusterNm(String clusterNm) {
        this.clusterNm = clusterNm;
        return this;
    }

}
