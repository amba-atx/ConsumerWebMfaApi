package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class MfaSupportIncidentResponse extends MfaResponse
{
    private static final long serialVersionUID = 1L;
	@SerializedName("incidentId")
    private String incidentId;
    
    public MfaSupportIncidentResponse() {
        this.incidentId = null;
    }
    
    public MfaSupportIncidentResponse incidentId(final String incidentId) {
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
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaSupportIncidentResponse mfaSupportIncidentResponse = (MfaSupportIncidentResponse)o;
        return Objects.equals(this.incidentId, mfaSupportIncidentResponse.incidentId) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.incidentId, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaSupportIncidentResponse {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    incidentId: ").append(this.toIndentedString(this.incidentId)).append("\n");
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
