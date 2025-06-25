package com.redhat.podmortem.common.model.provider;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 * A shared configuration model for any AI Provider. This can be loaded from Kubernetes ConfigMaps
 * and Secrets.
 */
public class AIProviderConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    private String providerId;
    private String apiUrl;
    private String modelId;
    private String authToken;
    private Map<String, String> additionalHeaders;
    private int timeoutSeconds = 30;
    private int maxRetries = 3;
    private boolean cachingEnabled = true;
    private String promptTemplate;

    public AIProviderConfig() {}

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public Map<String, String> getAdditionalHeaders() {
        return additionalHeaders;
    }

    public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    public int getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(int timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public boolean isCachingEnabled() {
        return cachingEnabled;
    }

    public void setCachingEnabled(boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
    }

    public String getPromptTemplate() {
        return promptTemplate;
    }

    public void setPromptTemplate(String promptTemplate) {
        this.promptTemplate = promptTemplate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AIProviderConfig that = (AIProviderConfig) o;
        return Objects.equals(providerId, that.providerId)
                && Objects.equals(apiUrl, that.apiUrl)
                && Objects.equals(modelId, that.modelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId, apiUrl, modelId);
    }
}
