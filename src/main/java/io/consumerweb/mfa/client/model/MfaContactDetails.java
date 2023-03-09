package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class MfaContactDetails implements Serializable
{
    private static final long serialVersionUID = 1L;
    @SerializedName("emailList")
    private List<MfaEmailInfo> emailList;
    @SerializedName("phoneList")
    private List<MfaPhoneInfo> phoneList;
    
    public MfaContactDetails() {
        this.emailList = null;
        this.phoneList = null;
    }
    
    public MfaContactDetails emailList(final List<MfaEmailInfo> emailList) {
        this.emailList = emailList;
        return this;
    }
    
    public MfaContactDetails addEmailListItem(final MfaEmailInfo emailListItem) {
        if (this.emailList == null) {
            this.emailList = new ArrayList<MfaEmailInfo>();
        }
        this.emailList.add(emailListItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<MfaEmailInfo> getEmailList() {
        return this.emailList;
    }
    
    public void setEmailList(final List<MfaEmailInfo> emailList) {
        this.emailList = emailList;
    }
    
    public MfaContactDetails phoneList(final List<MfaPhoneInfo> phoneList) {
        this.phoneList = phoneList;
        return this;
    }
    
    public MfaContactDetails addPhoneListItem(final MfaPhoneInfo phoneListItem) {
        if (this.phoneList == null) {
            this.phoneList = new ArrayList<MfaPhoneInfo>();
        }
        this.phoneList.add(phoneListItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<MfaPhoneInfo> getPhoneList() {
        return this.phoneList;
    }
    
    public void setPhoneList(final List<MfaPhoneInfo> phoneList) {
        this.phoneList = phoneList;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final MfaContactDetails mfaContactDetails = (MfaContactDetails)o;
        return Objects.equals(this.emailList, mfaContactDetails.emailList) && Objects.equals(this.phoneList, mfaContactDetails.phoneList);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.emailList, this.phoneList);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class MfaContactDetails {\n");
        sb.append("    emailList: ").append(this.toIndentedString(this.emailList)).append("\n");
        sb.append("    phoneList: ").append(this.toIndentedString(this.phoneList)).append("\n");
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
