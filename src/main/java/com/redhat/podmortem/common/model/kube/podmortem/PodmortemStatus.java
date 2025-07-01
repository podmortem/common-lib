package com.redhat.podmortem.common.model.kube.podmortem;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.time.Instant;
import java.util.List;

@RegisterForReflection
public class PodmortemStatus {

    private String phase;
    private String message;
    private Instant lastUpdate;
    private Long observedGeneration;
    private List<PodFailureStatus> recentFailures;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Instant getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Instant lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    public List<PodFailureStatus> getRecentFailures() {
        return recentFailures;
    }

    public void setRecentFailures(List<PodFailureStatus> recentFailures) {
        this.recentFailures = recentFailures;
    }

    public static class PodFailureStatus {
        private String podName;
        private String podNamespace;
        private Instant failureTime;
        private String analysisStatus;
        private String explanation;

        public String getPodName() {
            return podName;
        }

        public void setPodName(String podName) {
            this.podName = podName;
        }

        public String getPodNamespace() {
            return podNamespace;
        }

        public void setPodNamespace(String podNamespace) {
            this.podNamespace = podNamespace;
        }

        public Instant getFailureTime() {
            return failureTime;
        }

        public void setFailureTime(Instant failureTime) {
            this.failureTime = failureTime;
        }

        public String getAnalysisStatus() {
            return analysisStatus;
        }

        public void setAnalysisStatus(String analysisStatus) {
            this.analysisStatus = analysisStatus;
        }

        public String getExplanation() {
            return explanation;
        }

        public void setExplanation(String explanation) {
            this.explanation = explanation;
        }
    }
}
