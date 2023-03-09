package io.consumerweb.mfa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import io.consumerweb.mfa.client.model.MfaAnalyzeRequest;
import io.consumerweb.mfa.client.model.MfaAnalyzeResponse;
import io.consumerweb.mfa.client.model.MfaCreateUserRequest;
import io.consumerweb.mfa.client.model.MfaEnrollForEmailRequest;
import io.consumerweb.mfa.client.model.MfaEnrollForSmsRequest;
import io.consumerweb.mfa.client.model.MfaModifyUserResponse;
import io.consumerweb.mfa.client.model.MfaRsaRequest;
import io.consumerweb.mfa.client.model.MfaRsaResponse;
import io.consumerweb.mfa.client.model.MfaTokenDeliveryChallengeRequest;
import io.consumerweb.mfa.client.model.MfaUpdateUserInfoRequest;
import io.consumerweb.mfa.client.model.MfaUserInfoRequest;
import io.consumerweb.mfa.client.model.MfaUserInfoResponse;

public class ConsumerWebMfa {

	@Autowired
	public static RestTemplate restTemplate;

	@Value("${mfa.api.analyze}")
	public static String analyzeApi;

	@Value("${mfa.api.create}")
	public static String createApi;

	@Value("${mfa.api.update}")
	public static String updateApi;
	
	@Value("${mfa.api.challengeSMS}")
	public static String challengeApiSMS;
	
	@Value("${mfa.api.challengePhone}")
	public static String challengeApiPhone;
	
	@Value("${mfa.api.challengeApiEmail}")
	public static String challengeApiEmail;

	public static MfaUserInfoResponse retrieveMfaUserInfo(MfaUserInfoRequest requestData) {
		MfaUserInfoResponse mfaUserInfoResponse = new MfaUserInfoResponse();
		if (null != requestData) {
			try {
				mfaUserInfoResponse = restTemplate.postForObject(analyzeApi, requestData, MfaUserInfoResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}

		}
		return mfaUserInfoResponse;
	}

	public static MfaModifyUserResponse mfaCreateUser(MfaCreateUserRequest mfaCreateUserRequest) {
		MfaModifyUserResponse mfaModifyUserResponse = new MfaModifyUserResponse();
		if (null != mfaCreateUserRequest) {
			try {
				mfaModifyUserResponse = restTemplate.postForObject(createApi, mfaCreateUserRequest,
						MfaModifyUserResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}

		}
		return mfaModifyUserResponse;
	}

	public static MfaUserInfoResponse mfaUpdateUserInfo(MfaUpdateUserInfoRequest mfaUpdateUserInfoRequest) {
		MfaUserInfoResponse mfaUserInfoResponse = new MfaUserInfoResponse();
		if (null != mfaUpdateUserInfoRequest) {
			try {
				mfaUserInfoResponse = restTemplate.postForObject(updateApi, mfaUpdateUserInfoRequest,
						MfaUserInfoResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		return mfaUserInfoResponse;
	}

	public static MfaModifyUserResponse unenrollForEmail(MfaRsaRequest unenrollEmailRequest) {
		MfaModifyUserResponse mfaModifyUserResponse = new MfaModifyUserResponse();
		if (null != unenrollEmailRequest) {
			try {
				mfaModifyUserResponse = restTemplate.postForObject(updateApi, unenrollEmailRequest,
						MfaModifyUserResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		return mfaModifyUserResponse;
	}

	public static MfaModifyUserResponse enrollForEmail(MfaEnrollForEmailRequest emailRequest) {
		MfaModifyUserResponse mfaModifyUserResponse = new MfaModifyUserResponse();
		if (null != emailRequest) {
			try {
				mfaModifyUserResponse = restTemplate.postForObject(updateApi, emailRequest,
						MfaModifyUserResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		return mfaModifyUserResponse;
	}

	public static MfaModifyUserResponse enrollForSMS(MfaEnrollForSmsRequest smsRequestData) {
		MfaModifyUserResponse mfaModifyUserResponse = new MfaModifyUserResponse();
		if (null != smsRequestData) {
			try {
				mfaModifyUserResponse = restTemplate.postForObject(updateApi, smsRequestData,
						MfaModifyUserResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		return mfaModifyUserResponse;
	}

	public static MfaModifyUserResponse unenrollForSMS(MfaRsaRequest mfaRsaRequest) {
		MfaModifyUserResponse mfaModifyUserResponse = new MfaModifyUserResponse();
		if (null != mfaRsaRequest) {
			try {
				mfaModifyUserResponse = restTemplate.postForObject(updateApi, mfaRsaRequest,
						MfaModifyUserResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		return mfaModifyUserResponse;
	}

	public static MfaModifyUserResponse enrollForPhone(MfaEnrollForSmsRequest enrollForSmsRequest) {
		MfaModifyUserResponse mfaModifyUserResponse = new MfaModifyUserResponse();
		if (null != enrollForSmsRequest) {
			try {
				mfaModifyUserResponse = restTemplate.postForObject(updateApi, enrollForSmsRequest,
						MfaModifyUserResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		return mfaModifyUserResponse;
	}

	public static MfaModifyUserResponse mfaUnenrollForPhone(MfaRsaRequest unenrollForPhone) {
		MfaModifyUserResponse mfaModifyUserResponse = new MfaModifyUserResponse();
		if (null != unenrollForPhone) {
			try {
				mfaModifyUserResponse = restTemplate.postForObject(updateApi, unenrollForPhone,
						MfaModifyUserResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		return mfaModifyUserResponse;
	}

	public static MfaAnalyzeResponse mfaAnalyzeProfile(MfaAnalyzeRequest requestData) {
		MfaAnalyzeResponse analyzeResponse = new MfaAnalyzeResponse();
		if (null != requestData) {
			try {
				analyzeResponse = restTemplate.postForObject(analyzeApi, requestData, MfaAnalyzeResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		return analyzeResponse;
	}

	public static MfaRsaResponse mfaChallengeWithSMS(MfaTokenDeliveryChallengeRequest challengeRequest) {
		MfaRsaResponse mfaRsaResponse = new MfaRsaResponse();
		if(null != challengeRequest) {
			try {
				mfaRsaResponse = restTemplate.postForObject(challengeApiSMS, challengeRequest, MfaRsaResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		return mfaRsaResponse;
	}

	public static MfaRsaResponse mfaChallengeWithPhone(MfaTokenDeliveryChallengeRequest challengeRequest) {
		MfaRsaResponse mfaRsaResponse = new MfaRsaResponse();
		if(null != challengeRequest) {
			try {
				mfaRsaResponse = restTemplate.postForObject(challengeApiPhone, challengeRequest, MfaRsaResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		return mfaRsaResponse;
	}

	public static MfaRsaResponse mfaChallengeWithEmail(MfaTokenDeliveryChallengeRequest challengeRequest) {
		MfaRsaResponse mfaRsaResponse = new MfaRsaResponse();
		if(null != challengeRequest) {
			try {
				mfaRsaResponse = restTemplate.postForObject(challengeApiEmail, challengeRequest, MfaRsaResponse.class);
			} catch (Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		return mfaRsaResponse;
	}
}
