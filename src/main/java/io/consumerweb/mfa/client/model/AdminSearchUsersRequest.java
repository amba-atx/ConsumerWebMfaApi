package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class AdminSearchUsersRequest extends AdminRequest
{
    @SerializedName("searchCriteria")
    private AdminSearchCriteria searchCriteria;
    @SerializedName("maxResults")
    private Integer maxResults;
    
    public AdminSearchUsersRequest() {
        this.searchCriteria = null;
        this.maxResults = null;
    }
    
    public AdminSearchUsersRequest searchCriteria(final AdminSearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public AdminSearchCriteria getSearchCriteria() {
        return this.searchCriteria;
    }
    
    public void setSearchCriteria(final AdminSearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }
    
    public AdminSearchUsersRequest maxResults(final Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    
    @ApiModelProperty("")
    public Integer getMaxResults() {
        return this.maxResults;
    }
    
    public void setMaxResults(final Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final AdminSearchUsersRequest adminSearchUsersRequest = (AdminSearchUsersRequest)o;
        return Objects.equals(this.searchCriteria, adminSearchUsersRequest.searchCriteria) && Objects.equals(this.maxResults, adminSearchUsersRequest.maxResults) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.searchCriteria, this.maxResults, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminSearchUsersRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    searchCriteria: ").append(this.toIndentedString(this.searchCriteria)).append("\n");
        sb.append("    maxResults: ").append(this.toIndentedString(this.maxResults)).append("\n");
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
