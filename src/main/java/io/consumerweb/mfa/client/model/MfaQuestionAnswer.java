package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class MfaQuestionAnswer implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("questionId")
    private String questionId;
    @SerializedName("userAnswer")
    private String userAnswer;
    
    public MfaQuestionAnswer() {
        this.questionId = null;
        this.userAnswer = null;
    }
    
    public MfaQuestionAnswer questionId(final String questionId) {
        this.questionId = questionId;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getQuestionId() {
        return this.questionId;
    }
    
    public void setQuestionId(final String questionId) {
        this.questionId = questionId;
    }
    
    public MfaQuestionAnswer userAnswer(final String userAnswer) {
        this.userAnswer = userAnswer;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getUserAnswer() {
        return this.userAnswer;
    }
    
    public void setUserAnswer(final String userAnswer) {
        this.userAnswer = userAnswer;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaQuestionAnswer mfaQuestionAnswer = (MfaQuestionAnswer)o;
        return Objects.equals(this.questionId, mfaQuestionAnswer.questionId) && Objects.equals(this.userAnswer, mfaQuestionAnswer.userAnswer);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.questionId, this.userAnswer);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaQuestionAnswer {\n");
        sb.append("    questionId: ").append(this.toIndentedString(this.questionId)).append("\n");
        sb.append("    userAnswer: ").append(this.toIndentedString(this.userAnswer)).append("\n");
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
