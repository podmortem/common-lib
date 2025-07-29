package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

/**
 * Configuration for extracting context around matched patterns.
 *
 * <p>Defines how much surrounding context to include when a pattern matches, including line counts,
 * stack trace inclusion, and keyword highlighting.
 */
@RegisterForReflection
public class ContextExtraction {
    @JsonProperty("lines_before")
    private int linesBefore;

    @JsonProperty("lines_after")
    private int linesAfter;

    @JsonProperty("include_stack_trace")
    private boolean includeStackTrace;

    @JsonProperty("highlight_keywords")
    private List<String> highlightKeywords;

    /**
     * Gets the number of lines to include before the matched line.
     *
     * @return the number of preceding lines to extract
     */
    public int getLinesBefore() {
        return linesBefore;
    }

    /**
     * Sets the number of lines to include before the matched line.
     *
     * @param linesBefore the number of preceding lines to extract
     */
    public void setLinesBefore(int linesBefore) {
        this.linesBefore = linesBefore;
    }

    /**
     * Gets the number of lines to include after the matched line.
     *
     * @return the number of following lines to extract
     */
    public int getLinesAfter() {
        return linesAfter;
    }

    /**
     * Sets the number of lines to include after the matched line.
     *
     * @param linesAfter the number of following lines to extract
     */
    public void setLinesAfter(int linesAfter) {
        this.linesAfter = linesAfter;
    }

    /**
     * Gets whether to include stack traces in the extracted context.
     *
     * @return true if stack traces should be included, false otherwise
     */
    public boolean isIncludeStackTrace() {
        return includeStackTrace;
    }

    /**
     * Sets whether to include stack traces in the extracted context.
     *
     * @param includeStackTrace true to include stack traces, false otherwise
     */
    public void setIncludeStackTrace(boolean includeStackTrace) {
        this.includeStackTrace = includeStackTrace;
    }

    /**
     * Gets the list of keywords to highlight in the extracted context.
     *
     * @return the list of keywords to highlight
     */
    public List<String> getHighlightKeywords() {
        return highlightKeywords;
    }

    /**
     * Sets the list of keywords to highlight in the extracted context.
     *
     * @param highlightKeywords the list of keywords to highlight
     */
    public void setHighlightKeywords(List<String> highlightKeywords) {
        this.highlightKeywords = highlightKeywords;
    }
}
