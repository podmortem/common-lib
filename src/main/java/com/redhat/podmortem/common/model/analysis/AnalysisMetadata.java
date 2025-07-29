package com.redhat.podmortem.common.model.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

/**
 * Metadata about the log analysis process and performance metrics.
 *
 * <p>Contains information about when the analysis was performed, how much data was processed,
 * performance statistics, and which patterns were used during analysis.
 */
@RegisterForReflection
public class AnalysisMetadata {
    @JsonProperty("analyzed_at")
    private String analyzedAt;

    @JsonProperty("total_lines")
    private int totalLines;

    @JsonProperty("processing_time_ms")
    private long processingTimeMs;

    @JsonProperty("patterns_used")
    private List<String> patternsUsed;

    /**
     * Gets the timestamp when this analysis was performed.
     *
     * @return the analysis timestamp
     */
    public String getAnalyzedAt() {
        return analyzedAt;
    }

    /**
     * Sets the timestamp when this analysis was performed.
     *
     * @param analyzedAt the analysis timestamp
     */
    public void setAnalyzedAt(String analyzedAt) {
        this.analyzedAt = analyzedAt;
    }

    /**
     * Gets the total number of log lines that were analyzed.
     *
     * @return the total line count
     */
    public int getTotalLines() {
        return totalLines;
    }

    /**
     * Sets the total number of log lines that were analyzed.
     *
     * @param totalLines the total line count
     */
    public void setTotalLines(int totalLines) {
        this.totalLines = totalLines;
    }

    /**
     * Gets the time taken to complete the analysis.
     *
     * @return the processing time in milliseconds
     */
    public long getProcessingTimeMs() {
        return processingTimeMs;
    }

    /**
     * Sets the time taken to complete the analysis.
     *
     * @param processingTimeMs the processing time in milliseconds
     */
    public void setProcessingTimeMs(long processingTimeMs) {
        this.processingTimeMs = processingTimeMs;
    }

    /**
     * Gets the list of pattern identifiers used during analysis.
     *
     * @return the list of pattern IDs
     */
    public List<String> getPatternsUsed() {
        return patternsUsed;
    }

    /**
     * Sets the list of pattern identifiers used during analysis.
     *
     * @param patternsUsed the list of pattern IDs
     */
    public void setPatternsUsed(List<String> patternsUsed) {
        this.patternsUsed = patternsUsed;
    }
}
