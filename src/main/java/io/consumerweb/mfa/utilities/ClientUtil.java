package io.consumerweb.mfa.utilities;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import io.consumerweb.mfa.client.model.MfaActionCode;
import io.consumerweb.mfa.client.model.MfaAnalyzeRequest;
import io.consumerweb.mfa.client.model.MfaAnalyzeResponse;
import io.consumerweb.mfa.client.model.MfaContactDetails;
import io.consumerweb.mfa.client.model.MfaCreateUserRequest;
import io.consumerweb.mfa.client.model.MfaDeviceRequest;
import io.consumerweb.mfa.client.model.MfaEnrollForEmailRequest;
import io.consumerweb.mfa.client.model.MfaEnrollForSmsRequest;
import io.consumerweb.mfa.client.model.MfaModifyUserResponse;
import io.consumerweb.mfa.client.model.MfaRsaRequest;
import io.consumerweb.mfa.client.model.MfaRsaResponse;
import io.consumerweb.mfa.client.model.MfaUpdateUserInfoRequest;
import io.consumerweb.mfa.client.model.MfaUserInfoRequest;
import io.consumerweb.mfa.client.model.MfaUserInfoResponse;
import io.consumerweb.mfa.client.model.MfaUserStatus;
import io.consumerweb.mfa.controllers.ConsumerWebMfa;
import io.consumerweb.mfa.model.ConsumerWebMfaInfo;
import io.consumerweb.mfa.model.ConsumerWebMfaResponse;

public class ClientUtil {

	public static MfaUserInfoRequest createMfaUserInfoRequest(HttpServletRequest request, HttpServletResponse response,
			String userId) {
		MfaUserInfoRequest requestData = new MfaUserInfoRequest();
		if (null != request && null != userId) {
			requestData.setShowFullPII(Boolean.TRUE);
			requestData.setShowEnrollmentOptions(Boolean.TRUE);
			requestData.setUsername(userId);
			requestData.setDeviceRequest(createDeviceRequest(request));
		}
		return requestData;

	}

	private static MfaDeviceRequest createDeviceRequest(HttpServletRequest request) {
		MfaDeviceRequest mfaDeviceRequest = new MfaDeviceRequest();
		if(null!=request) {
			mfaDeviceRequest.setDevicePrint(request.getParameter("mfaDevicePrint"));
			mfaDeviceRequest.setHttpAccept(request.getHeader("Accept"));
			mfaDeviceRequest.setHttpAcceptEncoding(request.getHeader("Accept-Encoding"));
			mfaDeviceRequest.setHttpAcceptLanguage(request.getHeader("Accept-Language"));
			mfaDeviceRequest.setHttpReferrer(request.getHeader("Referrer"));
			mfaDeviceRequest.setUserAgent(request.getHeader("User-Agent"));
			mfaDeviceRequest.setIpAddress(request.getParameter("mfaClientIP"));
			HttpSession session = request.getSession();
			if(null != session && null != session.getAttribute(ConsumerWebMfaInfo.DEVICE_TOKEN_COOKIE)) {
				mfaDeviceRequest.setDeviceTokenCookie(String.valueOf(session.getAttribute(ConsumerWebMfaInfo.DEVICE_TOKEN_COOKIE)));
			} else if( null != request.getAttribute(ConsumerWebMfaInfo.DEVICE_TOKEN_COOKIE)) {
				mfaDeviceRequest.setDeviceTokenCookie(String.valueOf(request.getAttribute(ConsumerWebMfaInfo.DEVICE_TOKEN_COOKIE)));
			}
		}
		return mfaDeviceRequest;
	}

