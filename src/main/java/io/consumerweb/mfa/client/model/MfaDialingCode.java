package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class MfaDialingCode implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("countryName")
    private String countryName;
    @SerializedName("dialPrefix")
    private String dialPrefix;
    
    public MfaDialingCode() {
        this.countryName = null;
        this.dialPrefix = null;
    }
    
    public MfaDialingCode countryName(final String countryName) {
        this.countryName = countryName;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getCountryName() {
        return this.countryName;
    }
    
    public void setCountryName(final String countryName) {
        this.countryName = countryName;
    }
    
    public MfaDialingCode dialPrefix(final String dialPrefix) {
        this.dialPrefix = dialPrefix;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getDialPrefix() {
        return this.dialPrefix;
    }
    
    public void setDialPrefix(final String dialPrefix) {
        this.dialPrefix = dialPrefix;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaDialingCode mfaDialingCode = (MfaDialingCode)o;
        return Objects.equals(this.countryName, mfaDialingCode.countryName) && Objects.equals(this.dialPrefix, mfaDialingCode.dialPrefix);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.countryName, this.dialPrefix);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaDialingCode {\n");
        sb.append("    countryName: ").append(this.toIndentedString(this.countryName)).append("\n");
        sb.append("    dialPrefix: ").append(this.toIndentedString(this.dialPrefix)).append("\n");
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
