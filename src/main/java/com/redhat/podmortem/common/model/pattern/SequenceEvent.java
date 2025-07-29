package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.regex.Pattern;

/**
 * Individual event within a sequence pattern.
 *
 * <p>Represents a single event in a temporal sequence, with timing constraints for when it must
 * occur relative to other events in the sequence.
 */
@RegisterForReflection
public class SequenceEvent {
    private String regex;

    @JsonProperty("max_time_before")
    private String maxTimeBefore; // e.g., "30s"

    @JsonIgnore private Pattern compiledRegex;

    /**
     * Gets the regular expression pattern for this sequence event.
     *
     * @return the regex pattern string
     */
    public String getRegex() {
        return regex;
    }

    /**
     * Sets the regular expression pattern for this sequence event.
     *
     * <p>Automatically compiles the regex for efficient matching.
     *
     * @param regex the regex pattern string
     */
    public void setRegex(String regex) {
        this.regex = regex;
        if (regex != null && !regex.isEmpty()) {
            this.compiledRegex = Pattern.compile(regex);
        }
    }

    /**
     * Gets the maximum time this event can occur before the next event.
     *
     * @return the time duration string (e.g., "30s", "5m")
     */
    public String getMaxTimeBefore() {
        return maxTimeBefore;
    }

    /**
     * Sets the maximum time this event can occur before the next event.
     *
     * @param maxTimeBefore the time duration string
     */
    public void setMaxTimeBefore(String maxTimeBefore) {
        this.maxTimeBefore = maxTimeBefore;
    }

    /**
     * Gets the compiled regex pattern for efficient matching.
     *
     * @return the compiled Pattern object
     */
    public Pattern getCompiledRegex() {
        return compiledRegex;
    }

    /**
     * Sets the compiled regex pattern for efficient matching.
     *
     * @param compiledRegex the compiled Pattern object
     */
    public void setCompiledRegex(Pattern compiledRegex) {
        this.compiledRegex = compiledRegex;
    }
}
