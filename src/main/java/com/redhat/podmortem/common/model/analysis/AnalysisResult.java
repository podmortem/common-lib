package com.redhat.podmortem.common.model.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class AnalysisResult {
    @JsonProperty("analysis_id")
    private String analysisId;

    private AnalysisMetadata metadata;
    private AnalysisSummary summary;
    private List<MatchedEvent> events;

    public String getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    public AnalysisMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(AnalysisMetadata metadata) {
        this.metadata = metadata;
    }

    public AnalysisSummary getSummary() {
        return summary;
    }

    public void setSummary(AnalysisSummary summary) {
        this.summary = summary;
    }

    public List<MatchedEvent> getEvents() {
        return events;
    }

    public void setEvents(List<MatchedEvent> events) {
        this.events = events;
    }
}
