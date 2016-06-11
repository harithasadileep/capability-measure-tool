
package com.capability.raml.model;

import javax.annotation.Generated;
import javax.validation.Valid;
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
    "capability",
    "overLayXRef",
    "capabilityMaturity",
    "dimensionMaturity"
})
public class PutCapabilityDetails {

    /**
     * capability
     * <p>
     * 
     * 
     */
    @JsonProperty("capability")
    @Valid
    private Capability capability;
    /**
     * overLayXRef
     * <p>
     * 
     * 
     */
    @JsonProperty("overLayXRef")
    @Valid
    private OverLayXRef overLayXRef;
    /**
     * capabilityMaturity
     * <p>
     * 
     * 
     */
    @JsonProperty("capabilityMaturity")
    @Valid
    private CapabilityMaturity capabilityMaturity;
    /**
     * dimensionMaturity
     * <p>
     * 
     * 
     */
    @JsonProperty("dimensionMaturity")
    @Valid
    private DimensionMaturity dimensionMaturity;

    /**
     * capability
     * <p>
     * 
     * 
     * @return
     *     The capability
     */
    @JsonProperty("capability")
    public Capability getCapability() {
        return capability;
    }

    /**
     * capability
     * <p>
     * 
     * 
     * @param capability
     *     The capability
     */
    @JsonProperty("capability")
    public void setCapability(Capability capability) {
        this.capability = capability;
    }

    public PutCapabilityDetails withCapability(Capability capability) {
        this.capability = capability;
        return this;
    }

    /**
     * overLayXRef
     * <p>
     * 
     * 
     * @return
     *     The overLayXRef
     */
    @JsonProperty("overLayXRef")
    public OverLayXRef getOverLayXRef() {
        return overLayXRef;
    }

    /**
     * overLayXRef
     * <p>
     * 
     * 
     * @param overLayXRef
     *     The overLayXRef
     */
    @JsonProperty("overLayXRef")
    public void setOverLayXRef(OverLayXRef overLayXRef) {
        this.overLayXRef = overLayXRef;
    }

    public PutCapabilityDetails withOverLayXRef(OverLayXRef overLayXRef) {
        this.overLayXRef = overLayXRef;
        return this;
    }

    /**
     * capabilityMaturity
     * <p>
     * 
     * 
     * @return
     *     The capabilityMaturity
     */
    @JsonProperty("capabilityMaturity")
    public CapabilityMaturity getCapabilityMaturity() {
        return capabilityMaturity;
    }

    /**
     * capabilityMaturity
     * <p>
     * 
     * 
     * @param capabilityMaturity
     *     The capabilityMaturity
     */
    @JsonProperty("capabilityMaturity")
    public void setCapabilityMaturity(CapabilityMaturity capabilityMaturity) {
        this.capabilityMaturity = capabilityMaturity;
    }

    public PutCapabilityDetails withCapabilityMaturity(CapabilityMaturity capabilityMaturity) {
        this.capabilityMaturity = capabilityMaturity;
        return this;
    }

    /**
     * dimensionMaturity
     * <p>
     * 
     * 
     * @return
     *     The dimensionMaturity
     */
    @JsonProperty("dimensionMaturity")
    public DimensionMaturity getDimensionMaturity() {
        return dimensionMaturity;
    }

    /**
     * dimensionMaturity
     * <p>
     * 
     * 
     * @param dimensionMaturity
     *     The dimensionMaturity
     */
    @JsonProperty("dimensionMaturity")
    public void setDimensionMaturity(DimensionMaturity dimensionMaturity) {
        this.dimensionMaturity = dimensionMaturity;
    }

    public PutCapabilityDetails withDimensionMaturity(DimensionMaturity dimensionMaturity) {
        this.dimensionMaturity = dimensionMaturity;
        return this;
    }

}
