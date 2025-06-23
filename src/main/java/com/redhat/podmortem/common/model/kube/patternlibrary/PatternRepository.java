package com.redhat.podmortem.common.model.kube.patternlibrary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;

/** Defines a Git repository containing pattern libraries. */
@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatternRepository {

    private String name;
    private String url;
    private String branch;
    private Credentials credentials;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
}
