package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Primary pattern that must be matched for a failure pattern to trigger.
 *
 * <p>Contains the main regex pattern and confidence threshold. This is the core pattern that
 * identifies the failure scenario in log files.
 */
@RegisterForReflection
public class PrimaryPattern {
    private String regex;
    private double confidence;

    @JsonIgnore private java.util.regex.Pattern compiledRegex;

    /**
     * Gets the regular expression pattern string.
     *
     * @return the regex pattern
     */
    public String getRegex() {
        return regex;
    }

    /**
     * Sets the regular expression pattern string.
     *
     * @param regex the regex pattern
     */
    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * Gets the base confidence score for matches of this pattern.
     *
     * @return the confidence score (0.0 to 1.0)
     */
    public double getConfidence() {
        return confidence;
    }

    /**
     * Sets the base confidence score for matches of this pattern.
     *
     * @param confidence the confidence score (0.0 to 1.0)
     */
    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    /**
     * Gets the compiled regex pattern for efficient matching.
     *
     * @return the compiled Pattern object
     */
    @JsonIgnore
    public java.util.regex.Pattern getCompiledRegex() {
        return compiledRegex;
    }

    /**
     * Sets the compiled regex pattern for efficient matching.
     *
     * @param compiledRegex the compiled Pattern object
     */
    @JsonIgnore
    public void setCompiledRegex(java.util.regex.Pattern compiledRegex) {
        this.compiledRegex = compiledRegex;
    }
}
