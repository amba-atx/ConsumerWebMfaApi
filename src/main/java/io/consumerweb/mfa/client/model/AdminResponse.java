package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class AdminResponse
{
    @SerializedName("hasStatusExceptions")
    private Boolean hasStatusExceptions;
    @SerializedName("callStatus")
    private Integer callStatus;
    @SerializedName("processingStatusCode")
    private Integer processingStatusCode;
    @SerializedName("processingStatusDescription")
    private String processingStatusDescription;
    
    public AdminResponse() {
        this.hasStatusExceptions = null;
        this.callStatus = null;
        this.processingStatusCode = null;
        this.processingStatusDescription = null;
    }
    
    public AdminResponse hasStatusExceptions(final Boolean hasStatusExceptions) {
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
    
    public AdminResponse callStatus(final Integer callStatus) {
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
    
    public AdminResponse processingStatusCode(final Integer processingStatusCode) {
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
    
    public AdminResponse processingStatusDescription(final String processingStatusDescription) {
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
        final AdminResponse adminResponse = (AdminResponse)o;
        return Objects.equals(this.hasStatusExceptions, adminResponse.hasStatusExceptions) && Objects.equals(this.callStatus, adminResponse.callStatus) && Objects.equals(this.processingStatusCode, adminResponse.processingStatusCode) && Objects.equals(this.processingStatusDescription, adminResponse.processingStatusDescription);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.hasStatusExceptions, this.callStatus, this.processingStatusCode, this.processingStatusDescription);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminResponse {\n");
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
