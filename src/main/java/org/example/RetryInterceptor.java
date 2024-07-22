package org.example;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class RetryInterceptor implements Interceptor {
    private final int maxRetries;
    private final int retryDelayMillis;

    public RetryInterceptor(int maxRetries, int retryDelayMillis) {
        this.maxRetries = maxRetries;
        this.retryDelayMillis = retryDelayMillis;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = null;
        IOException exception = null;

        for (int i = 0; i < maxRetries; i++) {
            try {
                response = chain.proceed(request);
                if (response.isSuccessful()) {
                    return response;
                }
            } catch (IOException e) {
                exception = e;
            }

            if (response != null) {
                response.close();
            }

            try {
                Thread.sleep(retryDelayMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IOException("Retry interrupted", e);
            }
        }

        if (response == null && exception != null) {
            throw exception;
        }
        return response;
    }
}
