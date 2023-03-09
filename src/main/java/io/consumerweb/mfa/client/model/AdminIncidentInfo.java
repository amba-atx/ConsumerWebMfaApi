package io.consumerweb.mfa.client.model;

import java.util.Objects;

import org.joda.time.DateTime;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class AdminIncidentInfo
{
    @SerializedName("incidentId")
    private String incidentId;
    @SerializedName("createdOn")
    private DateTime createdOn;
    @SerializedName("modifiedOn")
    private DateTime modifiedOn;
    
    public AdminIncidentInfo() {
        this.incidentId = null;
        this.createdOn = null;
        this.modifiedOn = null;
    }
    
    public AdminIncidentInfo incidentId(final String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    
    @ApiModelProperty("")
    public String getIncidentId() {
        return this.incidentId;
    }
    
    public void setIncidentId(final String incidentId) {
        this.incidentId = incidentId;
    }
    
    public AdminIncidentInfo createdOn(final DateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public DateTime getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(final DateTime createdOn) {
        this.createdOn = createdOn;
    }
    
    public AdminIncidentInfo modifiedOn(final DateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public DateTime getModifiedOn() {
        return this.modifiedOn;
    }
    
    public void setModifiedOn(final DateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final AdminIncidentInfo adminIncidentInfo = (AdminIncidentInfo)o;
        return Objects.equals(this.incidentId, adminIncidentInfo.incidentId) && Objects.equals(this.createdOn, adminIncidentInfo.createdOn) && Objects.equals(this.modifiedOn, adminIncidentInfo.modifiedOn);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.incidentId, this.createdOn, this.modifiedOn);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminIncidentInfo {\n");
        sb.append("    incidentId: ").append(this.toIndentedString(this.incidentId)).append("\n");
        sb.append("    createdOn: ").append(this.toIndentedString(this.createdOn)).append("\n");
        sb.append("    modifiedOn: ").append(this.toIndentedString(this.modifiedOn)).append("\n");
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
