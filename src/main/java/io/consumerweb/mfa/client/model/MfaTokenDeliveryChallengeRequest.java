package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class MfaTokenDeliveryChallengeRequest extends MfaRsaRequest
{
    private static final long serialVersionUID = 1L;
	@SerializedName("contactDetailsLabel")
    private String contactDetailsLabel;
    
    public MfaTokenDeliveryChallengeRequest() {
        this.contactDetailsLabel = null;
    }
    
    public MfaTokenDeliveryChallengeRequest contactDetailsLabel(final String contactDetailsLabel) {
        this.contactDetailsLabel = contactDetailsLabel;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getContactDetailsLabel() {
        return this.contactDetailsLabel;
    }
    
    public void setContactDetailsLabel(final String contactDetailsLabel) {
        this.contactDetailsLabel = contactDetailsLabel;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaTokenDeliveryChallengeRequest mfaTokenDeliveryChallengeRequest = (MfaTokenDeliveryChallengeRequest)o;
        return Objects.equals(this.contactDetailsLabel, mfaTokenDeliveryChallengeRequest.contactDetailsLabel) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.contactDetailsLabel, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaTokenDeliveryChallengeRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    contactDetailsLabel: ").append(this.toIndentedString(this.contactDetailsLabel)).append("\n");
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
