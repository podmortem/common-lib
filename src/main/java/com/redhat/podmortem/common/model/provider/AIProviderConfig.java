package com.redhat.podmortem.common.model.provider;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 * Configuration model for AI providers.
 *
 * <p>Contains all necessary configuration parameters for connecting to and using AI services. Can
 * be loaded from Kubernetes ConfigMaps and Secrets for cloud-native deployments.
 */
@RegisterForReflection
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

    /**
     * Gets the unique identifier for the AI provider.
     *
     * @return the provider ID
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Sets the unique identifier for the AI provider.
     *
     * @param providerId the provider ID
     */
    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    /**
     * Gets the API endpoint URL for the AI service.
     *
     * @return the API URL
     */
    public String getApiUrl() {
        return apiUrl;
    }

    /**
     * Sets the API endpoint URL for the AI service.
     *
     * @param apiUrl the API URL
     */
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    /**
     * Gets the model identifier to use for text generation.
     *
     * @return the model ID
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * Sets the model identifier to use for text generation.
     *
     * @param modelId the model ID
     */
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * Gets the authentication token for API access.
     *
     * @return the authentication token
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Sets the authentication token for API access.
     *
     * @param authToken the authentication token
     */
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    /**
     * Gets additional HTTP headers to include in API requests.
     *
     * @return the additional headers map
     */
    public Map<String, String> getAdditionalHeaders() {
        return additionalHeaders;
    }

    /**
     * Sets additional HTTP headers to include in API requests.
     *
     * @param additionalHeaders the additional headers map
     */
    public void setAdditionalHeaders(Map<String, String> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    /**
     * Gets the request timeout in seconds.
     *
     * @return the timeout in seconds
     */
    public int getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * Sets the request timeout in seconds.
     *
     * @param timeoutSeconds the timeout in seconds
     */
    public void setTimeoutSeconds(int timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * Gets the maximum number of retry attempts for failed requests.
     *
     * @return the maximum retry count
     */
    public int getMaxRetries() {
        return maxRetries;
    }

    /**
     * Sets the maximum number of retry attempts for failed requests.
     *
     * @param maxRetries the maximum retry count
     */
    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * Gets whether response caching is enabled.
     *
     * @return true if caching is enabled, false otherwise
     */
    public boolean isCachingEnabled() {
        return cachingEnabled;
    }

    /**
     * Sets whether response caching is enabled.
     *
     * @param cachingEnabled true to enable caching, false to disable
     */
    public void setCachingEnabled(boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
    }

    /**
     * Gets the custom prompt template for this provider.
     *
     * @return the prompt template, or null if using default
     */
    public String getPromptTemplate() {
        return promptTemplate;
    }

    /**
     * Sets the custom prompt template for this provider.
     *
     * @param promptTemplate the prompt template
     */
    public void setPromptTemplate(String promptTemplate) {
        this.promptTemplate = promptTemplate;
    }

    /**
     * Gets the maximum number of tokens to generate.
     *
     * @return the maximum token count
     */
    public int getMaxTokens() {
        return maxTokens;
    }

    /**
     * Sets the maximum number of tokens to generate.
     *
     * @param maxTokens the maximum token count
     */
    public void setMaxTokens(int maxTokens) {
        this.maxTokens = maxTokens;
    }

    /**
     * Gets the sampling temperature for text generation.
     *
     * @return the temperature value (0.0 to 2.0)
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Sets the sampling temperature for text generation.
     *
     * <p>Controls randomness: 0.0 = deterministic, 1.0 = balanced, 2.0 = creative.
     *
     * @param temperature the temperature value (0.0 to 2.0)
     */
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
     * @param spec the AI Provider CRD spec
     * @param authToken the authentication token from the referenced secret
     * @return a configured AIProviderConfig instance
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

        // convert additional config to headers if needed
        if (spec.getAdditionalConfig() != null) {
            config.setAdditionalHeaders(spec.getAdditionalConfig());
        }

        return config;
    }
}
