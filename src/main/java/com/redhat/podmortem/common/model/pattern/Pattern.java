package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

/**
 * Represents a failure pattern used for log analysis and matching.
 *
 * <p>Contains pattern definitions, matching rules, severity information, categorization, and
 * remediation steps. Used by the log-parser to identify known failure scenarios.
 */
@RegisterForReflection
public class Pattern {
    private String id;
    private String name;

    @JsonProperty("primary_pattern")
    private PrimaryPattern primaryPattern;

    @JsonProperty("secondary_patterns")
    private List<SecondaryPattern> secondaryPatterns;

    @JsonProperty("sequence_patterns")
    private List<SequencePattern> sequencePatterns;

    private String severity;
    private List<String> category;
    private Remediation remediation;

    @JsonProperty("related_patterns")
    private List<String> relatedPatterns;

    @JsonProperty("context_extraction")
    private ContextExtraction contextExtraction;

    /**
     * Gets the unique identifier for this pattern.
     *
     * @return the pattern ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier for this pattern.
     *
     * @param id the pattern ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the human-readable name of this pattern.
     *
     * @return the pattern name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the human-readable name of this pattern.
     *
     * @param name the pattern name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the primary pattern that must be matched.
     *
     * @return the primary pattern
     */
    public PrimaryPattern getPrimaryPattern() {
        return primaryPattern;
    }

    /**
     * Sets the primary pattern that must be matched.
     *
     * @param primaryPattern the primary pattern
     */
    public void setPrimaryPattern(PrimaryPattern primaryPattern) {
        this.primaryPattern = primaryPattern;
    }

    /**
     * Gets the optional secondary patterns that can provide additional context.
     *
     * @return the list of secondary patterns
     */
    public List<SecondaryPattern> getSecondaryPatterns() {
        return secondaryPatterns;
    }

    /**
     * Sets the optional secondary patterns that can provide additional context.
     *
     * @param secondaryPatterns the list of secondary patterns
     */
    public void setSecondaryPatterns(List<SecondaryPattern> secondaryPatterns) {
        this.secondaryPatterns = secondaryPatterns;
    }

    /**
     * Gets the sequence patterns for multi-event matching.
     *
     * @return the list of sequence patterns
     */
    public List<SequencePattern> getSequencePatterns() {
        return sequencePatterns;
    }

    /**
     * Sets the sequence patterns for multi-event matching.
     *
     * @param sequencePatterns the list of sequence patterns
     */
    public void setSequencePatterns(List<SequencePattern> sequencePatterns) {
        this.sequencePatterns = sequencePatterns;
    }

    /**
     * Gets the severity level of this failure pattern.
     *
     * @return the severity level (e.g., "CRITICAL", "ERROR", "WARNING")
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the severity level of this failure pattern.
     *
     * @param severity the severity level
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * Gets the categories this pattern belongs to.
     *
     * @return the list of category names
     */
    public List<String> getCategory() {
        return category;
    }

    /**
     * Sets the categories this pattern belongs to.
     *
     * @param category the list of category names
     */
    public void setCategory(List<String> category) {
        this.category = category;
    }

    /**
     * Gets the remediation information for this pattern.
     *
     * @return the remediation details
     */
    public Remediation getRemediation() {
        return remediation;
    }

    /**
     * Sets the remediation information for this pattern.
     *
     * @param remediation the remediation details
     */
    public void setRemediation(Remediation remediation) {
        this.remediation = remediation;
    }

    /**
     * Gets the list of related pattern IDs.
     *
     * @return the list of related pattern IDs
     */
    public List<String> getRelatedPatterns() {
        return relatedPatterns;
    }

    /**
     * Sets the list of related pattern IDs.
     *
     * @param relatedPatterns the list of related pattern IDs
     */
    public void setRelatedPatterns(List<String> relatedPatterns) {
        this.relatedPatterns = relatedPatterns;
    }

    /**
     * Gets the context extraction configuration for this pattern.
     *
     * @return the context extraction settings
     */
    public ContextExtraction getContextExtraction() {
        return contextExtraction;
    }

    /**
     * Sets the context extraction configuration for this pattern.
     *
     * @param contextExtraction the context extraction settings
     */
    public void setContextExtraction(ContextExtraction contextExtraction) {
        this.contextExtraction = contextExtraction;
    }
}
