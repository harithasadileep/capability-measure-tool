
package com.capability.raml.model;

import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * exception wrapper
 * <p>
 * wrapper for API exception 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "exceptionObject"
})
public class ExceptionMessage {

    @JsonProperty("exceptionObject")
    @Valid
    private ExceptionObject exceptionObject;

    /**
     * 
     * @return
     *     The exceptionObject
     */
    @JsonProperty("exceptionObject")
    public ExceptionObject getExceptionObject() {
        return exceptionObject;
    }

    /**
     * 
     * @param exceptionObject
     *     The exceptionObject
     */
    @JsonProperty("exceptionObject")
    public void setExceptionObject(ExceptionObject exceptionObject) {
        this.exceptionObject = exceptionObject;
    }

    public ExceptionMessage withExceptionObject(ExceptionObject exceptionObject) {
        this.exceptionObject = exceptionObject;
        return this;
    }

}
