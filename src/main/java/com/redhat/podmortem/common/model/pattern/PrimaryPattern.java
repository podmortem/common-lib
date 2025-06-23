package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PrimaryPattern {
    private String regex;
    private double confidence;

    @JsonIgnore private java.util.regex.Pattern compiledRegex;

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    @JsonIgnore
    public java.util.regex.Pattern getCompiledRegex() {
        return compiledRegex;
    }

    @JsonIgnore
    public void setCompiledRegex(java.util.regex.Pattern compiledRegex) {
        this.compiledRegex = compiledRegex;
    }
}
