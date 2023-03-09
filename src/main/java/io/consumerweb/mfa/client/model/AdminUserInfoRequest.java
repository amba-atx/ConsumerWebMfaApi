package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class AdminUserInfoRequest extends AdminRequest
{
    @SerializedName("userKey")
    private AdminUserKey userKey;
    
    public AdminUserInfoRequest() {
        this.userKey = null;
    }
    
    public AdminUserInfoRequest userKey(final AdminUserKey userKey) {
        this.userKey = userKey;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public AdminUserKey getUserKey() {
        return this.userKey;
    }
    
    public void setUserKey(final AdminUserKey userKey) {
        this.userKey = userKey;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final AdminUserInfoRequest adminUserInfoRequest = (AdminUserInfoRequest)o;
        return Objects.equals(this.userKey, adminUserInfoRequest.userKey) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.userKey, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminUserInfoRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    userKey: ").append(this.toIndentedString(this.userKey)).append("\n");
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
