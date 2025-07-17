package com.redhat.podmortem.common.model.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.Map;

@RegisterForReflection
public class AnalysisSummary {
    @JsonProperty("significant_events")
    private int significantEvents;

    @JsonProperty("highest_severity")
    private String highestSeverity;

    @JsonProperty("severity_distribution")
    private Map<String, Long> severityDistribution;

    public int getSignificantEvents() {
        return significantEvents;
    }

    public void setSignificantEvents(int significantEvents) {
        this.significantEvents = significantEvents;
    }

    public String getHighestSeverity() {
        return highestSeverity;
    }

    public void setHighestSeverity(String highestSeverity) {
        this.highestSeverity = highestSeverity;
    }

    public Map<String, Long> getSeverityDistribution() {
        return severityDistribution;
    }

    public void setSeverityDistribution(Map<String, Long> severityDistribution) {
        this.severityDistribution = severityDistribution;
    }
}
