package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class MfaTokenAuthenticateRequest extends MfaRsaRequest
{
    private static final long serialVersionUID = 1L;
	@SerializedName("authenticationToken")
    private String authenticationToken;
    
    public MfaTokenAuthenticateRequest() {
        this.authenticationToken = null;
    }
    
    public MfaTokenAuthenticateRequest authenticationToken(final String authenticationToken) {
        this.authenticationToken = authenticationToken;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getAuthenticationToken() {
        return this.authenticationToken;
    }
    
    public void setAuthenticationToken(final String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaTokenAuthenticateRequest mfaTokenAuthenticateRequest = (MfaTokenAuthenticateRequest)o;
        return Objects.equals(this.authenticationToken, mfaTokenAuthenticateRequest.authenticationToken) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.authenticationToken, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaTokenAuthenticateRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    authenticationToken: ").append(this.toIndentedString(this.authenticationToken)).append("\n");
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
