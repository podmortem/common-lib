package com.redhat.podmortem.common.model.kube.patternlibrary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatternLibrarySpec {

    private List<PatternRepository> repositories;
    private String refreshInterval;
    private List<String> enabledLibraries;

    public List<PatternRepository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<PatternRepository> repositories) {
        this.repositories = repositories;
    }

    public String getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(String refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    public List<String> getEnabledLibraries() {
        return enabledLibraries;
    }

    public void setEnabledLibraries(List<String> enabledLibraries) {
        this.enabledLibraries = enabledLibraries;
    }
}
