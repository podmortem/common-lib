package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Secondary pattern that provides additional context and confidence to pattern matching.
 *
 * <p>Secondary patterns are optional and are used to boost confidence when found within a specified
 * proximity window of the primary pattern match.
 */
@RegisterForReflection
public class SecondaryPattern {
    private String regex;
    private double weight;

    @JsonProperty("proximity_window")
    private int proximityWindow;

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
     * Gets the weight multiplier for this secondary pattern.
     *
     * @return the weight multiplier applied to confidence scores
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight multiplier for this secondary pattern.
     *
     * @param weight the weight multiplier applied to confidence scores
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Gets the proximity window in lines for this secondary pattern.
     *
     * @return the number of lines before/after primary match to search
     */
    public int getProximityWindow() {
        return proximityWindow;
    }

    /**
     * Sets the proximity window in lines for this secondary pattern.
     *
     * @param proximityWindow the number of lines before/after primary match to search
     */
    public void setProximityWindow(int proximityWindow) {
        this.proximityWindow = proximityWindow;
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
