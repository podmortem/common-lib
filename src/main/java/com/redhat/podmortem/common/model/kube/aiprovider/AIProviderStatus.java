package com.redhat.podmortem.common.model.kube.aiprovider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.time.Instant;
import java.util.List;

/**
 * Status information for AI Provider Custom Resource.
 *
 * <p>Tracks the current state of the AI provider including validation status, operational phase,
 * and any conditions or error messages.
 */
@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AIProviderStatus {

    /** Represents the current operational phase of the AI provider. */
    public enum Phase {
        /** Initial state, provider is being set up */
        PENDING,
        /** Provider is validated and ready for use */
        READY,
        /** Provider configuration is invalid or service unavailable */
        FAILED,
        /** Provider is currently being validated */
        VALIDATING
    }

    private Phase phase;
    private String message;
    private Instant lastValidated;
    private List<String> conditions;

    /**
     * Gets the current operational phase of the AI provider.
     *
     * @return the current phase
     */
    public Phase getPhase() {
        return phase;
    }

    /**
     * Sets the current operational phase of the AI provider.
     *
     * @param phase the current phase
     */
    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    /**
     * Gets the human-readable status message.
     *
     * @return the status message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the human-readable status message.
     *
     * @param message the status message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the timestamp of the last successful validation.
     *
     * @return the last validation timestamp
     */
    public Instant getLastValidated() {
        return lastValidated;
    }

    /**
     * Sets the timestamp of the last successful validation.
     *
     * @param lastValidated the last validation timestamp
     */
    public void setLastValidated(Instant lastValidated) {
        this.lastValidated = lastValidated;
    }

    /**
     * Gets the list of current conditions affecting the provider.
     *
     * @return the list of condition descriptions
     */
    public List<String> getConditions() {
        return conditions;
    }

    /**
     * Sets the list of current conditions affecting the provider.
     *
     * @param conditions the list of condition descriptions
     */
    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }
}
