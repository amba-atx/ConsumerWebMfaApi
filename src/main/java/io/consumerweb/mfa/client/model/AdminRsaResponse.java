package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
public class AdminRsaResponse extends AdminResponse
{
    @SerializedName("userStatus")
    private MfaUserStatus userStatus;
    @SerializedName("userChangeHistory")
    private List<AdminUserChange> userChangeHistory;
    
    public AdminRsaResponse() {
        this.userStatus = null;
        this.userChangeHistory = null;
    }
    
    public AdminRsaResponse userStatus(final MfaUserStatus userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    
    @ApiModelProperty("")
    public MfaUserStatus getUserStatus() {
        return this.userStatus;
    }
    
    public void setUserStatus(final MfaUserStatus userStatus) {
        this.userStatus = userStatus;
    }
    
    public AdminRsaResponse userChangeHistory(final List<AdminUserChange> userChangeHistory) {
        this.userChangeHistory = userChangeHistory;
        return this;
    }
    
    public AdminRsaResponse addUserChangeHistoryItem(final AdminUserChange userChangeHistoryItem) {
        if (this.userChangeHistory == null) {
            this.userChangeHistory = new ArrayList<AdminUserChange>();
        }
        this.userChangeHistory.add(userChangeHistoryItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<AdminUserChange> getUserChangeHistory() {
        return this.userChangeHistory;
    }
    
    public void setUserChangeHistory(final List<AdminUserChange> userChangeHistory) {
        this.userChangeHistory = userChangeHistory;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final AdminRsaResponse adminRsaResponse = (AdminRsaResponse)o;
        return Objects.equals(this.userStatus, adminRsaResponse.userStatus) && Objects.equals(this.userChangeHistory, adminRsaResponse.userChangeHistory) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.userStatus, this.userChangeHistory, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminRsaResponse {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    userStatus: ").append(this.toIndentedString(this.userStatus)).append("\n");
        sb.append("    userChangeHistory: ").append(this.toIndentedString(this.userChangeHistory)).append("\n");
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
