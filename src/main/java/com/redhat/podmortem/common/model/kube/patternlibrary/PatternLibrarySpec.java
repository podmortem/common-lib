package com.redhat.podmortem.common.model.kube.patternlibrary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

/**
 * Specification for Pattern Library Custom Resource.
 *
 * <p>Defines the desired configuration for pattern library synchronization including Git
 * repositories, refresh intervals, and which libraries should be enabled.
 */
@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatternLibrarySpec {

    private List<PatternRepository> repositories;
    private String refreshInterval;
    private List<String> enabledLibraries;

    /**
     * Gets the list of Git repositories containing pattern libraries.
     *
     * @return the list of pattern repositories
     */
    public List<PatternRepository> getRepositories() {
        return repositories;
    }

    /**
     * Sets the list of Git repositories containing pattern libraries.
     *
     * @param repositories the list of pattern repositories
     */
    public void setRepositories(List<PatternRepository> repositories) {
        this.repositories = repositories;
    }

    /**
     * Gets the refresh interval for synchronizing pattern libraries.
     *
     * @return the refresh interval (e.g., "1h", "30m")
     */
    public String getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * Sets the refresh interval for synchronizing pattern libraries.
     *
     * @param refreshInterval the refresh interval duration string
     */
    public void setRefreshInterval(String refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    /**
     * Gets the list of pattern library IDs that should be enabled.
     *
     * @return the list of enabled library identifiers
     */
    public List<String> getEnabledLibraries() {
        return enabledLibraries;
    }

    /**
     * Sets the list of pattern library IDs that should be enabled.
     *
     * @param enabledLibraries the list of enabled library identifiers
     */
    public void setEnabledLibraries(List<String> enabledLibraries) {
        this.enabledLibraries = enabledLibraries;
    }
}
