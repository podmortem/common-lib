package com.redhat.podmortem.common.model.provider;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.io.Serializable;

/** A shared model to hold the result of a provider configuration validation check. */
@RegisterForReflection
public class ValidationResult implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean isValid;
    private String providerId;
    private String modelId;
    private String message;

    public ValidationResult() {}

    public ValidationResult(boolean isValid, String providerId, String modelId, String message) {
        this.isValid = isValid;
        this.providerId = providerId;
        this.modelId = modelId;
        this.message = message;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
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

    public String getMessage() {
        return message;
    }

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
