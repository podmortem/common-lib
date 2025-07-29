package com.redhat.podmortem.common.model.provider;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.io.Serializable;

/**
 * Result of an AI provider configuration validation check.
 *
 * <p>Contains validation status, provider information, and descriptive messages about configuration
 * validity or error conditions.
 */
@RegisterForReflection
public class ValidationResult implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean isValid;
    private String providerId;
    private String modelId;
    private String message;

    public ValidationResult() {}

    /**
     * Creates a validation result with all fields.
     *
     * @param isValid whether the configuration is valid
     * @param providerId the provider identifier
     * @param modelId the model identifier
     * @param message descriptive message about the validation result
     */
    public ValidationResult(boolean isValid, String providerId, String modelId, String message) {
        this.isValid = isValid;
        this.providerId = providerId;
        this.modelId = modelId;
        this.message = message;
    }

    /**
     * Gets whether the configuration is valid.
     *
     * @return true if valid, false otherwise
     */
    public boolean isValid() {
        return isValid;
    }

    /**
     * Sets whether the configuration is valid.
     *
     * @param valid true if valid, false otherwise
     */
    public void setValid(boolean valid) {
        isValid = valid;
    }

    /**
     * Gets the provider identifier that was validated.
     *
     * @return the provider ID
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Sets the provider identifier that was validated.
     *
     * @param providerId the provider ID
     */
    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    /**
     * Gets the model identifier that was validated.
     *
     * @return the model ID
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * Sets the model identifier that was validated.
     *
     * @param modelId the model ID
     */
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * Gets the descriptive message about the validation result.
     *
     * @return the validation message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the descriptive message about the validation result.
     *
     * @param message the validation message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ValidationResult{"
                + "isValid="
                + isValid
                + ", providerId='"
                + providerId
                + '\''
                + ", message='"
                + message
                + '\''
                + '}';
    }
}
