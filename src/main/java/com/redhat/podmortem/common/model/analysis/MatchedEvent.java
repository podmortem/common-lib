package com.redhat.podmortem.common.model.analysis;

import com.redhat.podmortem.common.model.pattern.Pattern;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MatchedEvent {
    private double score;
    private int lineNumber;
    private String logLine;
    private Pattern matchedPattern;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getLogLine() {
        return logLine;
    }

    public void setLogLine(String logLine) {
        this.logLine = logLine;
    }

    public Pattern getMatchedPattern() {
        return matchedPattern;
    }

    public void setMatchedPattern(Pattern matchedPattern) {
        this.matchedPattern = matchedPattern;
    }
}
