package com.redhat.podmortem.common.model.kube.aiprovider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.time.Instant;
import java.util.List;

@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AIProviderStatus {

    public enum Phase {
        PENDING,
        READY,
        FAILED,
        VALIDATING
    }

    private Phase phase;
    private String message;
    private Instant lastValidated;
    private List<String> conditions;

    public Phase getPhase() {
        return phase;
    }

    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Instant getLastValidated() {
        return lastValidated;
    }

    public void setLastValidated(Instant lastValidated) {
        this.lastValidated = lastValidated;
    }

    public List<String> getConditions() {
        return conditions;
    }

    public void setConditions(List<String> conditions) {
        this.conditions = conditions;
    }
}