	public static ConsumerWebMfaResponse getMfaResponseForUserInfo(MfaUserInfoRequest mfaUserInfoRequest, MfaUserInfoResponse mfaResponse) {
		ConsumerWebMfaResponse consumerWebmfaResponse = new ConsumerWebMfaResponse();
		if(null != mfaResponse) {
			if (MfaUserStatus.NOTENROLLED.equals(mfaResponse.getStatus())) {
                final MfaCreateUserRequest createRequestData = ClientUtil.getCreateRequestFromUserInfoRequest(mfaUserInfoRequest, mfaResponse);
                final MfaModifyUserResponse createUserResponse = ConsumerWebMfa.mfaCreateUser(createRequestData);
                consumerWebmfaResponse.setSessionID(createUserResponse.getSessionId());
                consumerWebmfaResponse.setTransactionID(createUserResponse.getTransactionId());
                consumerWebmfaResponse.setDeviceTokenCookie(createUserResponse.getDeviceTokenCookie());
                consumerWebmfaResponse.setDeviceTokenFSO(createUserResponse.getDeviceTokenFso());
//                if (null == createUserResponse) {
//                    response = ConsumerMfaIncidentTicket.createMfaSupportIncident(api, createRequestData, "ERROR_MFA", "Create user response is null", null);
//                    ConsumerMfaUserInfo.slf4jLogger.error("MFA Error. Create user response is null");
//                    ConsumerMfaUserInfo.slf4jLogger.debug("ConsumerWebMfaResponse: " + response);
//                    return response;
//                }
//                response = ConsumerWebMfaUtil.updatePropogatedProperties(response, createUserResponse);
//                if (Boolean.TRUE.equals(createUserResponse.getHasStatusExceptions())) {
//                    if (!new Integer(10000).equals(createUserResponse.getProcessingStatusCode())) {
//                        response = ConsumerMfaIncidentTicket.createMfaSupportIncident(api, createRequestData, "ERROR_MFA", createUserResponse.getProcessingStatusDescription(), createUserResponse.getProcessingStatusCode());
//                        ConsumerMfaUserInfo.slf4jLogger.error("MFA error received: " + createUserResponse.getProcessingStatusDescription());
//                        return response;
//                    }
//                    response.setStatusCode("ABORT_MFA");
//                    ConsumerMfaUserInfo.slf4jLogger.error("Abort MFA: " + createUserResponse.getProcessingStatusDescription());
//                }
//                else {
//                    ConsumerMfaUserInfo.slf4jLogger.info("MFA user created; now need to enroll the user");
//                    response.setStatusCode("RE_ENROLL");
//                    response.setMfaStatusCode(MfaUserStatus.NEWUSER);
//                }
            consumerWebmfaResponse.setStatusCode("RE_ENROLL");
            consumerWebmfaResponse.setMfaStatusCode(MfaUserStatus.NEWUSER);
//            consumerWebmfaResponse.setDeviceTokenCookie(mfaResponse.getDeviceTokenCookie());
//            consumerWebmfaResponse.setDeviceTokenFSO(mfaResponse.getDeviceTokenFso());
//            consumerWebmfaResponse.setTransactionID(mfaResponse.getTransactionId());
			}
            else if (MfaUserStatus.UNVERIFIED.equals(mfaResponse.getStatus())) {
                consumerWebmfaResponse.setStatusCode("RE_ENROLL");
                consumerWebmfaResponse.setMfaStatusCode(mfaResponse.getStatus());
                consumerWebmfaResponse.setDeviceTokenCookie(mfaResponse.getDeviceTokenCookie());
                consumerWebmfaResponse.setDeviceTokenFSO(mfaResponse.getDeviceTokenFso());
                consumerWebmfaResponse.setTransactionID(mfaResponse.getTransactionId());     
            }
//            else {
//                final MfaAnalyzeRequest analyzeRequestData = ConsumerWebMfaUtil.getAnalyzeRequestFromRsaRequest(requestData, mfaResponse);
//                response = ConsumerWebMfaUtil.analyzeRiskMFA(api, analyzeRequestData, response, mfaResponse.getContactDetails());
//            }
        }
        return consumerWebmfaResponse;
    }

	public static MfaCreateUserRequest getCreateRequestFromUserInfoRequest(MfaUserInfoRequest mfaUserInfoRequest,
			MfaUserInfoResponse mfaUserInfoResponse) {
		MfaCreateUserRequest mfaCreateUserRequest = new MfaCreateUserRequest();
		mfaCreateUserRequest.setOrganization(mfaUserInfoRequest.getOrganization());
		mfaCreateUserRequest.setAppScope(mfaUserInfoRequest.getAppScope());
		mfaCreateUserRequest.setDeviceRequest(mfaUserInfoRequest.getDeviceRequest());
		mfaCreateUserRequest.setLocale(mfaUserInfoRequest.getLocale());
		mfaCreateUserRequest.setSessionId(mfaUserInfoRequest.getSessionId());
		mfaCreateUserRequest.setTransactionId(mfaUserInfoResponse.getTransactionId());
		mfaCreateUserRequest.setUsername(mfaUserInfoResponse.getUsername());
		return mfaCreateUserRequest;
	}

