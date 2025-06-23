package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.List;

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

    public int getLinesBefore() { return linesBefore; }
    public void setLinesBefore(int linesBefore) { this.linesBefore = linesBefore; }
    public int getLinesAfter() { return linesAfter; }
    public void setLinesAfter(int linesAfter) { this.linesAfter = linesAfter; }
    public boolean isIncludeStackTrace() { return includeStackTrace; }
    public void setIncludeStackTrace(boolean includeStackTrace) { this.includeStackTrace = includeStackTrace; }
    public List<String> getHighlightKeywords() { return highlightKeywords; }
    public void setHighlightKeywords(List<String> highlightKeywords) { this.highlightKeywords = highlightKeywords; }
}