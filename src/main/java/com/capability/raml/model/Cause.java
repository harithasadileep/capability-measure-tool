
package com.capability.raml.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "causedetail"
})
public class Cause {

    /**
     * The detailed cause message which may be a stack trace or a raw exception message
     * 
     */
    @JsonProperty("causedetail")
    private String causedetail;

    /**
     * The detailed cause message which may be a stack trace or a raw exception message
     * 
     * @return
     *     The causedetail
     */
    @JsonProperty("causedetail")
    public String getCausedetail() {
        return causedetail;
    }

    /**
     * The detailed cause message which may be a stack trace or a raw exception message
     * 
     * @param causedetail
     *     The causedetail
     */
    @JsonProperty("causedetail")
    public void setCausedetail(String causedetail) {
        this.causedetail = causedetail;
    }

    public Cause withCausedetail(String causedetail) {
        this.causedetail = causedetail;
        return this;
    }

}
