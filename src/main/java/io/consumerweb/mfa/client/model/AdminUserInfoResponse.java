package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class AdminUserInfoResponse extends AdminResponse
{
    @SerializedName("userInfo")
    private AdminUserInfo userInfo;
    
    public AdminUserInfoResponse() {
        this.userInfo = null;
    }
    
    public AdminUserInfoResponse userInfo(final AdminUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    
    @ApiModelProperty("")
    public AdminUserInfo getUserInfo() {
        return this.userInfo;
    }
    
    public void setUserInfo(final AdminUserInfo userInfo) {
        this.userInfo = userInfo;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final AdminUserInfoResponse adminUserInfoResponse = (AdminUserInfoResponse)o;
        return Objects.equals(this.userInfo, adminUserInfoResponse.userInfo) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.userInfo, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminUserInfoResponse {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    userInfo: ").append(this.toIndentedString(this.userInfo)).append("\n");
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
