package com.redhat.podmortem.common.model.pattern;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

@RegisterForReflection
public class PatternSet {
    private Metadata metadata;
    private List<String> categories;
    private List<Pattern> patterns;

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
}
