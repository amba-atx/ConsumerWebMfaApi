package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class MfaEmailInfo implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("label")
    private String label;
    @SerializedName("emailAddress")
    private String emailAddress;
    
    public MfaEmailInfo() {
        this.label = null;
        this.emailAddress = null;
    }
    
    public MfaEmailInfo label(final String label) {
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
    
    public MfaEmailInfo emailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaEmailInfo mfaEmailInfo = (MfaEmailInfo)o;
        return Objects.equals(this.label, mfaEmailInfo.label) && Objects.equals(this.emailAddress, mfaEmailInfo.emailAddress);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.label, this.emailAddress);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaEmailInfo {\n");
        sb.append("    label: ").append(this.toIndentedString(this.label)).append("\n");
        sb.append("    emailAddress: ").append(this.toIndentedString(this.emailAddress)).append("\n");
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
