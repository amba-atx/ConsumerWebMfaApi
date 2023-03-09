package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class AdminRsaRequest extends AdminRequest
{
    @SerializedName("organization")
    private String organization;
    @SerializedName("userHash")
    private String userHash;
    @SerializedName("adminId")
    private String adminId;
    
    public AdminRsaRequest() {
        this.organization = null;
        this.userHash = null;
        this.adminId = null;
    }
    
    public AdminRsaRequest organization(final String organization) {
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
    
    public AdminRsaRequest userHash(final String userHash) {
        this.userHash = userHash;
        return this;
    }
    
    @ApiModelProperty("")
    public String getUserHash() {
        return this.userHash;
    }
    
    public void setUserHash(final String userHash) {
        this.userHash = userHash;
    }
    
    public AdminRsaRequest adminId(final String adminId) {
        this.adminId = adminId;
        return this;
    }
    
    @ApiModelProperty("")
    public String getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(final String adminId) {
        this.adminId = adminId;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final AdminRsaRequest adminRsaRequest = (AdminRsaRequest)o;
        return Objects.equals(this.organization, adminRsaRequest.organization) && Objects.equals(this.userHash, adminRsaRequest.userHash) && Objects.equals(this.adminId, adminRsaRequest.adminId) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.organization, this.userHash, this.adminId, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminRsaRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    organization: ").append(this.toIndentedString(this.organization)).append("\n");
        sb.append("    userHash: ").append(this.toIndentedString(this.userHash)).append("\n");
        sb.append("    adminId: ").append(this.toIndentedString(this.adminId)).append("\n");
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
