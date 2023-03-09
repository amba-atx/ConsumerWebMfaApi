package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class MfaRsaRequest extends MfaRequest
{
    private static final long serialVersionUID = 1L;
	@SerializedName("appScope")
    private String appScope;
    @SerializedName("username")
    private String username;
    @SerializedName("locale")
    private String locale;
    @SerializedName("deviceRequest")
    private MfaDeviceRequest deviceRequest;
    @SerializedName("sessionId")
    private String sessionId;
    @SerializedName("transactionId")
    private String transactionId;
    
    public MfaRsaRequest() {
        this.appScope = null;
        this.username = null;
        this.locale = null;
        this.deviceRequest = null;
        this.sessionId = null;
        this.transactionId = null;
    }
    
    public MfaRsaRequest appScope(final String appScope) {
        this.appScope = appScope;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getAppScope() {
        return this.appScope;
    }
    
    public void setAppScope(final String appScope) {
        this.appScope = appScope;
    }
    
    public MfaRsaRequest username(final String username) {
        this.username = username;
        return this;
    }
    
    @ApiModelProperty(required = true, value = "")
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(final String username) {
        this.username = username;
    }
    
    public MfaRsaRequest locale(final String locale) {
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
    
    public MfaRsaRequest deviceRequest(final MfaDeviceRequest deviceRequest) {
        this.deviceRequest = deviceRequest;
        return this;
    }
    
    @ApiModelProperty("")
    public MfaDeviceRequest getDeviceRequest() {
        return this.deviceRequest;
    }
    
    public void setDeviceRequest(final MfaDeviceRequest deviceRequest) {
        this.deviceRequest = deviceRequest;
    }
    
    public MfaRsaRequest sessionId(final String sessionId) {
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
    
    public MfaRsaRequest transactionId(final String transactionId) {
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
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaRsaRequest mfaRsaRequest = (MfaRsaRequest)o;
        return Objects.equals(this.appScope, mfaRsaRequest.appScope) && Objects.equals(this.username, mfaRsaRequest.username) && Objects.equals(this.locale, mfaRsaRequest.locale) && Objects.equals(this.deviceRequest, mfaRsaRequest.deviceRequest) && Objects.equals(this.sessionId, mfaRsaRequest.sessionId) && Objects.equals(this.transactionId, mfaRsaRequest.transactionId) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.appScope, this.username, this.locale, this.deviceRequest, this.sessionId, this.transactionId, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaRsaRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    appScope: ").append(this.toIndentedString(this.appScope)).append("\n");
        sb.append("    username: ").append(this.toIndentedString(this.username)).append("\n");
        sb.append("    locale: ").append(this.toIndentedString(this.locale)).append("\n");
        sb.append("    deviceRequest: ").append(this.toIndentedString(this.deviceRequest)).append("\n");
        sb.append("    sessionId: ").append(this.toIndentedString(this.sessionId)).append("\n");
        sb.append("    transactionId: ").append(this.toIndentedString(this.transactionId)).append("\n");
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
