package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class MfaSupportIncidentRequest extends MfaRequest
{
    private static final long serialVersionUID = 1L;
	@SerializedName("appScope")
    private String appScope;
    @SerializedName("username")
    private String username;
    
    public MfaSupportIncidentRequest() {
        this.appScope = null;
        this.username = null;
    }
    
    public MfaSupportIncidentRequest appScope(final String appScope) {
        this.appScope = appScope;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getAppScope() {
        return this.appScope;
    }
    
    public void setAppScope(final String appScope) {
        this.appScope = appScope;
    }
    
    public MfaSupportIncidentRequest username(final String username) {
        this.username = username;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(final String username) {
        this.username = username;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaSupportIncidentRequest mfaSupportIncidentRequest = (MfaSupportIncidentRequest)o;
        return Objects.equals(this.appScope, mfaSupportIncidentRequest.appScope) && Objects.equals(this.username, mfaSupportIncidentRequest.username) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.appScope, this.username, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaSupportIncidentRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    appScope: ").append(this.toIndentedString(this.appScope)).append("\n");
        sb.append("    username: ").append(this.toIndentedString(this.username)).append("\n");
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
