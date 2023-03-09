package io.consumerweb.mfa.client;

public class Configuration
{
    private static ApiClient defaultApiClient;
    
    public static ApiClient getDefaultApiClient() {
        return Configuration.defaultApiClient;
    }
    
    public static void setDefaultApiClient(final ApiClient apiClient) {
        Configuration.defaultApiClient = apiClient;
    }
    
    static {
        Configuration.defaultApiClient = new ApiClient();
    }
}
