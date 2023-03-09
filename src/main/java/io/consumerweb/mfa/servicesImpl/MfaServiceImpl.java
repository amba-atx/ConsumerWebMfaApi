package io.consumerweb.mfa.servicesImpl;

import org.springframework.stereotype.Service;

import io.consumerweb.mfa.client.model.MfaAnalyzeRequest;
import io.consumerweb.mfa.client.model.MfaEnrollForEmailRequest;
import io.consumerweb.mfa.client.model.MfaEnrollForSmsRequest;
import io.consumerweb.mfa.client.model.MfaModifyUserResponse;
import io.consumerweb.mfa.client.model.MfaRsaRequest;
import io.consumerweb.mfa.client.model.MfaRsaResponse;
import io.consumerweb.mfa.client.model.MfaTokenDeliveryChallengeRequest;
import io.consumerweb.mfa.client.model.MfaUpdateUserInfoRequest;
import io.consumerweb.mfa.client.model.MfaUserInfoRequest;
import io.consumerweb.mfa.client.model.MfaUserInfoResponse;
import io.consumerweb.mfa.controllers.ConsumerWebMfa;
import io.consumerweb.mfa.model.ConsumerWebMfaResponse;
import io.consumerweb.mfa.services.MfaService;
import io.consumerweb.mfa.utilities.ClientUtil;

@Service
public class MfaServiceImpl implements MfaService {

