package io.consumerweb.mfa.model;

import java.io.Serializable;
import java.util.List;

import io.consumerweb.mfa.client.model.MfaContactDetails;
import io.consumerweb.mfa.client.model.MfaCredentialType;
import io.consumerweb.mfa.client.model.MfaDialingCode;
import io.consumerweb.mfa.client.model.MfaUserStatus;

public class ConsumerWebMfaResponse implements Serializable
	{
	    private static final long serialVersionUID = 1L;
	    private String statusCode;
	    private MfaUserStatus mfaStatusCode;
	    private String sessionID;
	    private String transactionID;
	    private List<MfaCredentialType> enrolledCredentials;
	    private MfaContactDetails contactDetails;
	    private String incidentID;
	    private String deviceTokenCookie;
	    private String deviceTokenFSO;
	    private String statusDesc;
	    private String mfaErrorCode;
	    private List<MfaDialingCode> availablePhoneCountryCodes;
	    
	    public ConsumerWebMfaResponse() {
	        this.statusDesc = "SUCCESS";
	        this.mfaErrorCode = "NA";
	        this.availablePhoneCountryCodes = null;
	    }
	    
	    public String getStatusCode() {
	        return this.statusCode;
	    }
	    
	    public void setStatusCode(final String statusCode) {
	        this.statusCode = statusCode;
	    }
	    
	    public MfaUserStatus getMfaStatusCode() {
	        return this.mfaStatusCode;
	    }
	    
	    public void setMfaStatusCode(final MfaUserStatus mfaStatusCode) {
	        this.mfaStatusCode = mfaStatusCode;
	    }
	    
	    public String getSessionID() {
	        return this.sessionID;
	    }
	    
	    public void setSessionID(final String sessionID) {
	        this.sessionID = sessionID;
	    }
	    
	    public String getTransactionID() {
	        return this.transactionID;
	    }
	    
	    public void setTransactionID(final String transactionID) {
	        this.transactionID = transactionID;
	    }
	    
	    public List<MfaCredentialType> getEnrolledCredentials() {
	        return this.enrolledCredentials;
	    }
	    
	    public void setEnrolledCredentials(final List<MfaCredentialType> enrolledCredentials) {
	        this.enrolledCredentials = enrolledCredentials;
	    }
	    
	    public MfaContactDetails getContactDetails() {
	        return this.contactDetails;
	    }
	    
	    public void setContactDetails(final MfaContactDetails contactDetails) {
	        this.contactDetails = contactDetails;
	    }
	    
	    public String getIncidentID() {
	        return this.incidentID;
	    }
	    
	    public void setIncidentID(final String incidentID) {
	        this.incidentID = incidentID;
	    }
	    
	    public String getDeviceTokenCookie() {
	        return this.deviceTokenCookie;
	    }
	    
	    public void setDeviceTokenCookie(final String deviceTokenCookie) {
	        this.deviceTokenCookie = deviceTokenCookie;
	    }
	    
	    public String getDeviceTokenFSO() {
	        return this.deviceTokenFSO;
	    }
	    
	    public void setDeviceTokenFSO(final String deviceTokenFSO) {
	        this.deviceTokenFSO = deviceTokenFSO;
	    }
	    
	    public String getStatusDesc() {
	        return this.statusDesc;
	    }
	    
	    public void setStatusDesc(final String statusDesc) {
	        this.statusDesc = statusDesc;
	    }
	    
	    public List<MfaDialingCode> getAvailablePhoneCountryCodes() {
	        return this.availablePhoneCountryCodes;
	    }
	    
	    public void setAvailablePhoneCountryCodes(final List<MfaDialingCode> availablePhoneCountryCodes) {
	        this.availablePhoneCountryCodes = availablePhoneCountryCodes;
	    }
	    
	    public String getMfaErrorCode() {
	        return this.mfaErrorCode;
	    }
	    
	    public void setMfaErrorCode(final Integer mfaErrorCode) {
	        if (null != mfaErrorCode) {
	            this.mfaErrorCode = mfaErrorCode.toString();
	        }
	    }
	    
	    @Override
	    public String toString() {
	        return "ConsumerWebMfaResponse { \nstatusCode = " + this.statusCode + "\nsessionID = " + this.sessionID + "\ntransactionID = " + this.transactionID + "\nenrolledCredentials = " + ((null != this.enrolledCredentials) ? this.enrolledCredentials.toString() : "") + "\ncontactDetails = " + ((null != this.contactDetails) ? this.contactDetails.toString() : "") + "\nincidentID = " + this.incidentID + "\ndeviceTokenCookie = " + this.deviceTokenCookie + "\ndeviceTokenFSO = " + this.deviceTokenFSO + "\nstatusDesc = " + this.statusDesc + "\nmfaErrorCode = " + this.mfaErrorCode + "\navailablePhoneCountryCodes = " + ((null != this.availablePhoneCountryCodes) ? this.availablePhoneCountryCodes.toString() : "") + "\n}";
	    }
	}