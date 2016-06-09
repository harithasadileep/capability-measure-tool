
package com.capability.raml.model;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * IndustryMap POST Response schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "result",
    "key"
})
public class PutMapsResponse {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("result")
    @NotNull
    private String result;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("key")
    @NotNull
    private String key;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The result
     */
    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    /**
     * 
     * (Required)
     * 
     * @param result
     *     The result
     */
    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    public PutMapsResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The key
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * 
     * (Required)
     * 
     * @param key
     *     The key
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public PutMapsResponse withKey(String key) {
        this.key = key;
        return this;
    }

}
