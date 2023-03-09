package io.consumerweb.mfa.client;

import okio.Okio;
import okio.Sink;
import okio.GzipSink;
import com.squareup.okhttp.MediaType;
import okio.BufferedSink;
import okio.Buffer;
import com.squareup.okhttp.RequestBody;
import java.io.IOException;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.Interceptor;

class GzipRequestInterceptor implements Interceptor
{
    @Override
    public Response intercept(final Chain chain) throws IOException {
        final Request originalRequest = chain.request();
        if (originalRequest.body() == null || originalRequest.header("Content-Encoding") != null) {
            return chain.proceed(originalRequest);
        }
        final Request compressedRequest = originalRequest.newBuilder().header("Content-Encoding", "gzip").method(originalRequest.method(), this.forceContentLength(this.gzip(originalRequest.body()))).build();
        return chain.proceed(compressedRequest);
    }
    
    private RequestBody forceContentLength(final RequestBody requestBody) throws IOException {
        final Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        return new RequestBody() {
            @Override
            public MediaType contentType() {
                return requestBody.contentType();
            }
            
            @Override
            public long contentLength() {
                return buffer.size();
            }
            
            @Override
            public void writeTo(final BufferedSink sink) throws IOException {
                sink.write(buffer.snapshot());
            }
        };
    }
    
    private RequestBody gzip(final RequestBody body) {
        return new RequestBody() {
            @Override
            public MediaType contentType() {
                return body.contentType();
            }
            
            @Override
            public long contentLength() {
                return -1L;
            }
            
            @Override
            public void writeTo(final BufferedSink sink) throws IOException {
                final BufferedSink gzipSink = Okio.buffer(new GzipSink(sink));
                body.writeTo(gzipSink);
                gzipSink.close();
            }
        };
    }
}
