
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
 * schema for a generic list of IndustryMaps 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "size",
    "Map"
})
public class GetMapsResponse {

    @JsonProperty("size")
    private String size;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Map")
    @NotNull
    @Valid
    private List<com.capability.raml.model.Map> Map = new ArrayList<com.capability.raml.model.Map>();

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

    public GetMapsResponse withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The Map
     */
    @JsonProperty("Map")
    public List<com.capability.raml.model.Map> getMap() {
        return Map;
    }

    /**
     * 
     * (Required)
     * 
     * @param Map
     *     The Map
     */
    @JsonProperty("Map")
    public void setMap(List<com.capability.raml.model.Map> Map) {
        this.Map = Map;
    }

    public GetMapsResponse withMap(List<com.capability.raml.model.Map> Map) {
        this.Map = Map;
        return this;
    }

}
