package com.redhat.podmortem.common.model.provider;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Objects;

/**
 * Represents the natural language explanation received from an AI provider. This is a shared model
 * that is part of the AIProvider contract.
 */
@RegisterForReflection
public class AIResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String explanation;
    private String providerId;
    private String modelId;
    private Instant generatedAt;
    private Integer tokenCount;
    private Duration processingTime;
    private Double confidence;
    private Map<String, Object> metadata;

    public AIResponse() {}

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public Instant getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Instant generatedAt) {
        this.generatedAt = generatedAt;
    }

    public Integer getTokenCount() {
        return tokenCount;
    }

    public void setTokenCount(Integer tokenCount) {
        this.tokenCount = tokenCount;
    }

    public Duration getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(Duration processingTime) {
        this.processingTime = processingTime;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AIResponse that = (AIResponse) o;
        return Objects.equals(providerId, that.providerId)
                && Objects.equals(modelId, that.modelId)
                && Objects.equals(generatedAt, that.generatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId, modelId, generatedAt);
    }
}