	public static MfaEnrollForEmailRequest getMfaEmailRequestFromUpdateUserRequest(
			MfaUpdateUserInfoRequest mfaUpdateUserInfoRequest, MfaUserInfoResponse updateUserResponse) {
		MfaEnrollForEmailRequest enrollForEmailRequest = new MfaEnrollForEmailRequest();
		enrollForEmailRequest.setAppScope(mfaUpdateUserInfoRequest.getAppScope());
		enrollForEmailRequest.setUsername(mfaUpdateUserInfoRequest.getUsername());
		enrollForEmailRequest.setLocale(mfaUpdateUserInfoRequest.getLocale());
		enrollForEmailRequest.setDeviceRequest(mfaUpdateUserInfoRequest.getDeviceRequest());
		if(null != enrollForEmailRequest.getDeviceRequest()) {
			enrollForEmailRequest.getDeviceRequest().setDeviceTokenCookie(updateUserResponse.getDeviceTokenCookie());
			enrollForEmailRequest.getDeviceRequest().setDeviceTokenFSO(updateUserResponse.getDeviceTokenFso());
		}
		enrollForEmailRequest.setSessionId(mfaUpdateUserInfoRequest.getSessionId());
		enrollForEmailRequest.setTransactionId(mfaUpdateUserInfoRequest.getTransactionId());
		enrollForEmailRequest.setOrganization(mfaUpdateUserInfoRequest.getOrganization());
		return enrollForEmailRequest;
	}

	public static MfaRsaRequest getMfaRequestFromUpdateUserRequest(MfaUpdateUserInfoRequest mfaUpdateUserInfoRequest,
			MfaUserInfoResponse updateUserResponse) {
		MfaRsaRequest unenrollMfaRequestData = new MfaRsaRequest();
		unenrollMfaRequestData.setAppScope(mfaUpdateUserInfoRequest.getAppScope());
		unenrollMfaRequestData.setUsername(mfaUpdateUserInfoRequest.getUsername());
		unenrollMfaRequestData.setLocale(mfaUpdateUserInfoRequest.getLocale());
		unenrollMfaRequestData.setDeviceRequest(mfaUpdateUserInfoRequest.getDeviceRequest());
		if(null != unenrollMfaRequestData.getDeviceRequest()) {
			unenrollMfaRequestData.getDeviceRequest().setDeviceTokenCookie(updateUserResponse.getDeviceTokenCookie());
			unenrollMfaRequestData.getDeviceRequest().setDeviceTokenFSO(updateUserResponse.getDeviceTokenFso());
		}
		unenrollMfaRequestData.setSessionId(updateUserResponse.getSessionId());
		unenrollMfaRequestData.setTransactionId(updateUserResponse.getTransactionId());
		unenrollMfaRequestData.setOrganization(mfaUpdateUserInfoRequest.getOrganization());
		return unenrollMfaRequestData;
	}

	public static MfaEnrollForSmsRequest getMfaSMSRequestFromUpdateUserRequest(
			MfaUpdateUserInfoRequest mfaUpdateUserInfoRequest, MfaUserInfoResponse updateUserResponse) {
		MfaEnrollForSmsRequest mfaEnrollForSmsRequest = new MfaEnrollForSmsRequest();
		mfaEnrollForSmsRequest.setAppScope(mfaUpdateUserInfoRequest.getAppScope());
		mfaEnrollForSmsRequest.setUsername(mfaUpdateUserInfoRequest.getUsername());
		mfaEnrollForSmsRequest.setLocale(mfaUpdateUserInfoRequest.getLocale());
		mfaEnrollForSmsRequest.setDeviceRequest(mfaUpdateUserInfoRequest.getDeviceRequest());
		if(null != mfaEnrollForSmsRequest.getDeviceRequest()) {
			mfaEnrollForSmsRequest.getDeviceRequest().setDeviceTokenCookie(updateUserResponse.getDeviceTokenCookie());
			mfaEnrollForSmsRequest.getDeviceRequest().setDeviceTokenFSO(updateUserResponse.getDeviceTokenFso());
		}
		mfaEnrollForSmsRequest.setSessionId(updateUserResponse.getSessionId());
		mfaEnrollForSmsRequest.setTransactionId(updateUserResponse.getTransactionId());
		mfaEnrollForSmsRequest.setOrganization(mfaUpdateUserInfoRequest.getOrganization());
		return mfaEnrollForSmsRequest;
	}

