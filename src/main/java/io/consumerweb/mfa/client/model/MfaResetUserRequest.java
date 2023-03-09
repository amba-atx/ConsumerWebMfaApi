package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class MfaResetUserRequest extends MfaRsaRequest
{
    private static final long serialVersionUID = 1L;
	@SerializedName("includeUserData")
    private Boolean includeUserData;
    
    public MfaResetUserRequest() {
        this.includeUserData = null;
    }
    
    public MfaResetUserRequest includeUserData(final Boolean includeUserData) {
        this.includeUserData = includeUserData;
        return this;
    }
    
    @ApiModelProperty("")
    public Boolean getIncludeUserData() {
        return this.includeUserData;
    }
    
    public void setIncludeUserData(final Boolean includeUserData) {
        this.includeUserData = includeUserData;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaResetUserRequest mfaResetUserRequest = (MfaResetUserRequest)o;
        return Objects.equals(this.includeUserData, mfaResetUserRequest.includeUserData) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.includeUserData, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaResetUserRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    includeUserData: ").append(this.toIndentedString(this.includeUserData)).append("\n");
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
