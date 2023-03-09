package io.consumerweb.mfa.client.api;

import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import com.squareup.okhttp.ResponseBody;

import io.consumerweb.mfa.client.ApiCallback;
import io.consumerweb.mfa.client.ApiClient;
import io.consumerweb.mfa.client.ApiException;
import io.consumerweb.mfa.client.ApiResponse;
import io.consumerweb.mfa.client.Configuration;
import io.consumerweb.mfa.client.Pair;
import io.consumerweb.mfa.client.ProgressRequestBody;
import io.consumerweb.mfa.client.ProgressResponseBody;
import io.consumerweb.mfa.client.model.MfaAnalyzeRequest;
import io.consumerweb.mfa.client.model.MfaAnalyzeResponse;
import io.consumerweb.mfa.client.model.MfaAuthenticateResponse;
import io.consumerweb.mfa.client.model.MfaCreateUserRequest;
import io.consumerweb.mfa.client.model.MfaEnrollForEmailRequest;
import io.consumerweb.mfa.client.model.MfaEnrollForQuestionsRequest;
import io.consumerweb.mfa.client.model.MfaEnrollForSmsRequest;
import io.consumerweb.mfa.client.model.MfaModifyUserResponse;
import io.consumerweb.mfa.client.model.MfaQuestionAuthenticateRequest;
import io.consumerweb.mfa.client.model.MfaQuestionChallengeRequest;
import io.consumerweb.mfa.client.model.MfaQuestionChallengeResponse;
import io.consumerweb.mfa.client.model.MfaRequest;
import io.consumerweb.mfa.client.model.MfaResetUserRequest;
import io.consumerweb.mfa.client.model.MfaRsaRequest;
import io.consumerweb.mfa.client.model.MfaRsaResponse;
import io.consumerweb.mfa.client.model.MfaSupportIncidentRequest;
import io.consumerweb.mfa.client.model.MfaSupportIncidentResponse;
import io.consumerweb.mfa.client.model.MfaSystemInfo;
import io.consumerweb.mfa.client.model.MfaTokenAuthenticateRequest;
import io.consumerweb.mfa.client.model.MfaTokenDeliveryChallengeRequest;
import io.consumerweb.mfa.client.model.MfaUpdateUserInfoRequest;
import io.consumerweb.mfa.client.model.MfaUserInfoRequest;
import io.consumerweb.mfa.client.model.MfaUserInfoResponse;

import com.squareup.okhttp.Response;
import com.squareup.okhttp.Interceptor;
import java.util.HashMap;
import java.util.ArrayList;
import com.squareup.okhttp.Call;

public class MfaApi
{
    private ApiClient apiClient;
    private String apiKey;
    private final String API_KEY = "apikey";
    
    public MfaApi() {
        this(Configuration.getDefaultApiClient());
    }
    
    public MfaApi(final ApiClient apiClient) {
        this.apiKey = "";
        this.apiClient = apiClient;
    }
    
    public ApiClient getApiClient() {
        return this.apiClient;
    }
    
