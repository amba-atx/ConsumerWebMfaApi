package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class MfaDeviceRequest implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("devicePrint")
    private String devicePrint;
    @SerializedName("deviceTokenCookie")
    private String deviceTokenCookie;
    @SerializedName("deviceTokenFSO")
    private String deviceTokenFSO;
    @SerializedName("httpAccept")
    private String httpAccept;
    @SerializedName("httpAcceptChars")
    private String httpAcceptChars;
    @SerializedName("httpAcceptEncoding")
    private String httpAcceptEncoding;
    @SerializedName("httpAcceptLanguage")
    private String httpAcceptLanguage;
    @SerializedName("httpReferrer")
    private String httpReferrer;
    @SerializedName("ipAddress")
    private String ipAddress;
    @SerializedName("userAgent")
    private String userAgent;
    @SerializedName("geoLocation")
    private String geoLocation;
    
    public MfaDeviceRequest() {
        this.devicePrint = null;
        this.deviceTokenCookie = null;
        this.deviceTokenFSO = null;
        this.httpAccept = null;
        this.httpAcceptChars = null;
        this.httpAcceptEncoding = null;
        this.httpAcceptLanguage = null;
        this.httpReferrer = null;
        this.ipAddress = null;
        this.userAgent = null;
        this.geoLocation = null;
    }
    
    public MfaDeviceRequest devicePrint(final String devicePrint) {
        this.devicePrint = devicePrint;
        return this;
    }
    
    @ApiModelProperty("")
    public String getDevicePrint() {
        return this.devicePrint;
    }
    
    public void setDevicePrint(final String devicePrint) {
        this.devicePrint = devicePrint;
    }
    
    public MfaDeviceRequest deviceTokenCookie(final String deviceTokenCookie) {
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
    
    public MfaDeviceRequest deviceTokenFSO(final String deviceTokenFSO) {
        this.deviceTokenFSO = deviceTokenFSO;
        return this;
    }
    
    @ApiModelProperty("")
    public String getDeviceTokenFSO() {
        return this.deviceTokenFSO;
    }
    
    public void setDeviceTokenFSO(final String deviceTokenFSO) {
        this.deviceTokenFSO = deviceTokenFSO;
    }
    
    public MfaDeviceRequest httpAccept(final String httpAccept) {
        this.httpAccept = httpAccept;
        return this;
    }
    
    @ApiModelProperty("")
    public String getHttpAccept() {
        return this.httpAccept;
    }
    
    public void setHttpAccept(final String httpAccept) {
        this.httpAccept = httpAccept;
    }
    
    public MfaDeviceRequest httpAcceptChars(final String httpAcceptChars) {
        this.httpAcceptChars = httpAcceptChars;
        return this;
    }
    
    @ApiModelProperty("")
    public String getHttpAcceptChars() {
        return this.httpAcceptChars;
    }
    
    public void setHttpAcceptChars(final String httpAcceptChars) {
        this.httpAcceptChars = httpAcceptChars;
    }
    
    public MfaDeviceRequest httpAcceptEncoding(final String httpAcceptEncoding) {
        this.httpAcceptEncoding = httpAcceptEncoding;
        return this;
    }
    
    @ApiModelProperty("")
    public String getHttpAcceptEncoding() {
        return this.httpAcceptEncoding;
    }
    
    public void setHttpAcceptEncoding(final String httpAcceptEncoding) {
        this.httpAcceptEncoding = httpAcceptEncoding;
    }
    
    public MfaDeviceRequest httpAcceptLanguage(final String httpAcceptLanguage) {
        this.httpAcceptLanguage = httpAcceptLanguage;
        return this;
    }
    
    @ApiModelProperty("")
    public String getHttpAcceptLanguage() {
        return this.httpAcceptLanguage;
    }
    
    public void setHttpAcceptLanguage(final String httpAcceptLanguage) {
        this.httpAcceptLanguage = httpAcceptLanguage;
    }
    
    public MfaDeviceRequest httpReferrer(final String httpReferrer) {
        this.httpReferrer = httpReferrer;
        return this;
    }
    
    @ApiModelProperty("")
    public String getHttpReferrer() {
        return this.httpReferrer;
    }
    
    public void setHttpReferrer(final String httpReferrer) {
        this.httpReferrer = httpReferrer;
    }
    
    public MfaDeviceRequest ipAddress(final String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    
    @ApiModelProperty("")
    public String getIpAddress() {
        return this.ipAddress;
    }
    
    public void setIpAddress(final String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    public MfaDeviceRequest userAgent(final String userAgent) {
        this.userAgent = userAgent;
        return this;
    }
    
    @ApiModelProperty("")
    public String getUserAgent() {
        return this.userAgent;
    }
    
    public void setUserAgent(final String userAgent) {
        this.userAgent = userAgent;
    }
    
    public MfaDeviceRequest geoLocation(final String geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }
    
    @ApiModelProperty("")
    public String getGeoLocation() {
        return this.geoLocation;
    }
    
    public void setGeoLocation(final String geoLocation) {
        this.geoLocation = geoLocation;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaDeviceRequest mfaDeviceRequest = (MfaDeviceRequest)o;
        return Objects.equals(this.devicePrint, mfaDeviceRequest.devicePrint) && Objects.equals(this.deviceTokenCookie, mfaDeviceRequest.deviceTokenCookie) && Objects.equals(this.deviceTokenFSO, mfaDeviceRequest.deviceTokenFSO) && Objects.equals(this.httpAccept, mfaDeviceRequest.httpAccept) && Objects.equals(this.httpAcceptChars, mfaDeviceRequest.httpAcceptChars) && Objects.equals(this.httpAcceptEncoding, mfaDeviceRequest.httpAcceptEncoding) && Objects.equals(this.httpAcceptLanguage, mfaDeviceRequest.httpAcceptLanguage) && Objects.equals(this.httpReferrer, mfaDeviceRequest.httpReferrer) && Objects.equals(this.ipAddress, mfaDeviceRequest.ipAddress) && Objects.equals(this.userAgent, mfaDeviceRequest.userAgent) && Objects.equals(this.geoLocation, mfaDeviceRequest.geoLocation);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.devicePrint, this.deviceTokenCookie, this.deviceTokenFSO, this.httpAccept, this.httpAcceptChars, this.httpAcceptEncoding, this.httpAcceptLanguage, this.httpReferrer, this.ipAddress, this.userAgent, this.geoLocation);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaDeviceRequest {\n");
        sb.append("    devicePrint: ").append(this.toIndentedString(this.devicePrint)).append("\n");
        sb.append("    deviceTokenCookie: ").append(this.toIndentedString(this.deviceTokenCookie)).append("\n");
        sb.append("    deviceTokenFSO: ").append(this.toIndentedString(this.deviceTokenFSO)).append("\n");
        sb.append("    httpAccept: ").append(this.toIndentedString(this.httpAccept)).append("\n");
        sb.append("    httpAcceptChars: ").append(this.toIndentedString(this.httpAcceptChars)).append("\n");
        sb.append("    httpAcceptEncoding: ").append(this.toIndentedString(this.httpAcceptEncoding)).append("\n");
        sb.append("    httpAcceptLanguage: ").append(this.toIndentedString(this.httpAcceptLanguage)).append("\n");
        sb.append("    httpReferrer: ").append(this.toIndentedString(this.httpReferrer)).append("\n");
        sb.append("    ipAddress: ").append(this.toIndentedString(this.ipAddress)).append("\n");
        sb.append("    userAgent: ").append(this.toIndentedString(this.userAgent)).append("\n");
        sb.append("    geoLocation: ").append(this.toIndentedString(this.geoLocation)).append("\n");
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
