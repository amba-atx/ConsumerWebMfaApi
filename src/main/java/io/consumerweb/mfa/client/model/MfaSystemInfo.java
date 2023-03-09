package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class MfaSystemInfo extends MfaResponse
{
    private static final long serialVersionUID = 1L;
	@SerializedName("availableLocales")
    private List<MfaCodedItem> availableLocales;
    @SerializedName("availablePhoneCountryCodes")
    private List<MfaDialingCode> availablePhoneCountryCodes;
    @SerializedName("availableCredetntials")
    private List<MfaCredentialType> availableCredetntials;
    
    public MfaSystemInfo() {
        this.availableLocales = null;
        this.availablePhoneCountryCodes = null;
        this.availableCredetntials = null;
    }
    
    public MfaSystemInfo availableLocales(final List<MfaCodedItem> availableLocales) {
        this.availableLocales = availableLocales;
        return this;
    }
    
    public MfaSystemInfo addAvailableLocalesItem(final MfaCodedItem availableLocalesItem) {
        if (this.availableLocales == null) {
            this.availableLocales = new ArrayList<MfaCodedItem>();
        }
        this.availableLocales.add(availableLocalesItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<MfaCodedItem> getAvailableLocales() {
        return this.availableLocales;
    }
    
    public void setAvailableLocales(final List<MfaCodedItem> availableLocales) {
        this.availableLocales = availableLocales;
    }
    
    public MfaSystemInfo availablePhoneCountryCodes(final List<MfaDialingCode> availablePhoneCountryCodes) {
        this.availablePhoneCountryCodes = availablePhoneCountryCodes;
        return this;
    }
    
    public MfaSystemInfo addAvailablePhoneCountryCodesItem(final MfaDialingCode availablePhoneCountryCodesItem) {
        if (this.availablePhoneCountryCodes == null) {
            this.availablePhoneCountryCodes = new ArrayList<MfaDialingCode>();
        }
        this.availablePhoneCountryCodes.add(availablePhoneCountryCodesItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<MfaDialingCode> getAvailablePhoneCountryCodes() {
        return this.availablePhoneCountryCodes;
    }
    
    public void setAvailablePhoneCountryCodes(final List<MfaDialingCode> availablePhoneCountryCodes) {
        this.availablePhoneCountryCodes = availablePhoneCountryCodes;
    }
    
    public MfaSystemInfo availableCredetntials(final List<MfaCredentialType> availableCredetntials) {
        this.availableCredetntials = availableCredetntials;
        return this;
    }
    
    public MfaSystemInfo addAvailableCredetntialsItem(final MfaCredentialType availableCredetntialsItem) {
        if (this.availableCredetntials == null) {
            this.availableCredetntials = new ArrayList<MfaCredentialType>();
        }
        this.availableCredetntials.add(availableCredetntialsItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<MfaCredentialType> getAvailableCredetntials() {
        return this.availableCredetntials;
    }
    
    public void setAvailableCredetntials(final List<MfaCredentialType> availableCredetntials) {
        this.availableCredetntials = availableCredetntials;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaSystemInfo mfaSystemInfo = (MfaSystemInfo)o;
        return Objects.equals(this.availableLocales, mfaSystemInfo.availableLocales) && Objects.equals(this.availablePhoneCountryCodes, mfaSystemInfo.availablePhoneCountryCodes) && Objects.equals(this.availableCredetntials, mfaSystemInfo.availableCredetntials) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.availableLocales, this.availablePhoneCountryCodes, this.availableCredetntials, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaSystemInfo {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    availableLocales: ").append(this.toIndentedString(this.availableLocales)).append("\n");
        sb.append("    availablePhoneCountryCodes: ").append(this.toIndentedString(this.availablePhoneCountryCodes)).append("\n");
        sb.append("    availableCredetntials: ").append(this.toIndentedString(this.availableCredetntials)).append("\n");
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
