package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class AdminSearchUsersResponse extends AdminResponse
{
    @SerializedName("results")
    private List<AdminUserKey> results;
    
    public AdminSearchUsersResponse() {
        this.results = null;
    }
    
    public AdminSearchUsersResponse results(final List<AdminUserKey> results) {
        this.results = results;
        return this;
    }
    
    public AdminSearchUsersResponse addResultsItem(final AdminUserKey resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<AdminUserKey>();
        }
        this.results.add(resultsItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<AdminUserKey> getResults() {
        return this.results;
    }
    
    public void setResults(final List<AdminUserKey> results) {
        this.results = results;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final AdminSearchUsersResponse adminSearchUsersResponse = (AdminSearchUsersResponse)o;
        return Objects.equals(this.results, adminSearchUsersResponse.results) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.results, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminSearchUsersResponse {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    results: ").append(this.toIndentedString(this.results)).append("\n");
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
