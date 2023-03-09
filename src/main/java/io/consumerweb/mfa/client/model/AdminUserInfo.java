package io.consumerweb.mfa.client.model;

import java.util.Objects;

import org.joda.time.DateTime;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class AdminUserInfo extends AdminUserKey
{
    @SerializedName("locale")
    private String locale;
    @SerializedName("hash")
    private String hash;
    @SerializedName("contactDetails")
    private MfaContactDetails contactDetails;
    @SerializedName("createdOn")
    private DateTime createdOn;
    @SerializedName("modifiedOn")
    private DateTime modifiedOn;
    
    public AdminUserInfo() {
        this.locale = null;
        this.hash = null;
        this.contactDetails = null;
        this.createdOn = null;
        this.modifiedOn = null;
    }
    
    public AdminUserInfo locale(final String locale) {
        this.locale = locale;
        return this;
    }
    
    @ApiModelProperty("")
    public String getLocale() {
        return this.locale;
    }
    
    public void setLocale(final String locale) {
        this.locale = locale;
    }
    
    public AdminUserInfo hash(final String hash) {
        this.hash = hash;
        return this;
    }
    
    @ApiModelProperty("")
    public String getHash() {
        return this.hash;
    }
    
    public void setHash(final String hash) {
        this.hash = hash;
    }
    
    public AdminUserInfo contactDetails(final MfaContactDetails contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }
    
    @ApiModelProperty("")
    public MfaContactDetails getContactDetails() {
        return this.contactDetails;
    }
    
    public void setContactDetails(final MfaContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
    
    public AdminUserInfo createdOn(final DateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public DateTime getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(final DateTime createdOn) {
        this.createdOn = createdOn;
    }
    
    public AdminUserInfo modifiedOn(final DateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public DateTime getModifiedOn() {
        return this.modifiedOn;
    }
    
    public void setModifiedOn(final DateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final AdminUserInfo adminUserInfo = (AdminUserInfo)o;
        return Objects.equals(this.locale, adminUserInfo.locale) && Objects.equals(this.hash, adminUserInfo.hash) && Objects.equals(this.contactDetails, adminUserInfo.contactDetails) && Objects.equals(this.createdOn, adminUserInfo.createdOn) && Objects.equals(this.modifiedOn, adminUserInfo.modifiedOn) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.locale, this.hash, this.contactDetails, this.createdOn, this.modifiedOn, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminUserInfo {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    locale: ").append(this.toIndentedString(this.locale)).append("\n");
        sb.append("    hash: ").append(this.toIndentedString(this.hash)).append("\n");
        sb.append("    contactDetails: ").append(this.toIndentedString(this.contactDetails)).append("\n");
        sb.append("    createdOn: ").append(this.toIndentedString(this.createdOn)).append("\n");
        sb.append("    modifiedOn: ").append(this.toIndentedString(this.modifiedOn)).append("\n");
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
