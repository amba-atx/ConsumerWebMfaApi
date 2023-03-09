package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class MfaAuthenticateResponse extends MfaRsaResponse
{
    private static final long serialVersionUID = 1L;
	@SerializedName("authenticationSuccess")
    private Boolean authenticationSuccess;
    
    public MfaAuthenticateResponse() {
        this.authenticationSuccess = null;
    }
    
    public MfaAuthenticateResponse authenticationSuccess(final Boolean authenticationSuccess) {
        this.authenticationSuccess = authenticationSuccess;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public Boolean getAuthenticationSuccess() {
        return this.authenticationSuccess;
    }
    
    public void setAuthenticationSuccess(final Boolean authenticationSuccess) {
        this.authenticationSuccess = authenticationSuccess;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaAuthenticateResponse mfaAuthenticateResponse = (MfaAuthenticateResponse)o;
        return Objects.equals(this.authenticationSuccess, mfaAuthenticateResponse.authenticationSuccess) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.authenticationSuccess, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaAuthenticateResponse {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    authenticationSuccess: ").append(this.toIndentedString(this.authenticationSuccess)).append("\n");
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
