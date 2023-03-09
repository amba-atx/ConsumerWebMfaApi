package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class MfaQuestionAuthenticateRequest extends MfaRsaRequest
{
    private static final long serialVersionUID = 1L;
	@SerializedName("questionAnswers")
    private List<MfaQuestionAnswer> questionAnswers;
    
    public MfaQuestionAuthenticateRequest() {
        this.questionAnswers = new ArrayList<MfaQuestionAnswer>();
    }
    
    public MfaQuestionAuthenticateRequest questionAnswers(final List<MfaQuestionAnswer> questionAnswers) {
        this.questionAnswers = questionAnswers;
        return this;
    }
    
    public MfaQuestionAuthenticateRequest addQuestionAnswersItem(final MfaQuestionAnswer questionAnswersItem) {
        this.questionAnswers.add(questionAnswersItem);
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public List<MfaQuestionAnswer> getQuestionAnswers() {
        return this.questionAnswers;
    }
    
    public void setQuestionAnswers(final List<MfaQuestionAnswer> questionAnswers) {
        this.questionAnswers = questionAnswers;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaQuestionAuthenticateRequest mfaQuestionAuthenticateRequest = (MfaQuestionAuthenticateRequest)o;
        return Objects.equals(this.questionAnswers, mfaQuestionAuthenticateRequest.questionAnswers) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.questionAnswers, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaQuestionAuthenticateRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    questionAnswers: ").append(this.toIndentedString(this.questionAnswers)).append("\n");
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
