package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class MfaCodedItem implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("code")
    private String code;
    @SerializedName("name")
    private String name;
    
    public MfaCodedItem() {
        this.code = null;
        this.name = null;
    }
    
    public MfaCodedItem code(final String code) {
        this.code = code;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getCode() {
        return this.code;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    public MfaCodedItem name(final String name) {
        this.name = name;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
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
        final MfaCodedItem mfaCodedItem = (MfaCodedItem)o;
        return Objects.equals(this.code, mfaCodedItem.code) && Objects.equals(this.name, mfaCodedItem.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.code, this.name);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaCodedItem {\n");
        sb.append("    code: ").append(this.toIndentedString(this.code)).append("\n");
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
