package com.redhat.podmortem.common.model.kube.patternlibrary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.time.Instant;
import java.util.List;

/**
 * Status information for Pattern Library Custom Resource.
 *
 * <p>Tracks the current state of pattern library synchronization including sync status, available
 * libraries, and operational information.
 */
@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatternLibraryStatus {

    private String phase;
    private String message;
    private Instant lastSyncTime;
    private List<String> availableLibraries;
    private Long observedGeneration;

    /**
     * Gets the current operational phase of the pattern library.
     *
     * @return the current phase (e.g., "Syncing", "Ready", "Failed")
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the current operational phase of the pattern library.
     *
     * @param phase the current phase
     */
    public void setPhase(String phase) {
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
     * Gets the timestamp of the last successful synchronization.
     *
     * @return the last sync timestamp
     */
    public Instant getLastSyncTime() {
        return lastSyncTime;
    }

    /**
     * Sets the timestamp of the last successful synchronization.
     *
     * @param lastSyncTime the last sync timestamp
     */
    public void setLastSyncTime(Instant lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    /**
     * Gets the list of currently available pattern library IDs.
     *
     * @return the list of available library identifiers
     */
    public List<String> getAvailableLibraries() {
        return availableLibraries;
    }

    /**
     * Sets the list of currently available pattern library IDs.
     *
     * @param availableLibraries the list of available library identifiers
     */
    public void setAvailableLibraries(List<String> availableLibraries) {
        this.availableLibraries = availableLibraries;
    }

    /**
     * Gets the observed generation of the pattern library spec.
     *
     * @return the observed generation number
     */
    public Long getObservedGeneration() {
        return observedGeneration;
    }

    /**
     * Sets the observed generation of the pattern library spec.
     *
     * @param observedGeneration the observed generation number
     */
    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }
}
