package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class AdminUserChange
{
    @SerializedName("date")
    private String date;
    @SerializedName("description")
    private String description;
    @SerializedName("type")
    private String type;
    
    public AdminUserChange() {
        this.date = null;
        this.description = null;
        this.type = null;
    }
    
    public AdminUserChange date(final String date) {
        this.date = date;
        return this;
    }
    
    @ApiModelProperty("")
    public String getDate() {
        return this.date;
    }
    
    public void setDate(final String date) {
        this.date = date;
    }
    
    public AdminUserChange description(final String description) {
        this.description = description;
        return this;
    }
    
    @ApiModelProperty("")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public AdminUserChange type(final String type) {
        this.type = type;
        return this;
    }
    
    @ApiModelProperty("")
    public String getType() {
        return this.type;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final AdminUserChange adminUserChange = (AdminUserChange)o;
        return Objects.equals(this.date, adminUserChange.date) && Objects.equals(this.description, adminUserChange.description) && Objects.equals(this.type, adminUserChange.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.date, this.description, this.type);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminUserChange {\n");
        sb.append("    date: ").append(this.toIndentedString(this.date)).append("\n");
        sb.append("    description: ").append(this.toIndentedString(this.description)).append("\n");
        sb.append("    type: ").append(this.toIndentedString(this.type)).append("\n");
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
