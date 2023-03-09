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
import io.consumerweb.mfa.client.model.AdminIncidentListResponse;
import io.consumerweb.mfa.client.model.AdminResolveIncidentRequest;
import io.consumerweb.mfa.client.model.AdminResponse;
import io.consumerweb.mfa.client.model.AdminRsaRequest;
import io.consumerweb.mfa.client.model.AdminRsaResponse;
import io.consumerweb.mfa.client.model.AdminSearchIncidentRequest;
import io.consumerweb.mfa.client.model.AdminSearchIncidentResponse;
import io.consumerweb.mfa.client.model.AdminSearchUsersRequest;
import io.consumerweb.mfa.client.model.AdminSearchUsersResponse;
import io.consumerweb.mfa.client.model.AdminUserInfoRequest;
import io.consumerweb.mfa.client.model.AdminUserInfoResponse;

import com.squareup.okhttp.Response;
import com.squareup.okhttp.Interceptor;
import java.util.HashMap;
import java.util.ArrayList;
import com.squareup.okhttp.Call;

public class AdminApi
{
    private ApiClient apiClient;
    
    public AdminApi() {
        this(Configuration.getDefaultApiClient());
    }
    
    public AdminApi(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public ApiClient getApiClient() {
        return this.apiClient;
    }
    
    public void setApiClient(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public Call adminDeleteUserCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = request;
        final String localVarPath = "/api/Admin/DeleteUser";
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
    
    private Call adminDeleteUserValidateBeforeCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.adminDeleteUserCall(request, progressListener, progressRequestListener);
        return call;
    }
    
    public AdminRsaResponse adminDeleteUser(final AdminRsaRequest request) throws ApiException {
        final ApiResponse<AdminRsaResponse> resp = this.adminDeleteUserWithHttpInfo(request);
        return resp.getData();
    }
    
    public ApiResponse<AdminRsaResponse> adminDeleteUserWithHttpInfo(final AdminRsaRequest request) throws ApiException {
        final Call call = this.adminDeleteUserValidateBeforeCall(request, null, null);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call adminDeleteUserAsync(final AdminRsaRequest request, final ApiCallback<AdminRsaResponse> callback) throws ApiException {
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
        final Call call = this.adminDeleteUserValidateBeforeCall(request, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call adminGetOpenIncidentsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = null;
        final String localVarPath = "/api/Admin/OpenIncidents";
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
    
    private Call adminGetOpenIncidentsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.adminGetOpenIncidentsCall(progressListener, progressRequestListener);
        return call;
    }
    
    public AdminIncidentListResponse adminGetOpenIncidents() throws ApiException {
        final ApiResponse<AdminIncidentListResponse> resp = this.adminGetOpenIncidentsWithHttpInfo();
        return resp.getData();
    }
    
    public ApiResponse<AdminIncidentListResponse> adminGetOpenIncidentsWithHttpInfo() throws ApiException {
        final Call call = this.adminGetOpenIncidentsValidateBeforeCall(null, null);
        final Type localVarReturnType = new TypeToken<AdminIncidentListResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call adminGetOpenIncidentsAsync(final ApiCallback<AdminIncidentListResponse> callback) throws ApiException {
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
        final Call call = this.adminGetOpenIncidentsValidateBeforeCall(progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<AdminIncidentListResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call adminGetUserChangeHistoryCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = request;
        final String localVarPath = "/api/Admin/GetUserChangeHistory";
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
    
    private Call adminGetUserChangeHistoryValidateBeforeCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.adminGetUserChangeHistoryCall(request, progressListener, progressRequestListener);
        return call;
    }
    
    public AdminRsaResponse adminGetUserChangeHistory(final AdminRsaRequest request) throws ApiException {
        final ApiResponse<AdminRsaResponse> resp = this.adminGetUserChangeHistoryWithHttpInfo(request);
        return resp.getData();
    }
    
    public ApiResponse<AdminRsaResponse> adminGetUserChangeHistoryWithHttpInfo(final AdminRsaRequest request) throws ApiException {
        final Call call = this.adminGetUserChangeHistoryValidateBeforeCall(request, null, null);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call adminGetUserChangeHistoryAsync(final AdminRsaRequest request, final ApiCallback<AdminRsaResponse> callback) throws ApiException {
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
        final Call call = this.adminGetUserChangeHistoryValidateBeforeCall(request, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call adminGetUserStatusCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = request;
        final String localVarPath = "/api/Admin/GetUserStatus";
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
    
    private Call adminGetUserStatusValidateBeforeCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.adminGetUserStatusCall(request, progressListener, progressRequestListener);
        return call;
    }
    
    public AdminRsaResponse adminGetUserStatus(final AdminRsaRequest request) throws ApiException {
        final ApiResponse<AdminRsaResponse> resp = this.adminGetUserStatusWithHttpInfo(request);
        return resp.getData();
    }
    
    public ApiResponse<AdminRsaResponse> adminGetUserStatusWithHttpInfo(final AdminRsaRequest request) throws ApiException {
        final Call call = this.adminGetUserStatusValidateBeforeCall(request, null, null);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call adminGetUserStatusAsync(final AdminRsaRequest request, final ApiCallback<AdminRsaResponse> callback) throws ApiException {
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
        final Call call = this.adminGetUserStatusValidateBeforeCall(request, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call adminLockUserCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = request;
        final String localVarPath = "/api/Admin/LockUser";
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
    
    private Call adminLockUserValidateBeforeCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.adminLockUserCall(request, progressListener, progressRequestListener);
        return call;
    }
    
    public AdminRsaResponse adminLockUser(final AdminRsaRequest request) throws ApiException {
        final ApiResponse<AdminRsaResponse> resp = this.adminLockUserWithHttpInfo(request);
        return resp.getData();
    }
    
    public ApiResponse<AdminRsaResponse> adminLockUserWithHttpInfo(final AdminRsaRequest request) throws ApiException {
        final Call call = this.adminLockUserValidateBeforeCall(request, null, null);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call adminLockUserAsync(final AdminRsaRequest request, final ApiCallback<AdminRsaResponse> callback) throws ApiException {
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
        final Call call = this.adminLockUserValidateBeforeCall(request, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call adminResetOpenSessionsCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = request;
        final String localVarPath = "/api/Admin/ResetOpenSessions";
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
    
    private Call adminResetOpenSessionsValidateBeforeCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.adminResetOpenSessionsCall(request, progressListener, progressRequestListener);
        return call;
    }
    
    public AdminRsaResponse adminResetOpenSessions(final AdminRsaRequest request) throws ApiException {
        final ApiResponse<AdminRsaResponse> resp = this.adminResetOpenSessionsWithHttpInfo(request);
        return resp.getData();
    }
    
    public ApiResponse<AdminRsaResponse> adminResetOpenSessionsWithHttpInfo(final AdminRsaRequest request) throws ApiException {
        final Call call = this.adminResetOpenSessionsValidateBeforeCall(request, null, null);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call adminResetOpenSessionsAsync(final AdminRsaRequest request, final ApiCallback<AdminRsaResponse> callback) throws ApiException {
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
        final Call call = this.adminResetOpenSessionsValidateBeforeCall(request, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call adminResolveSupportIncidentCall(final AdminResolveIncidentRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/api/Admin/ResolveSupportIncident";
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
    
    private Call adminResolveSupportIncidentValidateBeforeCall(final AdminResolveIncidentRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.adminResolveSupportIncidentCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public AdminResponse adminResolveSupportIncident(final AdminResolveIncidentRequest requestData) throws ApiException {
        final ApiResponse<AdminResponse> resp = this.adminResolveSupportIncidentWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<AdminResponse> adminResolveSupportIncidentWithHttpInfo(final AdminResolveIncidentRequest requestData) throws ApiException {
        final Call call = this.adminResolveSupportIncidentValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<AdminResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call adminResolveSupportIncidentAsync(final AdminResolveIncidentRequest requestData, final ApiCallback<AdminResponse> callback) throws ApiException {
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
        final Call call = this.adminResolveSupportIncidentValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<AdminResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call adminSearchIncidentCall(final AdminSearchIncidentRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/api/Admin/SearchIncident";
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
    
    private Call adminSearchIncidentValidateBeforeCall(final AdminSearchIncidentRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.adminSearchIncidentCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public AdminSearchIncidentResponse adminSearchIncident(final AdminSearchIncidentRequest requestData) throws ApiException {
        final ApiResponse<AdminSearchIncidentResponse> resp = this.adminSearchIncidentWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<AdminSearchIncidentResponse> adminSearchIncidentWithHttpInfo(final AdminSearchIncidentRequest requestData) throws ApiException {
        final Call call = this.adminSearchIncidentValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<AdminSearchIncidentResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call adminSearchIncidentAsync(final AdminSearchIncidentRequest requestData, final ApiCallback<AdminSearchIncidentResponse> callback) throws ApiException {
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
        final Call call = this.adminSearchIncidentValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<AdminSearchIncidentResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call adminSearchUsersCall(final AdminSearchUsersRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/api/Admin/SearchUsers";
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
    
    private Call adminSearchUsersValidateBeforeCall(final AdminSearchUsersRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.adminSearchUsersCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public AdminSearchUsersResponse adminSearchUsers(final AdminSearchUsersRequest requestData) throws ApiException {
        final ApiResponse<AdminSearchUsersResponse> resp = this.adminSearchUsersWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<AdminSearchUsersResponse> adminSearchUsersWithHttpInfo(final AdminSearchUsersRequest requestData) throws ApiException {
        final Call call = this.adminSearchUsersValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<AdminSearchUsersResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call adminSearchUsersAsync(final AdminSearchUsersRequest requestData, final ApiCallback<AdminSearchUsersResponse> callback) throws ApiException {
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
        final Call call = this.adminSearchUsersValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<AdminSearchUsersResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call adminSetUserStatusCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = request;
        final String localVarPath = "/api/Admin/SetUserStatus";
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
    
    private Call adminSetUserStatusValidateBeforeCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.adminSetUserStatusCall(request, progressListener, progressRequestListener);
        return call;
    }
    
    public AdminRsaResponse adminSetUserStatus(final AdminRsaRequest request) throws ApiException {
        final ApiResponse<AdminRsaResponse> resp = this.adminSetUserStatusWithHttpInfo(request);
        return resp.getData();
    }
    
    public ApiResponse<AdminRsaResponse> adminSetUserStatusWithHttpInfo(final AdminRsaRequest request) throws ApiException {
        final Call call = this.adminSetUserStatusValidateBeforeCall(request, null, null);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call adminSetUserStatusAsync(final AdminRsaRequest request, final ApiCallback<AdminRsaResponse> callback) throws ApiException {
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
        final Call call = this.adminSetUserStatusValidateBeforeCall(request, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call adminUnlockUserCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = request;
        final String localVarPath = "/api/Admin/UnlockUser";
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
    
    private Call adminUnlockUserValidateBeforeCall(final AdminRsaRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.adminUnlockUserCall(request, progressListener, progressRequestListener);
        return call;
    }
    
    public AdminRsaResponse adminUnlockUser(final AdminRsaRequest request) throws ApiException {
        final ApiResponse<AdminRsaResponse> resp = this.adminUnlockUserWithHttpInfo(request);
        return resp.getData();
    }
    
    public ApiResponse<AdminRsaResponse> adminUnlockUserWithHttpInfo(final AdminRsaRequest request) throws ApiException {
        final Call call = this.adminUnlockUserValidateBeforeCall(request, null, null);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call adminUnlockUserAsync(final AdminRsaRequest request, final ApiCallback<AdminRsaResponse> callback) throws ApiException {
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
        final Call call = this.adminUnlockUserValidateBeforeCall(request, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<AdminRsaResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public Call adminUserInfoCall(final AdminUserInfoRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = requestData;
        final String localVarPath = "/api/Admin/UserInfo";
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
    
    private Call adminUserInfoValidateBeforeCall(final AdminUserInfoRequest requestData, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.adminUserInfoCall(requestData, progressListener, progressRequestListener);
        return call;
    }
    
    public AdminUserInfoResponse adminUserInfo(final AdminUserInfoRequest requestData) throws ApiException {
        final ApiResponse<AdminUserInfoResponse> resp = this.adminUserInfoWithHttpInfo(requestData);
        return resp.getData();
    }
    
    public ApiResponse<AdminUserInfoResponse> adminUserInfoWithHttpInfo(final AdminUserInfoRequest requestData) throws ApiException {
        final Call call = this.adminUserInfoValidateBeforeCall(requestData, null, null);
        final Type localVarReturnType = new TypeToken<AdminUserInfoResponse>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call adminUserInfoAsync(final AdminUserInfoRequest requestData, final ApiCallback<AdminUserInfoResponse> callback) throws ApiException {
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
        final Call call = this.adminUserInfoValidateBeforeCall(requestData, progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<AdminUserInfoResponse>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
