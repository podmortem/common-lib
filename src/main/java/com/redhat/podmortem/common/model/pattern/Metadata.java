package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

@RegisterForReflection
public class Metadata {
    @JsonProperty("library_id")
    private String libraryId;

    private String version;
    private String maintainer;
    private List<String> compatibility;
    private List<String> dependencies;

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public List<String> getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(List<String> compatibility) {
        this.compatibility = compatibility;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }
}
