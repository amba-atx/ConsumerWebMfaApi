package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class MfaQuestion implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("questionId")
    private String questionId;
    @SerializedName("questionText")
    private String questionText;
    
    public MfaQuestion() {
        this.questionId = null;
        this.questionText = null;
    }
    
    public MfaQuestion questionId(final String questionId) {
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
    
    public MfaQuestion questionText(final String questionText) {
        this.questionText = questionText;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getQuestionText() {
        return this.questionText;
    }
    
    public void setQuestionText(final String questionText) {
        this.questionText = questionText;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaQuestion mfaQuestion = (MfaQuestion)o;
        return Objects.equals(this.questionId, mfaQuestion.questionId) && Objects.equals(this.questionText, mfaQuestion.questionText);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.questionId, this.questionText);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaQuestion {\n");
        sb.append("    questionId: ").append(this.toIndentedString(this.questionId)).append("\n");
        sb.append("    questionText: ").append(this.toIndentedString(this.questionText)).append("\n");
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
