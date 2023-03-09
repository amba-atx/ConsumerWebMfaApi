package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class MfaRiskResult implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("riskScore")
    private Integer riskScore;
    @SerializedName("riskScoreBand")
    private String riskScoreBand;
    @SerializedName("actionCode")
    private MfaActionCode actionCode;
    @SerializedName("actionName")
    private String actionName;
    
    public MfaRiskResult() {
        this.riskScore = null;
        this.riskScoreBand = null;
        this.actionCode = null;
        this.actionName = null;
    }
    
    public MfaRiskResult riskScore(final Integer riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    
    @ApiModelProperty("")
    public Integer getRiskScore() {
        return this.riskScore;
    }
    
    public void setRiskScore(final Integer riskScore) {
        this.riskScore = riskScore;
    }
    
    public MfaRiskResult riskScoreBand(final String riskScoreBand) {
        this.riskScoreBand = riskScoreBand;
        return this;
    }
    
    @ApiModelProperty("")
    public String getRiskScoreBand() {
        return this.riskScoreBand;
    }
    
    public void setRiskScoreBand(final String riskScoreBand) {
        this.riskScoreBand = riskScoreBand;
    }
    
    public MfaRiskResult actionCode(final MfaActionCode actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    
    @ApiModelProperty("")
    public MfaActionCode getActionCode() {
        return this.actionCode;
    }
    
    public void setActionCode(final MfaActionCode actionCode) {
        this.actionCode = actionCode;
    }
    
    public MfaRiskResult actionName(final String actionName) {
        this.actionName = actionName;
        return this;
    }
    
    @ApiModelProperty("")
    public String getActionName() {
        return this.actionName;
    }
    
    public void setActionName(final String actionName) {
        this.actionName = actionName;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaRiskResult mfaRiskResult = (MfaRiskResult)o;
        return Objects.equals(this.riskScore, mfaRiskResult.riskScore) && Objects.equals(this.riskScoreBand, mfaRiskResult.riskScoreBand) && Objects.equals(this.actionCode, mfaRiskResult.actionCode) && Objects.equals(this.actionName, mfaRiskResult.actionName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.riskScore, this.riskScoreBand, this.actionCode, this.actionName);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaRiskResult {\n");
        sb.append("    riskScore: ").append(this.toIndentedString(this.riskScore)).append("\n");
        sb.append("    riskScoreBand: ").append(this.toIndentedString(this.riskScoreBand)).append("\n");
        sb.append("    actionCode: ").append(this.toIndentedString(this.actionCode)).append("\n");
        sb.append("    actionName: ").append(this.toIndentedString(this.actionName)).append("\n");
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
