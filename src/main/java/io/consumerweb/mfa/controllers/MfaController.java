package io.consumerweb.mfa.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.consumerweb.mfa.client.model.MfaTokenDeliveryChallengeRequest;
import io.consumerweb.mfa.client.model.MfaUpdateUserInfoRequest;
import io.consumerweb.mfa.client.model.MfaUserInfoRequest;
import io.consumerweb.mfa.model.ConsumerWebMfaResponse;
import io.consumerweb.mfa.services.MfaService;

@RestController
public class MfaController {
	
	@Autowired
	public MfaService mfaService;
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
	
	@PostMapping("/analyze")
	public ConsumerWebMfaResponse retrieveUser(MfaUserInfoRequest request) throws IOException {	
		return mfaService.retrieveMfaUserInfo(request);	
	}
	
	@PostMapping("/updateUser")
	public ConsumerWebMfaResponse updateUser(MfaUpdateUserInfoRequest mfaUpdateUserInfoRequest, Boolean enrollForEmail, Boolean enrollForSMS, Boolean enrollForPhone) {
		return mfaService.updateMfaUserInfo(mfaUpdateUserInfoRequest, enrollForEmail, enrollForSMS, enrollForPhone);
	}
	
	@PostMapping("/challengeWithSMS")
	public ConsumerWebMfaResponse challengeWithSMS(MfaTokenDeliveryChallengeRequest challengeRequest) {
		return mfaService.challengeWithSMS(challengeRequest);
	}
	
	@PostMapping("/challengeWithPhone")
	public ConsumerWebMfaResponse challengeWithPhone(MfaTokenDeliveryChallengeRequest challengeRequest) {
		return mfaService.challengeWithPhone(challengeRequest);
	}
	
	@PostMapping("/challengeWithEmail")
	public ConsumerWebMfaResponse challengeWithEmail(MfaTokenDeliveryChallengeRequest challengeRequest) {
		return mfaService.challengeWithEmail(challengeRequest);
	}

}
