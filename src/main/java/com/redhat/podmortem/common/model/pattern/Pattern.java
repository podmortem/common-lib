package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.List;

@RegisterForReflection
public class Pattern {
    private String id;
    private String name;
    @JsonProperty("primary_pattern")
    private PrimaryPattern primaryPattern;
    @JsonProperty("secondary_patterns")
    private List<SecondaryPattern> secondaryPatterns;
    private String severity;
    private List<String> category;
    private Remediation remediation;
    @JsonProperty("related_patterns")
    private List<String> relatedPatterns;
    @JsonProperty("context_extraction")
    private ContextExtraction contextExtraction;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public PrimaryPattern getPrimaryPattern() { return primaryPattern; }
    public void setPrimaryPattern(PrimaryPattern primaryPattern) { this.primaryPattern = primaryPattern; }
    public List<SecondaryPattern> getSecondaryPatterns() { return secondaryPatterns; }
    public void setSecondaryPatterns(List<SecondaryPattern> secondaryPatterns) { this.secondaryPatterns = secondaryPatterns; }
    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }
    public List<String> getCategory() { return category; }
    public void setCategory(List<String> category) { this.category = category; }
    public Remediation getRemediation() { return remediation; }
    public void setRemediation(Remediation remediation) { this.remediation = remediation; }
    public List<String> getRelatedPatterns() { return relatedPatterns; }
    public void setRelatedPatterns(List<String> relatedPatterns) { this.relatedPatterns = relatedPatterns; }
    public ContextExtraction getContextExtraction() { return contextExtraction; }
    public void setContextExtraction(ContextExtraction contextExtraction) { this.contextExtraction = contextExtraction; }
}