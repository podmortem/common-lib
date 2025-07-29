package com.redhat.podmortem.common.model.provider;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.io.Serializable;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Objects;

/**
 * Response model containing AI-generated explanations for pod failures.
 *
 * <p>Contains the generated explanation text along with metadata about the AI provider, model used,
 * performance metrics, and optional confidence scoring.
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

    /**
     * Gets the AI-generated explanation text.
     *
     * @return the explanation text
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the AI-generated explanation text.
     *
     * @param explanation the explanation text
     */
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /**
     * Gets the identifier of the AI provider that generated this response.
     *
     * @return the provider ID
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Sets the identifier of the AI provider that generated this response.
     *
     * @param providerId the provider ID
     */
    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    /**
     * Gets the model identifier used for text generation.
     *
     * @return the model ID
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * Sets the model identifier used for text generation.
     *
     * @param modelId the model ID
     */
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * Gets the timestamp when this response was generated.
     *
     * @return the generation timestamp
     */
    public Instant getGeneratedAt() {
        return generatedAt;
    }

    /**
     * Sets the timestamp when this response was generated.
     *
     * @param generatedAt the generation timestamp
     */
    public void setGeneratedAt(Instant generatedAt) {
        this.generatedAt = generatedAt;
    }

    /**
     * Gets the number of tokens consumed during generation.
     *
     * @return the token count, or null if not available
     */
    public Integer getTokenCount() {
        return tokenCount;
    }

    /**
     * Sets the number of tokens consumed during generation.
     *
     * @param tokenCount the token count
     */
    public void setTokenCount(Integer tokenCount) {
        this.tokenCount = tokenCount;
    }

    /**
     * Gets the time taken to process the request.
     *
     * @return the processing duration
     */
    public Duration getProcessingTime() {
        return processingTime;
    }

    /**
     * Sets the time taken to process the request.
     *
     * @param processingTime the processing duration
     */
    public void setProcessingTime(Duration processingTime) {
        this.processingTime = processingTime;
    }

    /**
     * Gets the confidence score for this explanation.
     *
     * @return the confidence score (0.0 to 1.0), or null if not available
     */
    public Double getConfidence() {
        return confidence;
    }

    /**
     * Sets the confidence score for this explanation.
     *
     * @param confidence the confidence score (0.0 to 1.0)
     */
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    /**
     * Gets additional metadata associated with this response.
     *
     * @return the metadata map
     */
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    /**
     * Sets additional metadata associated with this response.
     *
     * @param metadata the metadata map
     */
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
