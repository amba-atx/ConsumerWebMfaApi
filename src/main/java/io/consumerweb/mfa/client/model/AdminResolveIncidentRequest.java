package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class AdminResolveIncidentRequest extends AdminRequest
{
    @SerializedName("incidentId")
    private String incidentId;
    @SerializedName("resolution")
    private String resolution;
    
    public AdminResolveIncidentRequest() {
        this.incidentId = null;
        this.resolution = null;
    }
    
    public AdminResolveIncidentRequest incidentId(final String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getIncidentId() {
        return this.incidentId;
    }
    
    public void setIncidentId(final String incidentId) {
        this.incidentId = incidentId;
    }
    
    public AdminResolveIncidentRequest resolution(final String resolution) {
        this.resolution = resolution;
        return this;
    }
    
    @ApiModelProperty("")
    public String getResolution() {
        return this.resolution;
    }
    
    public void setResolution(final String resolution) {
        this.resolution = resolution;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final AdminResolveIncidentRequest adminResolveIncidentRequest = (AdminResolveIncidentRequest)o;
        return Objects.equals(this.incidentId, adminResolveIncidentRequest.incidentId) && Objects.equals(this.resolution, adminResolveIncidentRequest.resolution) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.incidentId, this.resolution, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminResolveIncidentRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    incidentId: ").append(this.toIndentedString(this.incidentId)).append("\n");
        sb.append("    resolution: ").append(this.toIndentedString(this.resolution)).append("\n");
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
