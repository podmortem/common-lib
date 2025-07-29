package com.redhat.podmortem.common.model.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.Map;

/**
 * Summary statistics and key findings from log analysis.
 *
 * <p>Provides high-level metrics about the analysis results including event counts, severity
 * information, and distribution statistics that help prioritize findings.
 */
@RegisterForReflection
public class AnalysisSummary {
    @JsonProperty("significant_events")
    private int significantEvents;

    @JsonProperty("highest_severity")
    private String highestSeverity;

    @JsonProperty("severity_distribution")
    private Map<String, Long> severityDistribution;

    /**
     * Gets the count of significant events found during analysis.
     *
     * @return the number of significant events
     */
    public int getSignificantEvents() {
        return significantEvents;
    }

    /**
     * Sets the count of significant events found during analysis.
     *
     * @param significantEvents the number of significant events
     */
    public void setSignificantEvents(int significantEvents) {
        this.significantEvents = significantEvents;
    }

    /**
     * Gets the highest severity level found in the analysis.
     *
     * @return the highest severity level (e.g., "CRITICAL", "ERROR", "WARNING")
     */
    public String getHighestSeverity() {
        return highestSeverity;
    }

    /**
     * Sets the highest severity level found in the analysis.
     *
     * @param highestSeverity the highest severity level
     */
    public void setHighestSeverity(String highestSeverity) {
        this.highestSeverity = highestSeverity;
    }

    /**
     * Gets the distribution of events by severity level.
     *
     * @return a map of severity level to event count
     */
    public Map<String, Long> getSeverityDistribution() {
        return severityDistribution;
    }

    /**
     * Sets the distribution of events by severity level.
     *
     * @param severityDistribution a map of severity level to event count
     */
    public void setSeverityDistribution(Map<String, Long> severityDistribution) {
        this.severityDistribution = severityDistribution;
    }
}
