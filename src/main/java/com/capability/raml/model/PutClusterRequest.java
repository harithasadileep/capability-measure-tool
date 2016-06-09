
package com.capability.raml.model;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * IndustryMap POST Request Schema
 * <p>
 * schema to POST a IndustryMap
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "clusterName"
})
public class PutClusterRequest {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("clusterName")
    @NotNull
    private String clusterName;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The clusterName
     */
    @JsonProperty("clusterName")
    public String getClusterName() {
        return clusterName;
    }

    /**
     * 
     * (Required)
     * 
     * @param clusterName
     *     The clusterName
     */
    @JsonProperty("clusterName")
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public PutClusterRequest withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

}