	public static MfaAnalyzeRequest getAnalyzeRequestFromRsaRequest(MfaUpdateUserInfoRequest mfaUpdateUserInfoRequest,
			MfaUserInfoResponse updateUserResponse) {
		MfaAnalyzeRequest analyzeRequest = new MfaAnalyzeRequest();
		analyzeRequest.setAppScope(mfaUpdateUserInfoRequest.getAppScope());
		analyzeRequest.setUsername(mfaUpdateUserInfoRequest.getUsername());
		analyzeRequest.setLocale(mfaUpdateUserInfoRequest.getLocale());
		analyzeRequest.setDeviceRequest(mfaUpdateUserInfoRequest.getDeviceRequest());
		if(null != analyzeRequest.getDeviceRequest()) {
			analyzeRequest.getDeviceRequest().setDeviceTokenCookie(updateUserResponse.getDeviceTokenCookie());
			analyzeRequest.getDeviceRequest().setDeviceTokenFSO(updateUserResponse.getDeviceTokenFso());
		}
		analyzeRequest.setSessionId(updateUserResponse.getSessionId());
		analyzeRequest.setTransactionId(updateUserResponse.getTransactionId());
		analyzeRequest.setOrganization(mfaUpdateUserInfoRequest.getOrganization());
		return analyzeRequest;
	}

	public static ConsumerWebMfaResponse analyzeRiskMFA(MfaAnalyzeRequest analyzeRequest,
			ConsumerWebMfaResponse consumerWebMfaResponse, MfaContactDetails contactDetails) {
		MfaAnalyzeResponse analyzeResponse = ConsumerWebMfa.mfaAnalyzeProfile(analyzeRequest);
		if(null != analyzeResponse)
		{
			consumerWebMfaResponse.setSessionID(analyzeResponse.getSessionId());
			consumerWebMfaResponse.setTransactionID(analyzeResponse.getTransactionId());
			consumerWebMfaResponse.setDeviceTokenCookie(analyzeResponse.getDeviceTokenCookie());
			consumerWebMfaResponse.setDeviceTokenFSO(analyzeResponse.getDeviceTokenFso());
			if(null != analyzeResponse.getRiskResult()) {
				if(MfaActionCode.ALLOW.equals(analyzeResponse.getRiskResult().getActionCode())) {
					consumerWebMfaResponse.setStatusCode("ALLOW_LOGIN");
				} else if(MfaActionCode.DENY.equals(analyzeResponse.getRiskResult().getActionCode())) {
					consumerWebMfaResponse.setStatusCode("LOGIN_DENINED");
				} else if(MfaActionCode.REDIRECT_COLLECT.equals(analyzeResponse.getRiskResult().getActionCode())) {
					consumerWebMfaResponse.setStatusCode("REDIRECT_COLLECT");
				} else if(MfaActionCode.CHALLENGE.equals(analyzeResponse.getRiskResult().getActionCode())) {
					consumerWebMfaResponse.setStatusCode("CHALLENGE_LOGIN");
					consumerWebMfaResponse.setEnrolledCredentials(analyzeResponse.getRequiredCredentials());
					if(null != contactDetails) {
						consumerWebMfaResponse.setContactDetails(contactDetails);
					}
				}
			}
		}
		return consumerWebMfaResponse;
	}

	public static ConsumerWebMfaResponse createChallengeResponse(MfaRsaResponse mfaRsaResponse) {
		ConsumerWebMfaResponse consumerWebMfaResponse = new ConsumerWebMfaResponse();
		if(mfaRsaResponse != null) {
			consumerWebMfaResponse.setSessionID(mfaRsaResponse.getSessionId());
			consumerWebMfaResponse.setTransactionID(mfaRsaResponse.getTransactionId());
			consumerWebMfaResponse.setDeviceTokenCookie(mfaRsaResponse.getDeviceTokenCookie());
			consumerWebMfaResponse.setDeviceTokenFSO(mfaRsaResponse.getDeviceTokenFso());
			if(Boolean.FALSE.equals(mfaRsaResponse.getHasStatusExceptions())) {
				consumerWebMfaResponse.setStatusCode("CHALLENGE_SUCCESS");
			}
		} else {
			System.out.println("The response is null");
		}
		return consumerWebMfaResponse;
	}
}
