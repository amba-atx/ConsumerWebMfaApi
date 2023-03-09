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
import io.consumerweb.mfa.client.model.VersionAccessor;

import com.squareup.okhttp.Response;
import com.squareup.okhttp.Interceptor;
import java.util.HashMap;
import java.util.ArrayList;
import com.squareup.okhttp.Call;

public class VersionApi
{
    private ApiClient apiClient;
    
    public VersionApi() {
        this(Configuration.getDefaultApiClient());
    }
    
    public VersionApi(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public ApiClient getApiClient() {
        return this.apiClient;
    }
    
    public void setApiClient(final ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public Call versionIndexCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Object localVarPostBody = null;
        final String localVarPath = "/api/Version";
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
        return this.apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private Call versionIndexValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        final Call call = this.versionIndexCall(progressListener, progressRequestListener);
        return call;
    }
    
    public VersionAccessor versionIndex() throws ApiException {
        final ApiResponse<VersionAccessor> resp = this.versionIndexWithHttpInfo();
        return resp.getData();
    }
    
    public ApiResponse<VersionAccessor> versionIndexWithHttpInfo() throws ApiException {
        final Call call = this.versionIndexValidateBeforeCall(null, null);
        final Type localVarReturnType = new TypeToken<VersionAccessor>() {}.getType();
        return this.apiClient.execute(call, localVarReturnType);
    }
    
    public Call versionIndexAsync(final ApiCallback<VersionAccessor> callback) throws ApiException {
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
        final Call call = this.versionIndexValidateBeforeCall(progressListener, progressRequestListener);
        final Type localVarReturnType = new TypeToken<VersionAccessor>() {}.getType();
        this.apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
