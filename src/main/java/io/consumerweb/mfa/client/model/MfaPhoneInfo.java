package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class MfaPhoneInfo implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("label")
    private String label;
    @SerializedName("areaCode")
    private String areaCode;
    @SerializedName("countryCode")
    private String countryCode;
    @SerializedName("phoneNumber")
    private String phoneNumber;
    
    public MfaPhoneInfo() {
        this.label = null;
        this.areaCode = null;
        this.countryCode = null;
        this.phoneNumber = null;
    }
    
    public MfaPhoneInfo label(final String label) {
        this.label = label;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(final String label) {
        this.label = label;
    }
    
    public MfaPhoneInfo areaCode(final String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    
    @ApiModelProperty("")
    public String getAreaCode() {
        return this.areaCode;
    }
    
    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
    }
    
    public MfaPhoneInfo countryCode(final String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getCountryCode() {
        return this.countryCode;
    }
    
    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }
    
    public MfaPhoneInfo phoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaPhoneInfo mfaPhoneInfo = (MfaPhoneInfo)o;
        return Objects.equals(this.label, mfaPhoneInfo.label) && Objects.equals(this.areaCode, mfaPhoneInfo.areaCode) && Objects.equals(this.countryCode, mfaPhoneInfo.countryCode) && Objects.equals(this.phoneNumber, mfaPhoneInfo.phoneNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.label, this.areaCode, this.countryCode, this.phoneNumber);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaPhoneInfo {\n");
        sb.append("    label: ").append(this.toIndentedString(this.label)).append("\n");
        sb.append("    areaCode: ").append(this.toIndentedString(this.areaCode)).append("\n");
        sb.append("    countryCode: ").append(this.toIndentedString(this.countryCode)).append("\n");
        sb.append("    phoneNumber: ").append(this.toIndentedString(this.phoneNumber)).append("\n");
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
