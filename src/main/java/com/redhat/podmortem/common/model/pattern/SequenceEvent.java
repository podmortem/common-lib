package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.regex.Pattern;

@RegisterForReflection
public class SequenceEvent {
    private String regex;

    @JsonProperty("max_time_before")
    private String maxTimeBefore; // e.g., "30s"

    @JsonIgnore private Pattern compiledRegex;

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
        if (regex != null && !regex.isEmpty()) {
            this.compiledRegex = Pattern.compile(regex);
        }
    }

    public String getMaxTimeBefore() {
        return maxTimeBefore;
    }

    public void setMaxTimeBefore(String maxTimeBefore) {
        this.maxTimeBefore = maxTimeBefore;
    }

    public Pattern getCompiledRegex() {
        return compiledRegex;
    }

    public void setCompiledRegex(Pattern compiledRegex) {
        this.compiledRegex = compiledRegex;
    }
}
