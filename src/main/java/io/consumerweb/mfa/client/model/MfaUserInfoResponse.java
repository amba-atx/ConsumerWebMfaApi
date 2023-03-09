package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class MfaUserInfoResponse extends MfaRsaResponse
{
    private static final long serialVersionUID = 1L;
	@SerializedName("contactDetails")
    private MfaContactDetails contactDetails;
    @SerializedName("enrolledCredentials")
    private List<MfaCredentialType> enrolledCredentials;
    @SerializedName("availableQuestions")
    private MfaQuestionSet availableQuestions;
    
    public MfaUserInfoResponse() {
        this.contactDetails = null;
        this.enrolledCredentials = null;
        this.availableQuestions = null;
    }
    
    public MfaUserInfoResponse contactDetails(final MfaContactDetails contactDetails) {
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
    
    public MfaUserInfoResponse enrolledCredentials(final List<MfaCredentialType> enrolledCredentials) {
        this.enrolledCredentials = enrolledCredentials;
        return this;
    }
    
    public MfaUserInfoResponse addEnrolledCredentialsItem(final MfaCredentialType enrolledCredentialsItem) {
        if (this.enrolledCredentials == null) {
            this.enrolledCredentials = new ArrayList<MfaCredentialType>();
        }
        this.enrolledCredentials.add(enrolledCredentialsItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<MfaCredentialType> getEnrolledCredentials() {
        return this.enrolledCredentials;
    }
    
    public void setEnrolledCredentials(final List<MfaCredentialType> enrolledCredentials) {
        this.enrolledCredentials = enrolledCredentials;
    }
    
    public MfaUserInfoResponse availableQuestions(final MfaQuestionSet availableQuestions) {
        this.availableQuestions = availableQuestions;
        return this;
    }
    
    @ApiModelProperty("")
    public MfaQuestionSet getAvailableQuestions() {
        return this.availableQuestions;
    }
    
    public void setAvailableQuestions(final MfaQuestionSet availableQuestions) {
        this.availableQuestions = availableQuestions;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaUserInfoResponse mfaUserInfoResponse = (MfaUserInfoResponse)o;
        return Objects.equals(this.contactDetails, mfaUserInfoResponse.contactDetails) && Objects.equals(this.enrolledCredentials, mfaUserInfoResponse.enrolledCredentials) && Objects.equals(this.availableQuestions, mfaUserInfoResponse.availableQuestions) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.contactDetails, this.enrolledCredentials, this.availableQuestions, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaUserInfoResponse {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    contactDetails: ").append(this.toIndentedString(this.contactDetails)).append("\n");
        sb.append("    enrolledCredentials: ").append(this.toIndentedString(this.enrolledCredentials)).append("\n");
        sb.append("    availableQuestions: ").append(this.toIndentedString(this.availableQuestions)).append("\n");
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
