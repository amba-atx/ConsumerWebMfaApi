package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class MfaQuestionChallengeResponse extends MfaRsaResponse
{
    private static final long serialVersionUID = 1L;
	@SerializedName("questions")
    private List<MfaQuestion> questions;
    
    public MfaQuestionChallengeResponse() {
        this.questions = null;
    }
    
    public MfaQuestionChallengeResponse questions(final List<MfaQuestion> questions) {
        this.questions = questions;
        return this;
    }
    
    public MfaQuestionChallengeResponse addQuestionsItem(final MfaQuestion questionsItem) {
        if (this.questions == null) {
            this.questions = new ArrayList<MfaQuestion>();
        }
        this.questions.add(questionsItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<MfaQuestion> getQuestions() {
        return this.questions;
    }
    
    public void setQuestions(final List<MfaQuestion> questions) {
        this.questions = questions;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaQuestionChallengeResponse mfaQuestionChallengeResponse = (MfaQuestionChallengeResponse)o;
        return Objects.equals(this.questions, mfaQuestionChallengeResponse.questions) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.questions, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaQuestionChallengeResponse {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    questions: ").append(this.toIndentedString(this.questions)).append("\n");
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