    public void setApiClient(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public String getApiKey() {
        return this.apiKey;
    }
    
    public void setApiKey(final String apiKey) {
        if (null != apiKey) {
            this.apiKey = apiKey;
        }
    }
    
    public Call mfaAnalyzeCall(final MfaAnalyzeRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/Analyze";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaAnalyzeValidateBeforeCall(final MfaAnalyzeRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaAnalyzeCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaAnalyzeResponse mfaAnalyze(final MfaAnalyzeRequest requestData) throws ApiException {
        final ApiResponse<MfaAnalyzeResponse> resp = this.mfaAnalyzeWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaAnalyzeResponse> mfaAnalyzeWithHttpInfo(final MfaAnalyzeRequest requestData) throws ApiException {
        final Call call = this.mfaAnalyzeValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaAnalyzeResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaAnalyzeAsync(final MfaAnalyzeRequest requestData, final ApiCallback<MfaAnalyzeResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaAnalyzeValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaAnalyzeResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaAuthenticateEmailCall(final MfaTokenAuthenticateRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/AuthenticateEmail";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaAuthenticateEmailValidateBeforeCall(final MfaTokenAuthenticateRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaAuthenticateEmailCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaAuthenticateResponse mfaAuthenticateEmail(final MfaTokenAuthenticateRequest requestData) throws ApiException {
        final ApiResponse<MfaAuthenticateResponse> resp = this.mfaAuthenticateEmailWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaAuthenticateResponse> mfaAuthenticateEmailWithHttpInfo(final MfaTokenAuthenticateRequest requestData) throws ApiException {
        final Call call = this.mfaAuthenticateEmailValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaAuthenticateResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaAuthenticateEmailAsync(final MfaTokenAuthenticateRequest requestData, final ApiCallback<MfaAuthenticateResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaAuthenticateEmailValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaAuthenticateResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaAuthenticatePhoneCall(final MfaTokenAuthenticateRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/AuthenticatePhone";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaAuthenticatePhoneValidateBeforeCall(final MfaTokenAuthenticateRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaAuthenticatePhoneCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaAuthenticateResponse mfaAuthenticatePhone(final MfaTokenAuthenticateRequest requestData) throws ApiException {
        final ApiResponse<MfaAuthenticateResponse> resp = this.mfaAuthenticatePhoneWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaAuthenticateResponse> mfaAuthenticatePhoneWithHttpInfo(final MfaTokenAuthenticateRequest requestData) throws ApiException {
        final Call call = this.mfaAuthenticatePhoneValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaAuthenticateResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaAuthenticatePhoneAsync(final MfaTokenAuthenticateRequest requestData, final ApiCallback<MfaAuthenticateResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaAuthenticatePhoneValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaAuthenticateResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaAuthenticateQuestionsCall(final MfaQuestionAuthenticateRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/AuthenticateQuestions";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaAuthenticateQuestionsValidateBeforeCall(final MfaQuestionAuthenticateRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaAuthenticateQuestionsCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaAuthenticateResponse mfaAuthenticateQuestions(final MfaQuestionAuthenticateRequest requestData) throws ApiException {
        final ApiResponse<MfaAuthenticateResponse> resp = this.mfaAuthenticateQuestionsWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaAuthenticateResponse> mfaAuthenticateQuestionsWithHttpInfo(final MfaQuestionAuthenticateRequest requestData) throws ApiException {
        final Call call = this.mfaAuthenticateQuestionsValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaAuthenticateResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaAuthenticateQuestionsAsync(final MfaQuestionAuthenticateRequest requestData, final ApiCallback<MfaAuthenticateResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaAuthenticateQuestionsValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaAuthenticateResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaAuthenticateSmsCall(final MfaTokenAuthenticateRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/AuthenticateSms";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaAuthenticateSmsValidateBeforeCall(final MfaTokenAuthenticateRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaAuthenticateSmsCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaAuthenticateResponse mfaAuthenticateSms(final MfaTokenAuthenticateRequest requestData) throws ApiException {
        final ApiResponse<MfaAuthenticateResponse> resp = this.mfaAuthenticateSmsWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaAuthenticateResponse> mfaAuthenticateSmsWithHttpInfo(final MfaTokenAuthenticateRequest requestData) throws ApiException {
        final Call call = this.mfaAuthenticateSmsValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaAuthenticateResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaAuthenticateSmsAsync(final MfaTokenAuthenticateRequest requestData, final ApiCallback<MfaAuthenticateResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaAuthenticateSmsValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaAuthenticateResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaChallengeWithEmailCall(final MfaTokenDeliveryChallengeRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/ChallengeWithEmail";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaChallengeWithEmailValidateBeforeCall(final MfaTokenDeliveryChallengeRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaChallengeWithEmailCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaRsaResponse mfaChallengeWithEmail(final MfaTokenDeliveryChallengeRequest requestData) throws ApiException {
        final ApiResponse<MfaRsaResponse> resp = this.mfaChallengeWithEmailWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaRsaResponse> mfaChallengeWithEmailWithHttpInfo(final MfaTokenDeliveryChallengeRequest requestData) throws ApiException {
        final Call call = this.mfaChallengeWithEmailValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaRsaResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaChallengeWithEmailAsync(final MfaTokenDeliveryChallengeRequest requestData, final ApiCallback<MfaRsaResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaChallengeWithEmailValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaRsaResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaChallengeWithPhoneCall(final MfaTokenDeliveryChallengeRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/ChallengeWithPhone";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaChallengeWithPhoneValidateBeforeCall(final MfaTokenDeliveryChallengeRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaChallengeWithPhoneCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaRsaResponse mfaChallengeWithPhone(final MfaTokenDeliveryChallengeRequest requestData) throws ApiException {
        final ApiResponse<MfaRsaResponse> resp = this.mfaChallengeWithPhoneWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaRsaResponse> mfaChallengeWithPhoneWithHttpInfo(final MfaTokenDeliveryChallengeRequest requestData) throws ApiException {
        final Call call = this.mfaChallengeWithPhoneValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaRsaResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaChallengeWithPhoneAsync(final MfaTokenDeliveryChallengeRequest requestData, final ApiCallback<MfaRsaResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaChallengeWithPhoneValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaRsaResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaChallengeWithQuestionsCall(final MfaQuestionChallengeRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/ChallengeWithQuestions";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaChallengeWithQuestionsValidateBeforeCall(final MfaQuestionChallengeRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaChallengeWithQuestionsCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaQuestionChallengeResponse mfaChallengeWithQuestions(final MfaQuestionChallengeRequest requestData) throws ApiException {
        final ApiResponse<MfaQuestionChallengeResponse> resp = this.mfaChallengeWithQuestionsWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaQuestionChallengeResponse> mfaChallengeWithQuestionsWithHttpInfo(final MfaQuestionChallengeRequest requestData) throws ApiException {
        final Call call = this.mfaChallengeWithQuestionsValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaQuestionChallengeResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaChallengeWithQuestionsAsync(final MfaQuestionChallengeRequest requestData, final ApiCallback<MfaQuestionChallengeResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaChallengeWithQuestionsValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaQuestionChallengeResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaChallengeWithSmsCall(final MfaTokenDeliveryChallengeRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/ChallengeWithSms";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaChallengeWithSmsValidateBeforeCall(final MfaTokenDeliveryChallengeRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaChallengeWithSmsCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaRsaResponse mfaChallengeWithSms(final MfaTokenDeliveryChallengeRequest requestData) throws ApiException {
        final ApiResponse<MfaRsaResponse> resp = this.mfaChallengeWithSmsWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaRsaResponse> mfaChallengeWithSmsWithHttpInfo(final MfaTokenDeliveryChallengeRequest requestData) throws ApiException {
        final Call call = this.mfaChallengeWithSmsValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaRsaResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaChallengeWithSmsAsync(final MfaTokenDeliveryChallengeRequest requestData, final ApiCallback<MfaRsaResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaChallengeWithSmsValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaRsaResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaCreateSupportIncidentCall(final MfaSupportIncidentRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/CreateSupportIncident";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaCreateSupportIncidentValidateBeforeCall(final MfaSupportIncidentRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaCreateSupportIncidentCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaSupportIncidentResponse mfaCreateSupportIncident(final MfaSupportIncidentRequest requestData) throws ApiException {
        final ApiResponse<MfaSupportIncidentResponse> resp = this.mfaCreateSupportIncidentWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaSupportIncidentResponse> mfaCreateSupportIncidentWithHttpInfo(final MfaSupportIncidentRequest requestData) throws ApiException {
        final Call call = this.mfaCreateSupportIncidentValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaSupportIncidentResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaCreateSupportIncidentAsync(final MfaSupportIncidentRequest requestData, final ApiCallback<MfaSupportIncidentResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaCreateSupportIncidentValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaSupportIncidentResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaCreateUserCall(final MfaCreateUserRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/CreateUser";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaCreateUserValidateBeforeCall(final MfaCreateUserRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaCreateUserCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaModifyUserResponse mfaCreateUser(final MfaCreateUserRequest requestData) throws ApiException {
        final ApiResponse<MfaModifyUserResponse> resp = this.mfaCreateUserWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaModifyUserResponse> mfaCreateUserWithHttpInfo(final MfaCreateUserRequest requestData) throws ApiException {
        final Call call = this.mfaCreateUserValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaCreateUserAsync(final MfaCreateUserRequest requestData, final ApiCallback<MfaModifyUserResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaCreateUserValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaEnrollForEmailCall(final MfaEnrollForEmailRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/EnrollForEmail";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaEnrollForEmailValidateBeforeCall(final MfaEnrollForEmailRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaEnrollForEmailCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaModifyUserResponse mfaEnrollForEmail(final MfaEnrollForEmailRequest requestData) throws ApiException {
        final ApiResponse<MfaModifyUserResponse> resp = this.mfaEnrollForEmailWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaModifyUserResponse> mfaEnrollForEmailWithHttpInfo(final MfaEnrollForEmailRequest requestData) throws ApiException {
        final Call call = this.mfaEnrollForEmailValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaEnrollForEmailAsync(final MfaEnrollForEmailRequest requestData, final ApiCallback<MfaModifyUserResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaEnrollForEmailValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaEnrollForPhoneCall(final MfaEnrollForSmsRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/EnrollForPhone";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaEnrollForPhoneValidateBeforeCall(final MfaEnrollForSmsRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaEnrollForPhoneCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaModifyUserResponse mfaEnrollForPhone(final MfaEnrollForSmsRequest requestData) throws ApiException {
        final ApiResponse<MfaModifyUserResponse> resp = this.mfaEnrollForPhoneWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaModifyUserResponse> mfaEnrollForPhoneWithHttpInfo(final MfaEnrollForSmsRequest requestData) throws ApiException {
        final Call call = this.mfaEnrollForPhoneValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaEnrollForPhoneAsync(final MfaEnrollForSmsRequest requestData, final ApiCallback<MfaModifyUserResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaEnrollForPhoneValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaEnrollForQuestionsCall(final MfaEnrollForQuestionsRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/EnrollForQuestions";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaEnrollForQuestionsValidateBeforeCall(final MfaEnrollForQuestionsRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaEnrollForQuestionsCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaModifyUserResponse mfaEnrollForQuestions(final MfaEnrollForQuestionsRequest requestData) throws ApiException {
        final ApiResponse<MfaModifyUserResponse> resp = this.mfaEnrollForQuestionsWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaModifyUserResponse> mfaEnrollForQuestionsWithHttpInfo(final MfaEnrollForQuestionsRequest requestData) throws ApiException {
        final Call call = this.mfaEnrollForQuestionsValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaEnrollForQuestionsAsync(final MfaEnrollForQuestionsRequest requestData, final ApiCallback<MfaModifyUserResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaEnrollForQuestionsValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaEnrollForSmsCall(final MfaEnrollForSmsRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/EnrollForSms";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaEnrollForSmsValidateBeforeCall(final MfaEnrollForSmsRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaEnrollForSmsCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaModifyUserResponse mfaEnrollForSms(final MfaEnrollForSmsRequest requestData) throws ApiException {
        final ApiResponse<MfaModifyUserResponse> resp = this.mfaEnrollForSmsWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaModifyUserResponse> mfaEnrollForSmsWithHttpInfo(final MfaEnrollForSmsRequest requestData) throws ApiException {
        final Call call = this.mfaEnrollForSmsValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaEnrollForSmsAsync(final MfaEnrollForSmsRequest requestData, final ApiCallback<MfaModifyUserResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaEnrollForSmsValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaResetUserCall(final MfaResetUserRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/ResetUser";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaResetUserValidateBeforeCall(final MfaResetUserRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaResetUserCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaModifyUserResponse mfaResetUser(final MfaResetUserRequest requestData) throws ApiException {
        final ApiResponse<MfaModifyUserResponse> resp = this.mfaResetUserWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaModifyUserResponse> mfaResetUserWithHttpInfo(final MfaResetUserRequest requestData) throws ApiException {
        final Call call = this.mfaResetUserValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaResetUserAsync(final MfaResetUserRequest requestData, final ApiCallback<MfaModifyUserResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaResetUserValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaSystemInfoCall(final MfaRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/SystemInfo";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaSystemInfoValidateBeforeCall(final MfaRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaSystemInfoCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaSystemInfo mfaSystemInfo(final MfaRequest requestData) throws ApiException {
        final ApiResponse<MfaSystemInfo> resp = this.mfaSystemInfoWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaSystemInfo> mfaSystemInfoWithHttpInfo(final MfaRequest requestData) throws ApiException {
        final Call call = this.mfaSystemInfoValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaSystemInfo>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaSystemInfoAsync(final MfaRequest requestData, final ApiCallback<MfaSystemInfo> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaSystemInfoValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaSystemInfo>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaUnenrollForEmailCall(final MfaRsaRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/UnenrollForEmail";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaUnenrollForEmailValidateBeforeCall(final MfaRsaRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaUnenrollForEmailCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaModifyUserResponse mfaUnenrollForEmail(final MfaRsaRequest requestData) throws ApiException {
        final ApiResponse<MfaModifyUserResponse> resp = this.mfaUnenrollForEmailWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaModifyUserResponse> mfaUnenrollForEmailWithHttpInfo(final MfaRsaRequest requestData) throws ApiException {
        final Call call = this.mfaUnenrollForEmailValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaUnenrollForEmailAsync(final MfaRsaRequest requestData, final ApiCallback<MfaModifyUserResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaUnenrollForEmailValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaUnenrollForPhoneCall(final MfaRsaRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/UnenrollForPhone";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaUnenrollForPhoneValidateBeforeCall(final MfaRsaRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaUnenrollForPhoneCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaModifyUserResponse mfaUnenrollForPhone(final MfaRsaRequest requestData) throws ApiException {
        final ApiResponse<MfaModifyUserResponse> resp = this.mfaUnenrollForPhoneWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaModifyUserResponse> mfaUnenrollForPhoneWithHttpInfo(final MfaRsaRequest requestData) throws ApiException {
        final Call call = this.mfaUnenrollForPhoneValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaUnenrollForPhoneAsync(final MfaRsaRequest requestData, final ApiCallback<MfaModifyUserResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaUnenrollForPhoneValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaUnenrollForQuestionsCall(final MfaRsaRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/UnenrollForQuestions";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaUnenrollForQuestionsValidateBeforeCall(final MfaRsaRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaUnenrollForQuestionsCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaModifyUserResponse mfaUnenrollForQuestions(final MfaRsaRequest requestData) throws ApiException {
        final ApiResponse<MfaModifyUserResponse> resp = this.mfaUnenrollForQuestionsWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaModifyUserResponse> mfaUnenrollForQuestionsWithHttpInfo(final MfaRsaRequest requestData) throws ApiException {
        final Call call = this.mfaUnenrollForQuestionsValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaUnenrollForQuestionsAsync(final MfaRsaRequest requestData, final ApiCallback<MfaModifyUserResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaUnenrollForQuestionsValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaUnenrollForSmsCall(final MfaRsaRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/UnenrollForSms";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaUnenrollForSmsValidateBeforeCall(final MfaRsaRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaUnenrollForSmsCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaModifyUserResponse mfaUnenrollForSms(final MfaRsaRequest requestData) throws ApiException {
        final ApiResponse<MfaModifyUserResponse> resp = this.mfaUnenrollForSmsWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaModifyUserResponse> mfaUnenrollForSmsWithHttpInfo(final MfaRsaRequest requestData) throws ApiException {
        final Call call = this.mfaUnenrollForSmsValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaUnenrollForSmsAsync(final MfaRsaRequest requestData, final ApiCallback<MfaModifyUserResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaUnenrollForSmsValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaModifyUserResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaUpdateUserInfoCall(final MfaUpdateUserInfoRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/UpdateUserInfo";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaUpdateUserInfoValidateBeforeCall(final MfaUpdateUserInfoRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaUpdateUserInfoCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaUserInfoResponse mfaUpdateUserInfo(final MfaUpdateUserInfoRequest requestData) throws ApiException {
        final ApiResponse<MfaUserInfoResponse> resp = this.mfaUpdateUserInfoWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaUserInfoResponse> mfaUpdateUserInfoWithHttpInfo(final MfaUpdateUserInfoRequest requestData) throws ApiException {
        final Call call = this.mfaUpdateUserInfoValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaUserInfoResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaUpdateUserInfoAsync(final MfaUpdateUserInfoRequest requestData, final ApiCallback<MfaUserInfoResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaUpdateUserInfoValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaUserInfoResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call mfaUserInfoCall(final MfaUserInfoRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/Mfa/UserInfo";
        final List<Pair> localVarQueryParams = new ArrayList<Pair>();
        final Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        final Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = this.apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = this.apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("apikey", this.getApiKey());
        if (progressListener != null) {
            this.apiClient.getHttpClient().networkInterceptors().add(new Interceptor() {
                @Override
                public Response intercept(final Chain chain) throws IOException {
                    final Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder().body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        final String[] localVarAuthNames = new String[0];
        return this.apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call mfaUserInfoValidateBeforeCall(final MfaUserInfoRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.mfaUserInfoCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public MfaUserInfoResponse mfaUserInfo(final MfaUserInfoRequest requestData) throws ApiException {
        final ApiResponse<MfaUserInfoResponse> resp = this.mfaUserInfoWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<MfaUserInfoResponse> mfaUserInfoWithHttpInfo(final MfaUserInfoRequest requestData) throws ApiException {
        final Call call = this.mfaUserInfoValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<MfaUserInfoResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call mfaUserInfoAsync(final MfaUserInfoRequest requestData, final ApiCallback<MfaUserInfoResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(final long bytesRead, final long contentLength, final boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(final long bytesWritten, final long contentLength, final boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        final Call call = this.mfaUserInfoValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<MfaUserInfoResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
