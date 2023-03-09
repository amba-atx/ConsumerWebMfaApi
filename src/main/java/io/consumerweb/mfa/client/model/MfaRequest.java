package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class MfaRequest implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("organization")
    private String organization;
    
    public MfaRequest() {
        this.organization = null;
    }
    
    public MfaRequest organization(final String organization) {
        this.organization = organization;
        return this;
    }
    
    @ApiModelProperty("")
    public String getOrganization() {
        return this.organization;
    }
    
    public void setOrganization(final String organization) {
        this.organization = organization;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaRequest mfaRequest = (MfaRequest)o;
        return Objects.equals(this.organization, mfaRequest.organization);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.organization);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaRequest {\n");
        sb.append("    organization: ").append(this.toIndentedString(this.organization)).append("\n");
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
