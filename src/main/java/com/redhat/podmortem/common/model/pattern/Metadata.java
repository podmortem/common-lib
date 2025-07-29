package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

/**
 * Metadata information for pattern libraries and pattern sets.
 *
 * <p>Contains versioning, maintainer information, compatibility details, and dependency tracking
 * for pattern libraries used in the Podmortem system.
 */
@RegisterForReflection
public class Metadata {
    @JsonProperty("library_id")
    private String libraryId;

    private String version;
    private String maintainer;
    private List<String> compatibility;
    private List<String> dependencies;

    /**
     * Gets the unique identifier for this pattern library.
     *
     * @return the library ID
     */
    public String getLibraryId() {
        return libraryId;
    }

    /**
     * Sets the unique identifier for this pattern library.
     *
     * @param libraryId the library ID
     */
    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    /**
     * Gets the version of this pattern library.
     *
     * @return the version string (e.g., "1.0.0")
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version of this pattern library.
     *
     * @param version the version string
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the maintainer of this pattern library.
     *
     * @return the maintainer name or contact information
     */
    public String getMaintainer() {
        return maintainer;
    }

    /**
     * Sets the maintainer of this pattern library.
     *
     * @param maintainer the maintainer name or contact information
     */
    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    /**
     * Gets the list of compatible systems or versions.
     *
     * @return the list of compatibility information
     */
    public List<String> getCompatibility() {
        return compatibility;
    }

    /**
     * Sets the list of compatible systems or versions.
     *
     * @param compatibility the list of compatibility information
     */
    public void setCompatibility(List<String> compatibility) {
        this.compatibility = compatibility;
    }

    /**
     * Gets the list of dependencies for this pattern library.
     *
     * @return the list of dependency identifiers
     */
    public List<String> getDependencies() {
        return dependencies;
    }

    /**
     * Sets the list of dependencies for this pattern library.
     *
     * @param dependencies the list of dependency identifiers
     */
    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }
}
