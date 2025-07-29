package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

/**
 * Remediation information for failure patterns.
 *
 * <p>Provides guidance on how to resolve issues identified by failure patterns, including common
 * causes, suggested commands, and links to documentation.
 */
@RegisterForReflection
public class Remediation {
    private String description;

    @JsonProperty("common_causes")
    private List<String> commonCauses;

    @JsonProperty("suggested_commands")
    private List<String> suggestedCommands;

    @JsonProperty("documentation_links")
    private List<String> documentationLinks;

    /**
     * Gets the human-readable description of the remediation steps.
     *
     * @return the remediation description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the human-readable description of the remediation steps.
     *
     * @param description the remediation description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the list of common causes for this type of failure.
     *
     * @return the list of common causes
     */
    public List<String> getCommonCauses() {
        return commonCauses;
    }

    /**
     * Sets the list of common causes for this type of failure.
     *
     * @param commonCauses the list of common causes
     */
    public void setCommonCauses(List<String> commonCauses) {
        this.commonCauses = commonCauses;
    }

    /**
     * Gets the list of suggested commands to resolve the issue.
     *
     * @return the list of suggested commands
     */
    public List<String> getSuggestedCommands() {
        return suggestedCommands;
    }

    /**
     * Sets the list of suggested commands to resolve the issue.
     *
     * @param suggestedCommands the list of suggested commands
     */
    public void setSuggestedCommands(List<String> suggestedCommands) {
        this.suggestedCommands = suggestedCommands;
    }

    /**
     * Gets the list of documentation links for further information.
     *
     * @return the list of documentation URLs
     */
    public List<String> getDocumentationLinks() {
        return documentationLinks;
    }

    /**
     * Sets the list of documentation links for further information.
     *
     * @param documentationLinks the list of documentation URLs
     */
    public void setDocumentationLinks(List<String> documentationLinks) {
        this.documentationLinks = documentationLinks;
    }
}
