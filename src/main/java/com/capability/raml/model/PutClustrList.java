
package com.capability.raml.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Industry Map GET Response Schema
 * <p>
 * schema for a generic list of mapview 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Cluster"
})
public class PutClustrList {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Cluster")
    @NotNull
    @Valid
    private List<com.capability.raml.model.Cluster> Cluster = new ArrayList<com.capability.raml.model.Cluster>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The Cluster
     */
    @JsonProperty("Cluster")
    public List<com.capability.raml.model.Cluster> getCluster() {
        return Cluster;
    }

    /**
     * 
     * (Required)
     * 
     * @param Cluster
     *     The Cluster
     */
    @JsonProperty("Cluster")
    public void setCluster(List<com.capability.raml.model.Cluster> Cluster) {
        this.Cluster = Cluster;
    }

    public PutClustrList withCluster(List<com.capability.raml.model.Cluster> Cluster) {
        this.Cluster = Cluster;
        return this;
    }

}
