package com.redhat.podmortem.common.model.kube.aiprovider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.Map;

/** Specification for AI Provider Custom Resource. */
@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AIProviderSpec {

    private String providerId;
    private String apiUrl;
    private String modelId;
    private AuthenticationRef authenticationRef;
    private Integer timeoutSeconds = 30;
    private Integer maxRetries = 3;
    private Boolean cachingEnabled = true;
    private String promptTemplate;
    private Integer maxTokens = 500;
    private Double temperature = 0.3;
    private Map<String, String> additionalConfig;

    /**
     * Gets the unique identifier for this AI provider.
     *
     * @return the provider ID (e.g., "openai", "ollama")
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Sets the unique identifier for this AI provider.
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
     * Gets the reference to authentication credentials.
     *
     * @return the authentication reference
     */
    public AuthenticationRef getAuthenticationRef() {
        return authenticationRef;
    }

    /**
     * Sets the reference to authentication credentials.
     *
     * @param authenticationRef the authentication reference
     */
    public void setAuthenticationRef(AuthenticationRef authenticationRef) {
        this.authenticationRef = authenticationRef;
    }

    /**
     * Gets the request timeout in seconds.
     *
     * @return the timeout in seconds (default: 30)
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * Sets the request timeout in seconds.
     *
     * @param timeoutSeconds the timeout in seconds
     */
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * Gets the maximum number of retry attempts for failed requests.
     *
     * @return the maximum retry count (default: 3)
     */
    public Integer getMaxRetries() {
        return maxRetries;
    }

    /**
     * Sets the maximum number of retry attempts for failed requests.
     *
     * @param maxRetries the maximum retry count
     */
    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * Gets whether response caching is enabled.
     *
     * @return true if caching is enabled (default: true), false otherwise
     */
    public Boolean getCachingEnabled() {
        return cachingEnabled;
    }

    /**
     * Sets whether response caching is enabled.
     *
     * @param cachingEnabled true to enable caching, false to disable
     */
    public void setCachingEnabled(Boolean cachingEnabled) {
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
     * @return the maximum token count (default: 500)
     */
    public Integer getMaxTokens() {
        return maxTokens;
    }

    /**
     * Sets the maximum number of tokens to generate.
     *
     * @param maxTokens the maximum token count
     */
    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    /**
     * Gets the sampling temperature for text generation.
     *
     * @return the temperature value (default: 0.3)
     */
    public Double getTemperature() {
        return temperature;
    }

    /**
     * Sets the sampling temperature for text generation.
     *
     * <p>Controls randomness: 0.0 = deterministic, 1.0 = balanced, 2.0 = creative.
     *
     * @param temperature the temperature value (0.0 to 2.0)
     */
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    /**
     * Gets additional configuration parameters specific to the provider.
     *
     * @return the additional configuration map
     */
    public Map<String, String> getAdditionalConfig() {
        return additionalConfig;
    }

    /**
     * Sets additional configuration parameters specific to the provider.
     *
     * @param additionalConfig the additional configuration map
     */
    public void setAdditionalConfig(Map<String, String> additionalConfig) {
        this.additionalConfig = additionalConfig;
    }
}
