package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;
import java.util.Map;

@RegisterForReflection
public class PatternSet {
    private Metadata metadata;
    private List<String> categories;
    private List<Pattern> patterns;

    @JsonProperty("related_patterns")
    private List<Map<String, Object>> relatedPatterns;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<Pattern> getPatterns() {
        return patterns;
    }

    public void setPatterns(List<Pattern> patterns) {
        this.patterns = patterns;
    }

    public List<Map<String, Object>> getRelatedPatterns() {
        return relatedPatterns;
    }

    public void setRelatedPatterns(List<Map<String, Object>> relatedPatterns) {
        this.relatedPatterns = relatedPatterns;
    }
}
