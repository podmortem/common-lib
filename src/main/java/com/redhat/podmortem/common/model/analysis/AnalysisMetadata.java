package com.redhat.podmortem.common.model.analysis;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class AnalysisMetadata {
    private int totalLines;
    private int significantEvents;
    private long processingTimeMs;

    public int getTotalLines() {
        return totalLines;
    }

    public void setTotalLines(int totalLines) {
        this.totalLines = totalLines;
    }

    public int getSignificantEvents() {
        return significantEvents;
    }

    public void setSignificantEvents(int significantEvents) {
        this.significantEvents = significantEvents;
    }

    public long getProcessingTimeMs() {
        return processingTimeMs;
    }

    public void setProcessingTimeMs(long processingTimeMs) {
        this.processingTimeMs = processingTimeMs;
    }
}
