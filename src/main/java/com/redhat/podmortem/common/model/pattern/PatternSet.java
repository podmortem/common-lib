package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;
import java.util.Map;

/**
 * Collection of related failure patterns organized as a cohesive set.
 *
 * <p>Represents a pattern library containing multiple patterns, metadata about the set, category
 * organization, and relationships between patterns. Used for pattern management and distribution
 * across the Podmortem system.
 */
@RegisterForReflection
public class PatternSet {
    private Metadata metadata;
    private List<String> categories;
    private List<Pattern> patterns;

    @JsonProperty("related_patterns")
    private List<Map<String, Object>> relatedPatterns;

    /**
     * Gets metadata information about this pattern set.
     *
     * @return the pattern set metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets metadata information about this pattern set.
     *
     * @param metadata the pattern set metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Gets the list of categories available in this pattern set.
     *
     * @return the list of category names
     */
    public List<String> getCategories() {
        return categories;
    }

    /**
     * Sets the list of categories available in this pattern set.
     *
     * @param categories the list of category names
     */
    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    /**
     * Gets the patterns contained in this set.
     *
     * @return the list of patterns
     */
    public List<Pattern> getPatterns() {
        return patterns;
    }

    /**
     * Sets the patterns contained in this set.
     *
     * @param patterns the list of patterns
     */
    public void setPatterns(List<Pattern> patterns) {
        this.patterns = patterns;
    }

    /**
     * Gets the relationships between patterns in this set.
     *
     * @return the list of pattern relationship definitions
     */
    public List<Map<String, Object>> getRelatedPatterns() {
        return relatedPatterns;
    }

    /**
     * Sets the relationships between patterns in this set.
     *
     * @param relatedPatterns the list of pattern relationship definitions
     */
    public void setRelatedPatterns(List<Map<String, Object>> relatedPatterns) {
        this.relatedPatterns = relatedPatterns;
    }
}
