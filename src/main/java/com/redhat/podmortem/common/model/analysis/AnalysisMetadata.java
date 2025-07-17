package com.redhat.podmortem.common.model.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

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

    public String getAnalyzedAt() {
        return analyzedAt;
    }

    public void setAnalyzedAt(String analyzedAt) {
        this.analyzedAt = analyzedAt;
    }

    public int getTotalLines() {
        return totalLines;
    }

    public void setTotalLines(int totalLines) {
        this.totalLines = totalLines;
    }

    public long getProcessingTimeMs() {
        return processingTimeMs;
    }

    public void setProcessingTimeMs(long processingTimeMs) {
        this.processingTimeMs = processingTimeMs;
    }

    public List<String> getPatternsUsed() {
        return patternsUsed;
    }

    public void setPatternsUsed(List<String> patternsUsed) {
        this.patternsUsed = patternsUsed;
    }
}
