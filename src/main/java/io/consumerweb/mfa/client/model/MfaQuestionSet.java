package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class MfaQuestionSet implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("questionGroups")
    private List<MfaQuestionGroup> questionGroups;
    
    public MfaQuestionSet() {
        this.questionGroups = null;
    }
    
    public MfaQuestionSet questionGroups(final List<MfaQuestionGroup> questionGroups) {
        this.questionGroups = questionGroups;
        return this;
    }
    
    public MfaQuestionSet addQuestionGroupsItem(final MfaQuestionGroup questionGroupsItem) {
        if (this.questionGroups == null) {
            this.questionGroups = new ArrayList<MfaQuestionGroup>();
        }
        this.questionGroups.add(questionGroupsItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<MfaQuestionGroup> getQuestionGroups() {
        return this.questionGroups;
    }
    
    public void setQuestionGroups(final List<MfaQuestionGroup> questionGroups) {
        this.questionGroups = questionGroups;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaQuestionSet mfaQuestionSet = (MfaQuestionSet)o;
        return Objects.equals(this.questionGroups, mfaQuestionSet.questionGroups);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.questionGroups);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaQuestionSet {\n");
        sb.append("    questionGroups: ").append(this.toIndentedString(this.questionGroups)).append("\n");
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
