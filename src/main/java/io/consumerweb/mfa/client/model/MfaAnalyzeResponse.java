package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class MfaAnalyzeResponse extends MfaRsaResponse
{
    private static final long serialVersionUID = 1L;
	@SerializedName("riskResult")
    private MfaRiskResult riskResult;
    @SerializedName("requiredCredentials")
    private List<MfaCredentialType> requiredCredentials;
    
    public MfaAnalyzeResponse() {
        this.riskResult = null;
        this.requiredCredentials = null;
    }
    
    public MfaAnalyzeResponse riskResult(final MfaRiskResult riskResult) {
        this.riskResult = riskResult;
        return this;
    }
    
    @ApiModelProperty("")
    public MfaRiskResult getRiskResult() {
        return this.riskResult;
    }
    
    public void setRiskResult(final MfaRiskResult riskResult) {
        this.riskResult = riskResult;
    }
    
    public MfaAnalyzeResponse requiredCredentials(final List<MfaCredentialType> requiredCredentials) {
        this.requiredCredentials = requiredCredentials;
        return this;
    }
    
    public MfaAnalyzeResponse addRequiredCredentialsItem(final MfaCredentialType requiredCredentialsItem) {
        if (this.requiredCredentials == null) {
            this.requiredCredentials = new ArrayList<MfaCredentialType>();
        }
        this.requiredCredentials.add(requiredCredentialsItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<MfaCredentialType> getRequiredCredentials() {
        return this.requiredCredentials;
    }
    
    public void setRequiredCredentials(final List<MfaCredentialType> requiredCredentials) {
        this.requiredCredentials = requiredCredentials;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaAnalyzeResponse mfaAnalyzeResponse = (MfaAnalyzeResponse)o;
        return Objects.equals(this.riskResult, mfaAnalyzeResponse.riskResult) && Objects.equals(this.requiredCredentials, mfaAnalyzeResponse.requiredCredentials) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.riskResult, this.requiredCredentials, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaAnalyzeResponse {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    riskResult: ").append(this.toIndentedString(this.riskResult)).append("\n");
        sb.append("    requiredCredentials: ").append(this.toIndentedString(this.requiredCredentials)).append("\n");
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
