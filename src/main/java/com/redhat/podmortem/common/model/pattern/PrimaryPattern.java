package com.redhat.podmortem.common.model.pattern;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PrimaryPattern {
    private String regex;
    private double confidence;
    
    public String getRegex() { return regex; }
    public void setRegex(String regex) { this.regex = regex; }
    public double getConfidence() { return confidence; }
    public void setConfidence(double confidence) { this.confidence = confidence; }
}