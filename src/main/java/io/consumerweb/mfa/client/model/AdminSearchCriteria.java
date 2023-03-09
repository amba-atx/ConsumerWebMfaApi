package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class AdminSearchCriteria
{
    @SerializedName("appScope")
    private String appScope;
    @SerializedName("organization")
    private String organization;
    @SerializedName("username")
    private String username;
    
    public AdminSearchCriteria() {
        this.appScope = null;
        this.organization = null;
        this.username = null;
    }
    
    public AdminSearchCriteria appScope(final String appScope) {
        this.appScope = appScope;
        return this;
    }
    
    @ApiModelProperty("")
    public String getAppScope() {
        return this.appScope;
    }
    
    public void setAppScope(final String appScope) {
        this.appScope = appScope;
    }
    
    public AdminSearchCriteria organization(final String organization) {
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
    
    public AdminSearchCriteria username(final String username) {
        this.username = username;
        return this;
    }
    
    @ApiModelProperty("")
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
        final AdminSearchCriteria adminSearchCriteria = (AdminSearchCriteria)o;
        return Objects.equals(this.appScope, adminSearchCriteria.appScope) && Objects.equals(this.organization, adminSearchCriteria.organization) && Objects.equals(this.username, adminSearchCriteria.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.appScope, this.organization, this.username);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminSearchCriteria {\n");
        sb.append("    appScope: ").append(this.toIndentedString(this.appScope)).append("\n");
        sb.append("    organization: ").append(this.toIndentedString(this.organization)).append("\n");
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
