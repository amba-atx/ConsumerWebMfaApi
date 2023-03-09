package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class MfaQuestionChallengeRequest extends MfaRsaRequest
{
    private static final long serialVersionUID = 1L;
	@SerializedName("numberOfQuestions")
    private Integer numberOfQuestions;
    
    public MfaQuestionChallengeRequest() {
        this.numberOfQuestions = null;
    }
    
    public MfaQuestionChallengeRequest numberOfQuestions(final Integer numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
        return this;
    }
    
    @ApiModelProperty("")
    public Integer getNumberOfQuestions() {
        return this.numberOfQuestions;
    }
    
    public void setNumberOfQuestions(final Integer numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaQuestionChallengeRequest mfaQuestionChallengeRequest = (MfaQuestionChallengeRequest)o;
        return Objects.equals(this.numberOfQuestions, mfaQuestionChallengeRequest.numberOfQuestions) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.numberOfQuestions, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaQuestionChallengeRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    numberOfQuestions: ").append(this.toIndentedString(this.numberOfQuestions)).append("\n");
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
