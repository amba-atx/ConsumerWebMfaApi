package io.consumerweb.mfa.services;

import org.springframework.stereotype.Service;

import io.consumerweb.mfa.client.model.MfaTokenDeliveryChallengeRequest;
import io.consumerweb.mfa.client.model.MfaUpdateUserInfoRequest;
import io.consumerweb.mfa.client.model.MfaUserInfoRequest;
import io.consumerweb.mfa.model.ConsumerWebMfaResponse;

@Service
public interface MfaService {
	
	public ConsumerWebMfaResponse retrieveMfaUserInfo(MfaUserInfoRequest infoRequest);
	public ConsumerWebMfaResponse updateMfaUserInfo(MfaUpdateUserInfoRequest mfaUpdateUserInfoRequest, Boolean enrollForEmail, Boolean enrollForSMS, Boolean enrollForPhone);
	public ConsumerWebMfaResponse challengeWithSMS(MfaTokenDeliveryChallengeRequest challengeRequest);
	public ConsumerWebMfaResponse challengeWithPhone(MfaTokenDeliveryChallengeRequest challengeRequest);
	public ConsumerWebMfaResponse challengeWithEmail(MfaTokenDeliveryChallengeRequest challengeRequest);

}
