package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class MfaResponse implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("hasStatusExceptions")
    private Boolean hasStatusExceptions;
    @SerializedName("callStatus")
    private Integer callStatus;
    @SerializedName("processingStatusCode")
    private Integer processingStatusCode;
    @SerializedName("processingStatusDescription")
    private String processingStatusDescription;
    
    public MfaResponse() {
        this.hasStatusExceptions = null;
        this.callStatus = null;
        this.processingStatusCode = null;
        this.processingStatusDescription = null;
    }
    
    public MfaResponse hasStatusExceptions(final Boolean hasStatusExceptions) {
        this.hasStatusExceptions = hasStatusExceptions;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public Boolean getHasStatusExceptions() {
        return this.hasStatusExceptions;
    }
    
    public void setHasStatusExceptions(final Boolean hasStatusExceptions) {
        this.hasStatusExceptions = hasStatusExceptions;
    }
    
    public MfaResponse callStatus(final Integer callStatus) {
        this.callStatus = callStatus;
        return this;
    }
    
    @ApiModelProperty("")
    public Integer getCallStatus() {
        return this.callStatus;
    }
    
    public void setCallStatus(final Integer callStatus) {
        this.callStatus = callStatus;
    }
    
    public MfaResponse processingStatusCode(final Integer processingStatusCode) {
        this.processingStatusCode = processingStatusCode;
        return this;
    }
    
    @ApiModelProperty("")
    public Integer getProcessingStatusCode() {
        return this.processingStatusCode;
    }
    
    public void setProcessingStatusCode(final Integer processingStatusCode) {
        this.processingStatusCode = processingStatusCode;
    }
    
    public MfaResponse processingStatusDescription(final String processingStatusDescription) {
        this.processingStatusDescription = processingStatusDescription;
        return this;
    }
    
    @ApiModelProperty("")
    public String getProcessingStatusDescription() {
        return this.processingStatusDescription;
    }
    
    public void setProcessingStatusDescription(final String processingStatusDescription) {
        this.processingStatusDescription = processingStatusDescription;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaResponse mfaResponse = (MfaResponse)o;
        return Objects.equals(this.hasStatusExceptions, mfaResponse.hasStatusExceptions) && Objects.equals(this.callStatus, mfaResponse.callStatus) && Objects.equals(this.processingStatusCode, mfaResponse.processingStatusCode) && Objects.equals(this.processingStatusDescription, mfaResponse.processingStatusDescription);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.hasStatusExceptions, this.callStatus, this.processingStatusCode, this.processingStatusDescription);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaResponse {\n");
        sb.append("    hasStatusExceptions: ").append(this.toIndentedString(this.hasStatusExceptions)).append("\n");
        sb.append("    callStatus: ").append(this.toIndentedString(this.callStatus)).append("\n");
        sb.append("    processingStatusCode: ").append(this.toIndentedString(this.processingStatusCode)).append("\n");
        sb.append("    processingStatusDescription: ").append(this.toIndentedString(this.processingStatusDescription)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
