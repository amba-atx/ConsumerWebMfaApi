package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class AdminIncidentListResponse extends AdminResponse
{
    @SerializedName("incidents")
    private List<AdminIncidentInfo> incidents;
    
    public AdminIncidentListResponse() {
        this.incidents = null;
    }
    
    public AdminIncidentListResponse incidents(final List<AdminIncidentInfo> incidents) {
        this.incidents = incidents;
        return this;
    }
    
    public AdminIncidentListResponse addIncidentsItem(final AdminIncidentInfo incidentsItem) {
        if (this.incidents == null) {
            this.incidents = new ArrayList<AdminIncidentInfo>();
        }
        this.incidents.add(incidentsItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<AdminIncidentInfo> getIncidents() {
        return this.incidents;
    }
    
    public void setIncidents(final List<AdminIncidentInfo> incidents) {
        this.incidents = incidents;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final AdminIncidentListResponse adminIncidentListResponse = (AdminIncidentListResponse)o;
        return Objects.equals(this.incidents, adminIncidentListResponse.incidents) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.incidents, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminIncidentListResponse {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    incidents: ").append(this.toIndentedString(this.incidents)).append("\n");
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
