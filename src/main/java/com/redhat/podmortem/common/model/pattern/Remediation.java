package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

@RegisterForReflection
public class Remediation {
    private String description;

    @JsonProperty("common_causes")
    private List<String> commonCauses;

    @JsonProperty("suggested_commands")
    private List<String> suggestedCommands;

    @JsonProperty("documentation_links")
    private List<String> documentationLinks;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getCommonCauses() {
        return commonCauses;
    }

    public void setCommonCauses(List<String> commonCauses) {
        this.commonCauses = commonCauses;
    }

    public List<String> getSuggestedCommands() {
        return suggestedCommands;
    }

    public void setSuggestedCommands(List<String> suggestedCommands) {
        this.suggestedCommands = suggestedCommands;
    }

    public List<String> getDocumentationLinks() {
        return documentationLinks;
    }

    public void setDocumentationLinks(List<String> documentationLinks) {
        this.documentationLinks = documentationLinks;
    }
}
