package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class MfaUpdateUserInfoRequest extends MfaRsaRequest
{
    private static final long serialVersionUID = 1L;
	@SerializedName("contactDetails")
    private MfaContactDetails contactDetails;
    
    public MfaUpdateUserInfoRequest() {
        this.contactDetails = null;
    }
    
    public MfaUpdateUserInfoRequest contactDetails(final MfaContactDetails contactDetails) {
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
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaUpdateUserInfoRequest mfaUpdateUserInfoRequest = (MfaUpdateUserInfoRequest)o;
        return Objects.equals(this.contactDetails, mfaUpdateUserInfoRequest.contactDetails) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.contactDetails, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaUpdateUserInfoRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    contactDetails: ").append(this.toIndentedString(this.contactDetails)).append("\n");
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
