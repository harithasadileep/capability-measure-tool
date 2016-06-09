
package com.capability.raml.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "exceptionCode",
    "timeStamp",
    "message",
    "correlationId",
    "httpCode",
    "causes"
})
public class ExceptionObject {

    /**
     * The provider exception code that is assigned to the exception message.
     * (Required)
     * 
     */
    @JsonProperty("exceptionCode")
    @NotNull
    private String exceptionCode;
    /**
     * The date and time that the exception message was generated in the ISO8601 format of YYYY-MM-DDThh:mm:ssZ in UTC time
     * (Required)
     * 
     */
    @JsonProperty("timeStamp")
    @NotNull
    private String timeStamp;
    /**
     * The generated exception message in the requested language
     * (Required)
     * 
     */
    @JsonProperty("message")
    @NotNull
    private String message;
    /**
     * A 128-bit Globally Unique Identifier (GUID) of an exception message that is output and corresponds to the processId of the calling process that requested the exception message
     * (Required)
     * 
     */
    @JsonProperty("correlationId")
    @NotNull
    @Pattern(regexp = "^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$")
    private String correlationId;
    /**
     * The IETF HTTP status code that is assigned to the exception message. -1 for other.
     * 
     */
    @JsonProperty("httpCode")
    private ExceptionObject.HttpCode httpCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("causes")
    @NotNull
    @Valid
    private List<Cause> causes = new ArrayList<Cause>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The provider exception code that is assigned to the exception message.
     * (Required)
     * 
     * @return
     *     The exceptionCode
     */
    @JsonProperty("exceptionCode")
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * The provider exception code that is assigned to the exception message.
     * (Required)
     * 
     * @param exceptionCode
     *     The exceptionCode
     */
    @JsonProperty("exceptionCode")
    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public ExceptionObject withExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
        return this;
    }

    /**
     * The date and time that the exception message was generated in the ISO8601 format of YYYY-MM-DDThh:mm:ssZ in UTC time
     * (Required)
     * 
     * @return
     *     The timeStamp
     */
    @JsonProperty("timeStamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * The date and time that the exception message was generated in the ISO8601 format of YYYY-MM-DDThh:mm:ssZ in UTC time
     * (Required)
     * 
     * @param timeStamp
     *     The timeStamp
     */
    @JsonProperty("timeStamp")
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public ExceptionObject withTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    /**
     * The generated exception message in the requested language
     * (Required)
     * 
     * @return
     *     The message
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * The generated exception message in the requested language
     * (Required)
     * 
     * @param message
     *     The message
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public ExceptionObject withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * A 128-bit Globally Unique Identifier (GUID) of an exception message that is output and corresponds to the processId of the calling process that requested the exception message
     * (Required)
     * 
     * @return
     *     The correlationId
     */
    @JsonProperty("correlationId")
    public String getCorrelationId() {
        return correlationId;
    }

    /**
     * A 128-bit Globally Unique Identifier (GUID) of an exception message that is output and corresponds to the processId of the calling process that requested the exception message
     * (Required)
     * 
     * @param correlationId
     *     The correlationId
     */
    @JsonProperty("correlationId")
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public ExceptionObject withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * The IETF HTTP status code that is assigned to the exception message. -1 for other.
     * 
     * @return
     *     The httpCode
     */
    @JsonProperty("httpCode")
    public ExceptionObject.HttpCode getHttpCode() {
        return httpCode;
    }

    /**
     * The IETF HTTP status code that is assigned to the exception message. -1 for other.
     * 
     * @param httpCode
     *     The httpCode
     */
    @JsonProperty("httpCode")
    public void setHttpCode(ExceptionObject.HttpCode httpCode) {
        this.httpCode = httpCode;
    }

    public ExceptionObject withHttpCode(ExceptionObject.HttpCode httpCode) {
        this.httpCode = httpCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The causes
     */
    @JsonProperty("causes")
    public List<Cause> getCauses() {
        return causes;
    }

    /**
     * 
     * (Required)
     * 
     * @param causes
     *     The causes
     */
    @JsonProperty("causes")
    public void setCauses(List<Cause> causes) {
        this.causes = causes;
    }

    public ExceptionObject withCauses(List<Cause> causes) {
        this.causes = causes;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ExceptionObject withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Generated("org.jsonschema2pojo")
    public static enum HttpCode {

        _400("400"),
        _403("403"),
        _404("404"),
        _405("405"),
        _406("406"),
        _409("409"),
        _410("410"),
        _500("500"),
        _501("501"),
        _503("503"),
        _1("-1");
        private final String value;
        private static Map<String, ExceptionObject.HttpCode> constants = new HashMap<String, ExceptionObject.HttpCode>();

        static {
            for (ExceptionObject.HttpCode c: values()) {
                constants.put(c.value, c);
            }
        }

        private HttpCode(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static ExceptionObject.HttpCode fromValue(String value) {
            ExceptionObject.HttpCode constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
