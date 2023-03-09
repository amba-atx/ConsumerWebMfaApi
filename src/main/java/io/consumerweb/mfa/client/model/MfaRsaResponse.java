package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class MfaRsaResponse extends MfaResponse
{
    private static final long serialVersionUID = 1L;
	@SerializedName("organization")
    private String organization;
    @SerializedName("appScope")
    private String appScope;
    @SerializedName("username")
    private String username;
    @SerializedName("locale")
    private String locale;
    @SerializedName("status")
    private MfaUserStatus status;
    @SerializedName("sessionId")
    private String sessionId;
    @SerializedName("transactionId")
    private String transactionId;
    @SerializedName("deviceTokenCookie")
    private String deviceTokenCookie;
    @SerializedName("deviceTokenFso")
    private String deviceTokenFso;
    
    public MfaRsaResponse() {
        this.organization = null;
        this.appScope = null;
        this.username = null;
        this.locale = null;
        this.status = null;
        this.sessionId = null;
        this.transactionId = null;
        this.deviceTokenCookie = null;
        this.deviceTokenFso = null;
    }
    
    public MfaRsaResponse organization(final String organization) {
        this.organization = organization;
        return this;
    }
    
    @ApiModelProperty("")
    public String getOrganization() {
        return this.organization;
    }
    
    public void setOrganization(final String organization) {
        this.organization = organization;
    }
    
    public MfaRsaResponse appScope(final String appScope) {
        this.appScope = appScope;
        return this;
    }
    
    @ApiModelProperty("")
    public String getAppScope() {
        return this.appScope;
    }
    
    public void setAppScope(final String appScope) {
        this.appScope = appScope;
    }
    
    public MfaRsaResponse username(final String username) {
        this.username = username;
        return this;
    }
    
    @ApiModelProperty("")
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(final String username) {
        this.username = username;
    }
    
    public MfaRsaResponse locale(final String locale) {
        this.locale = locale;
        return this;
    }
    
    @ApiModelProperty("")
    public String getLocale() {
        return this.locale;
    }
    
    public void setLocale(final String locale) {
        this.locale = locale;
    }
    
    public MfaRsaResponse status(final MfaUserStatus status) {
        this.status = status;
        return this;
    }
    
    @ApiModelProperty("")
    public MfaUserStatus getStatus() {
        return this.status;
    }
    
    public void setStatus(final MfaUserStatus status) {
        this.status = status;
    }
    
    public MfaRsaResponse sessionId(final String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    
    @ApiModelProperty("")
    public String getSessionId() {
        return this.sessionId;
    }
    
    public void setSessionId(final String sessionId) {
        this.sessionId = sessionId;
    }
    
    public MfaRsaResponse transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    
    @ApiModelProperty("")
    public String getTransactionId() {
        return this.transactionId;
    }
    
    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }
    
    public MfaRsaResponse deviceTokenCookie(final String deviceTokenCookie) {
        this.deviceTokenCookie = deviceTokenCookie;
        return this;
    }
    
    @ApiModelProperty("")
    public String getDeviceTokenCookie() {
        return this.deviceTokenCookie;
    }
    
    public void setDeviceTokenCookie(final String deviceTokenCookie) {
        this.deviceTokenCookie = deviceTokenCookie;
    }
    
    public MfaRsaResponse deviceTokenFso(final String deviceTokenFso) {
        this.deviceTokenFso = deviceTokenFso;
        return this;
    }
    
    @ApiModelProperty("")
    public String getDeviceTokenFso() {
        return this.deviceTokenFso;
    }
    
    public void setDeviceTokenFso(final String deviceTokenFso) {
        this.deviceTokenFso = deviceTokenFso;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaRsaResponse mfaRsaResponse = (MfaRsaResponse)o;
        return Objects.equals(this.organization, mfaRsaResponse.organization) && Objects.equals(this.appScope, mfaRsaResponse.appScope) && Objects.equals(this.username, mfaRsaResponse.username) && Objects.equals(this.locale, mfaRsaResponse.locale) && Objects.equals(this.status, mfaRsaResponse.status) && Objects.equals(this.sessionId, mfaRsaResponse.sessionId) && Objects.equals(this.transactionId, mfaRsaResponse.transactionId) && Objects.equals(this.deviceTokenCookie, mfaRsaResponse.deviceTokenCookie) && Objects.equals(this.deviceTokenFso, mfaRsaResponse.deviceTokenFso) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.organization, this.appScope, this.username, this.locale, this.status, this.sessionId, this.transactionId, this.deviceTokenCookie, this.deviceTokenFso, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaRsaResponse {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    organization: ").append(this.toIndentedString(this.organization)).append("\n");
        sb.append("    appScope: ").append(this.toIndentedString(this.appScope)).append("\n");
        sb.append("    username: ").append(this.toIndentedString(this.username)).append("\n");
        sb.append("    locale: ").append(this.toIndentedString(this.locale)).append("\n");
        sb.append("    status: ").append(this.toIndentedString(this.status)).append("\n");
        sb.append("    sessionId: ").append(this.toIndentedString(this.sessionId)).append("\n");
        sb.append("    transactionId: ").append(this.toIndentedString(this.transactionId)).append("\n");
        sb.append("    deviceTokenCookie: ").append(this.toIndentedString(this.deviceTokenCookie)).append("\n");
        sb.append("    deviceTokenFso: ").append(this.toIndentedString(this.deviceTokenFso)).append("\n");
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