	@Override
	public ConsumerWebMfaResponse retrieveMfaUserInfo(MfaUserInfoRequest infoRequest) {
		ConsumerWebMfaResponse consumerWebMfaResponse = new ConsumerWebMfaResponse();
		MfaUserInfoResponse mfaUserInfoResponse = new MfaUserInfoResponse();
		if (null != infoRequest) {
			try {
				mfaUserInfoResponse = ConsumerWebMfa.retrieveMfaUserInfo(infoRequest);
				consumerWebMfaResponse.setSessionID(mfaUserInfoResponse.getSessionId());
				consumerWebMfaResponse.setTransactionID(mfaUserInfoResponse.getTransactionId());
				consumerWebMfaResponse.setDeviceTokenCookie(mfaUserInfoResponse.getDeviceTokenCookie());
				consumerWebMfaResponse.setDeviceTokenFSO(mfaUserInfoResponse.getDeviceTokenFso());
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		consumerWebMfaResponse = ClientUtil.getMfaResponseForUserInfo(infoRequest, mfaUserInfoResponse);
		return consumerWebMfaResponse;
	}

	@Override
	public ConsumerWebMfaResponse updateMfaUserInfo(MfaUpdateUserInfoRequest mfaUpdateUserInfoRequest,
			Boolean enrollForEmail, Boolean enrollForSMS, Boolean enrollForPhone) {
		ConsumerWebMfaResponse consumerWebMfaResponse = new ConsumerWebMfaResponse();
		MfaUserInfoResponse updateUserResponse = new MfaUserInfoResponse();
		if (null != mfaUpdateUserInfoRequest) {
			try {
				updateUserResponse = ConsumerWebMfa.mfaUpdateUserInfo(mfaUpdateUserInfoRequest);
				consumerWebMfaResponse.setSessionID(updateUserResponse.getSessionId());
				consumerWebMfaResponse.setTransactionID(updateUserResponse.getTransactionId());
				consumerWebMfaResponse.setDeviceTokenCookie(updateUserResponse.getDeviceTokenCookie());
				consumerWebMfaResponse.setDeviceTokenFSO(updateUserResponse.getDeviceTokenFso());
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
			if (null != updateUserResponse) {
				if (enrollForEmail) {
					MfaEnrollForEmailRequest emailRequestData = ClientUtil
							.getMfaEmailRequestFromUpdateUserRequest(mfaUpdateUserInfoRequest, updateUserResponse);
					try {
						MfaModifyUserResponse mfaModifyUserResponse = ConsumerWebMfa.enrollForEmail(emailRequestData);
						consumerWebMfaResponse.setSessionID(mfaModifyUserResponse.getSessionId());
						consumerWebMfaResponse.setTransactionID(mfaModifyUserResponse.getTransactionId());
						consumerWebMfaResponse.setDeviceTokenCookie(mfaModifyUserResponse.getDeviceTokenCookie());
						consumerWebMfaResponse.setDeviceTokenFSO(mfaModifyUserResponse.getDeviceTokenFso());
					} catch (Exception e) {
						e.printStackTrace();
						e.getMessage();
					}
				} else {
					MfaRsaRequest mfaRsaRequest = ClientUtil
							.getMfaRequestFromUpdateUserRequest(mfaUpdateUserInfoRequest, updateUserResponse);
					MfaModifyUserResponse mfaModifyUserResponse = ConsumerWebMfa.unenrollForEmail(mfaRsaRequest);
					consumerWebMfaResponse.setSessionID(mfaModifyUserResponse.getSessionId());
					consumerWebMfaResponse.setTransactionID(mfaModifyUserResponse.getTransactionId());
					consumerWebMfaResponse.setDeviceTokenCookie(mfaModifyUserResponse.getDeviceTokenCookie());
					consumerWebMfaResponse.setDeviceTokenFSO(mfaModifyUserResponse.getDeviceTokenFso());
				}
				if (enrollForSMS) {
					MfaEnrollForSmsRequest smsRequestData = ClientUtil
							.getMfaSMSRequestFromUpdateUserRequest(mfaUpdateUserInfoRequest, updateUserResponse);
					MfaModifyUserResponse mfaModifyUserResponse = ConsumerWebMfa.enrollForSMS(smsRequestData);
					consumerWebMfaResponse.setSessionID(mfaModifyUserResponse.getSessionId());
					consumerWebMfaResponse.setTransactionID(mfaModifyUserResponse.getTransactionId());
					consumerWebMfaResponse.setDeviceTokenCookie(mfaModifyUserResponse.getDeviceTokenCookie());
					consumerWebMfaResponse.setDeviceTokenFSO(mfaModifyUserResponse.getDeviceTokenFso());
				} else {
					MfaRsaRequest mfaRsaRequest = ClientUtil
							.getMfaRequestFromUpdateUserRequest(mfaUpdateUserInfoRequest, updateUserResponse);
					MfaModifyUserResponse mfaModifyUserResponse = ConsumerWebMfa.unenrollForSMS(mfaRsaRequest);
					consumerWebMfaResponse.setSessionID(mfaModifyUserResponse.getSessionId());
					consumerWebMfaResponse.setTransactionID(mfaModifyUserResponse.getTransactionId());
					consumerWebMfaResponse.setDeviceTokenCookie(mfaModifyUserResponse.getDeviceTokenCookie());
					consumerWebMfaResponse.setDeviceTokenFSO(mfaModifyUserResponse.getDeviceTokenFso());
				}
				if (enrollForPhone) {
					MfaEnrollForSmsRequest enrollForSmsRequest = ClientUtil
							.getMfaSMSRequestFromUpdateUserRequest(mfaUpdateUserInfoRequest, updateUserResponse);
					MfaModifyUserResponse mfaModifyUserResponse = ConsumerWebMfa.enrollForPhone(enrollForSmsRequest);
					consumerWebMfaResponse.setSessionID(mfaModifyUserResponse.getSessionId());
					consumerWebMfaResponse.setTransactionID(mfaModifyUserResponse.getTransactionId());
					consumerWebMfaResponse.setDeviceTokenCookie(mfaModifyUserResponse.getDeviceTokenCookie());
					consumerWebMfaResponse.setDeviceTokenFSO(mfaModifyUserResponse.getDeviceTokenFso());
				} else {
					MfaRsaRequest mfaRsaRequest = ClientUtil.getMfaRequestFromUpdateUserRequest(mfaUpdateUserInfoRequest, updateUserResponse);
					MfaModifyUserResponse mfaModifyUserResponse = ConsumerWebMfa.mfaUnenrollForPhone(mfaRsaRequest);
					consumerWebMfaResponse.setSessionID(mfaModifyUserResponse.getSessionId());
					consumerWebMfaResponse.setTransactionID(mfaModifyUserResponse.getTransactionId());
					consumerWebMfaResponse.setDeviceTokenCookie(mfaModifyUserResponse.getDeviceTokenCookie());
					consumerWebMfaResponse.setDeviceTokenFSO(mfaModifyUserResponse.getDeviceTokenFso());
				}	
				MfaAnalyzeRequest analyzeRequest = ClientUtil.getAnalyzeRequestFromRsaRequest(mfaUpdateUserInfoRequest, updateUserResponse);
				consumerWebMfaResponse = ClientUtil.analyzeRiskMFA(analyzeRequest, consumerWebMfaResponse, updateUserResponse.getContactDetails());
			} else {
				System.out.println("The request object is null");
			}
		}
		return consumerWebMfaResponse;
	}

	@Override
	public ConsumerWebMfaResponse challengeWithSMS(MfaTokenDeliveryChallengeRequest challengeRequest) {
		MfaRsaResponse mfaRsaResponse = ConsumerWebMfa.mfaChallengeWithSMS(challengeRequest);
		return ClientUtil.createChallengeResponse(mfaRsaResponse);
	}

	@Override
	public ConsumerWebMfaResponse challengeWithPhone(MfaTokenDeliveryChallengeRequest challengeRequest) {
		MfaRsaResponse mfaRsaResponse = ConsumerWebMfa.mfaChallengeWithPhone(challengeRequest);
		return ClientUtil.createChallengeResponse(mfaRsaResponse);
	}

	@Override
	public ConsumerWebMfaResponse challengeWithEmail(MfaTokenDeliveryChallengeRequest challengeRequest) {
		MfaRsaResponse mfaRsaResponse = ConsumerWebMfa.mfaChallengeWithEmail(challengeRequest);
		return ClientUtil.createChallengeResponse(mfaRsaResponse);
	}

}
