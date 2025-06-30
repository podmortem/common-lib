package com.redhat.podmortem.common.model.kube.aiprovider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.Map;

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

    public AuthenticationRef getAuthenticationRef() {
        return authenticationRef;
    }

    public void setAuthenticationRef(AuthenticationRef authenticationRef) {
        this.authenticationRef = authenticationRef;
    }

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public Integer getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    public Boolean getCachingEnabled() {
        return cachingEnabled;
    }

    public void setCachingEnabled(Boolean cachingEnabled) {
        this.cachingEnabled = cachingEnabled;
    }

    public String getPromptTemplate() {
        return promptTemplate;
    }

    public void setPromptTemplate(String promptTemplate) {
        this.promptTemplate = promptTemplate;
    }

    public Integer getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Map<String, String> getAdditionalConfig() {
        return additionalConfig;
    }

    public void setAdditionalConfig(Map<String, String> additionalConfig) {
        this.additionalConfig = additionalConfig;
    }
}
