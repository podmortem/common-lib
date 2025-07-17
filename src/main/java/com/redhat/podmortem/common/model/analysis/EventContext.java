package com.redhat.podmortem.common.model.analysis;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

@RegisterForReflection
public class EventContext {

    private List<String> linesBefore;
    private String matchedLine;
    private List<String> linesAfter;

    public List<String> getLinesBefore() {
        return linesBefore;
    }

    public void setLinesBefore(List<String> linesBefore) {
        this.linesBefore = linesBefore;
    }

    public String getMatchedLine() {
        return matchedLine;
    }

    public void setMatchedLine(String matchedLine) {
        this.matchedLine = matchedLine;
    }

    public List<String> getLinesAfter() {
        return linesAfter;
    }

    public void setLinesAfter(List<String> linesAfter) {
        this.linesAfter = linesAfter;
    }
}
