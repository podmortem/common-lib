package com.redhat.podmortem.common.model.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

/**
 * Result of log pattern analysis performed by the log-parser component.
 *
 * <p>Contains comprehensive analysis information including metadata, summary statistics, and
 * detailed matched events that can be used for AI explanation generation.
 */
@RegisterForReflection
public class AnalysisResult {
    @JsonProperty("analysis_id")
    private String analysisId;

    private AnalysisMetadata metadata;
    private AnalysisSummary summary;
    private List<MatchedEvent> events;

    /**
     * Gets the unique identifier for this analysis run.
     *
     * @return the analysis ID
     */
    public String getAnalysisId() {
        return analysisId;
    }

    /**
     * Sets the unique identifier for this analysis run.
     *
     * @param analysisId the analysis ID
     */
    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    /**
     * Gets metadata about the analysis process.
     *
     * @return the analysis metadata
     */
    public AnalysisMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets metadata about the analysis process.
     *
     * @param metadata the analysis metadata
     */
    public void setMetadata(AnalysisMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Gets the summary statistics of the analysis.
     *
     * @return the analysis summary
     */
    public AnalysisSummary getSummary() {
        return summary;
    }

    /**
     * Sets the summary statistics of the analysis.
     *
     * @param summary the analysis summary
     */
    public void setSummary(AnalysisSummary summary) {
        this.summary = summary;
    }

    /**
     * Gets the list of events that matched known failure patterns.
     *
     * @return the list of matched events
     */
    public List<MatchedEvent> getEvents() {
        return events;
    }

    /**
     * Sets the list of events that matched known failure patterns.
     *
     * @param events the list of matched events
     */
    public void setEvents(List<MatchedEvent> events) {
        this.events = events;
    }
}
