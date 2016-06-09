
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
 * schema for a generic list of capabilities 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "size",
    "ClusterView"
})
public class GetClusterViewResponse {

    @JsonProperty("size")
    private String size;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ClusterView")
    @NotNull
    @Valid
    private List<com.capability.raml.model.ClusterView> ClusterView = new ArrayList<com.capability.raml.model.ClusterView>();

    /**
     * 
     * @return
     *     The size
     */
    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    public GetClusterViewResponse withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The ClusterView
     */
    @JsonProperty("ClusterView")
    public List<com.capability.raml.model.ClusterView> getClusterView() {
        return ClusterView;
    }

    /**
     * 
     * (Required)
     * 
     * @param ClusterView
     *     The ClusterView
     */
    @JsonProperty("ClusterView")
    public void setClusterView(List<com.capability.raml.model.ClusterView> ClusterView) {
        this.ClusterView = ClusterView;
    }

    public GetClusterViewResponse withClusterView(List<com.capability.raml.model.ClusterView> ClusterView) {
        this.ClusterView = ClusterView;
        return this;
    }

}
