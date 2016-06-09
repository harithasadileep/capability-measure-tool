
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
    "size",
    "MapView"
})
public class GetMapViewResponse {

    @JsonProperty("size")
    private String size;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("MapView")
    @NotNull
    @Valid
    private List<com.capability.raml.model.MapView> MapView = new ArrayList<com.capability.raml.model.MapView>();

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

    public GetMapViewResponse withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The MapView
     */
    @JsonProperty("MapView")
    public List<com.capability.raml.model.MapView> getMapView() {
        return MapView;
    }

    /**
     * 
     * (Required)
     * 
     * @param MapView
     *     The MapView
     */
    @JsonProperty("MapView")
    public void setMapView(List<com.capability.raml.model.MapView> MapView) {
        this.MapView = MapView;
    }

    public GetMapViewResponse withMapView(List<com.capability.raml.model.MapView> MapView) {
        this.MapView = MapView;
        return this;
    }

}
