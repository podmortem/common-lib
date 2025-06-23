package com.redhat.podmortem.common.model.analysis;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

@RegisterForReflection
public class AnalysisResult {
    private AnalysisMetadata metadata;
    private List<MatchedEvent> events;

    public AnalysisMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(AnalysisMetadata metadata) {
        this.metadata = metadata;
    }

    public List<MatchedEvent> getEvents() {
        return events;
    }

    public void setEvents(List<MatchedEvent> events) {
        this.events = events;
    }
}
