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
    private int maxTokens = 500;
    private double temperature = 0.3;

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

    public int getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(int maxTokens) {
        this.maxTokens = maxTokens;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
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

    /**
     * Creates an AIProviderConfig from an AI Provider CRD and authentication token.
     *
     * @param spec The AI Provider CRD spec
     * @param authToken The authentication token from the referenced secret
     * @return A configured AIProviderConfig instance
     */
    public static AIProviderConfig fromCRD(
            com.redhat.podmortem.common.model.kube.aiprovider.AIProviderSpec spec,
            String authToken) {
        AIProviderConfig config = new AIProviderConfig();
        config.setProviderId(spec.getProviderId());
        config.setApiUrl(spec.getApiUrl());
        config.setModelId(spec.getModelId());
        config.setAuthToken(authToken);
        config.setTimeoutSeconds(spec.getTimeoutSeconds() != null ? spec.getTimeoutSeconds() : 30);
        config.setMaxRetries(spec.getMaxRetries() != null ? spec.getMaxRetries() : 3);
        config.setCachingEnabled(
                spec.getCachingEnabled() != null ? spec.getCachingEnabled() : true);
        config.setPromptTemplate(spec.getPromptTemplate());
        config.setMaxTokens(spec.getMaxTokens() != null ? spec.getMaxTokens() : 500);
        config.setTemperature(spec.getTemperature() != null ? spec.getTemperature() : 0.3);

        // Convert additional config to headers if needed
        if (spec.getAdditionalConfig() != null) {
            config.setAdditionalHeaders(spec.getAdditionalConfig());
        }

        return config;
    }
}
