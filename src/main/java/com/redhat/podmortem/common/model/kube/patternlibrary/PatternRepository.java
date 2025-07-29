package com.redhat.podmortem.common.model.kube.patternlibrary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Configuration for a Git repository containing pattern libraries.
 *
 * <p>Defines connection details for synchronizing failure patterns from external Git repositories,
 * including authentication credentials and branch selection.
 */
@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatternRepository {

    private String name;
    private String url;
    private String branch;
    private Credentials credentials;

    /**
     * Gets the human-readable name for this pattern repository.
     *
     * @return the repository name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the human-readable name for this pattern repository.
     *
     * @param name the repository name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the Git repository URL.
     *
     * @return the repository URL (e.g., "https://github.com/org/patterns.git")
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the Git repository URL.
     *
     * @param url the repository URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets the Git branch to synchronize from.
     *
     * @return the branch name (default: "main" or "master")
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the Git branch to synchronize from.
     *
     * @param branch the branch name
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * Gets the credentials for accessing the Git repository.
     *
     * @return the repository credentials, or null for public repositories
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the credentials for accessing the Git repository.
     *
     * @param credentials the repository credentials
     */
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
}
