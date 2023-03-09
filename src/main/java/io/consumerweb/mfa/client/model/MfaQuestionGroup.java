package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class MfaQuestionGroup implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("questions")
    private List<MfaQuestion> questions;
    @SerializedName("name")
    private String name;
    
    public MfaQuestionGroup() {
        this.questions = null;
        this.name = null;
    }
    
    public MfaQuestionGroup questions(final List<MfaQuestion> questions) {
        this.questions = questions;
        return this;
    }
    
    public MfaQuestionGroup addQuestionsItem(final MfaQuestion questionsItem) {
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
    
    public MfaQuestionGroup name(final String name) {
        this.name = name;
        return this;
    }
    
    @ApiModelProperty("")
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaQuestionGroup mfaQuestionGroup = (MfaQuestionGroup)o;
        return Objects.equals(this.questions, mfaQuestionGroup.questions) && Objects.equals(this.name, mfaQuestionGroup.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.questions, this.name);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaQuestionGroup {\n");
        sb.append("    questions: ").append(this.toIndentedString(this.questions)).append("\n");
        sb.append("    name: ").append(this.toIndentedString(this.name)).append("\n");
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
