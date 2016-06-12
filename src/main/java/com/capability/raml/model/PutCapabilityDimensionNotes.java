
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
 * IndustryMap POST Request Schema
 * <p>
 * schema to POST a IndustryMap
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "capabilityNote",
    "dimensionMaturityNote"
})
public class PutCapabilityDimensionNotes {

    /**
     * capability
     * <p>
     * 
     * 
     */
    @JsonProperty("capabilityNote")
    @Valid
    private CapabilityNote capabilityNote;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dimensionMaturityNote")
    @NotNull
    @Valid
    private List<DimensionMaturityNote> dimensionMaturityNote = new ArrayList<DimensionMaturityNote>();

    /**
     * capability
     * <p>
     * 
     * 
     * @return
     *     The capabilityNote
     */
    @JsonProperty("capabilityNote")
    public CapabilityNote getCapabilityNote() {
        return capabilityNote;
    }

    /**
     * capability
     * <p>
     * 
     * 
     * @param capabilityNote
     *     The capabilityNote
     */
    @JsonProperty("capabilityNote")
    public void setCapabilityNote(CapabilityNote capabilityNote) {
        this.capabilityNote = capabilityNote;
    }

    public PutCapabilityDimensionNotes withCapabilityNote(CapabilityNote capabilityNote) {
        this.capabilityNote = capabilityNote;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The dimensionMaturityNote
     */
    @JsonProperty("dimensionMaturityNote")
    public List<DimensionMaturityNote> getDimensionMaturityNote() {
        return dimensionMaturityNote;
    }

    /**
     * 
     * (Required)
     * 
     * @param dimensionMaturityNote
     *     The dimensionMaturityNote
     */
    @JsonProperty("dimensionMaturityNote")
    public void setDimensionMaturityNote(List<DimensionMaturityNote> dimensionMaturityNote) {
        this.dimensionMaturityNote = dimensionMaturityNote;
    }

    public PutCapabilityDimensionNotes withDimensionMaturityNote(List<DimensionMaturityNote> dimensionMaturityNote) {
        this.dimensionMaturityNote = dimensionMaturityNote;
        return this;
    }

}
