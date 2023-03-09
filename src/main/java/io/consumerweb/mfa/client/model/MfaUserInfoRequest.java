package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

public class MfaUserInfoRequest extends MfaRsaRequest
{
    private static final long serialVersionUID = 1L;
	@SerializedName("showFullPII")
    private Boolean showFullPII;
    @SerializedName("showEnrollmentOptions")
    private Boolean showEnrollmentOptions;
    
    public MfaUserInfoRequest() {
        this.showFullPII = null;
        this.showEnrollmentOptions = null;
    }
    
    public MfaUserInfoRequest showFullPII(final Boolean showFullPII) {
        this.showFullPII = showFullPII;
        return this;
    }
    
    @ApiModelProperty("")
    public Boolean getShowFullPII() {
        return this.showFullPII;
    }
    
    public void setShowFullPII(final Boolean showFullPII) {
        this.showFullPII = showFullPII;
    }
    
    public MfaUserInfoRequest showEnrollmentOptions(final Boolean showEnrollmentOptions) {
        this.showEnrollmentOptions = showEnrollmentOptions;
        return this;
    }
    
    @ApiModelProperty("")
    public Boolean getShowEnrollmentOptions() {
        return this.showEnrollmentOptions;
    }
    
    public void setShowEnrollmentOptions(final Boolean showEnrollmentOptions) {
        this.showEnrollmentOptions = showEnrollmentOptions;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaUserInfoRequest mfaUserInfoRequest = (MfaUserInfoRequest)o;
        return Objects.equals(this.showFullPII, mfaUserInfoRequest.showFullPII) && Objects.equals(this.showEnrollmentOptions, mfaUserInfoRequest.showEnrollmentOptions) && super.equals(o);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.showFullPII, this.showEnrollmentOptions, super.hashCode());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaUserInfoRequest {\n");
        sb.append("    ").append(this.toIndentedString(super.toString())).append("\n");
        sb.append("    showFullPII: ").append(this.toIndentedString(this.showFullPII)).append("\n");
        sb.append("    showEnrollmentOptions: ").append(this.toIndentedString(this.showEnrollmentOptions)).append("\n");
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
