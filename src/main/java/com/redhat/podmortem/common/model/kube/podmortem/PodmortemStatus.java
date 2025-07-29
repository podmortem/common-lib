package com.redhat.podmortem.common.model.kube.podmortem;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.time.Instant;
import java.util.List;

/** Status information for Podmortem Custom Resource. */
@RegisterForReflection
public class PodmortemStatus {

    private String phase;
    private String message;
    private Instant lastUpdate;
    private Long observedGeneration;
    private List<PodFailureStatus> recentFailures;

    /**
     * Gets the current operational phase of the pod monitoring.
     *
     * @return the current phase (e.g., "Active", "Inactive", "Error")
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the current operational phase of the pod monitoring.
     *
     * @param phase the current phase
     */
    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Gets the human-readable status message.
     *
     * @return the status message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the human-readable status message.
     *
     * @param message the status message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the timestamp of the last status update.
     *
     * @return the last update timestamp
     */
    public Instant getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the timestamp of the last status update.
     *
     * @param lastUpdate the last update timestamp
     */
    public void setLastUpdate(Instant lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * Gets the observed generation of the podmortem spec.
     *
     * @return the observed generation number
     */
    public Long getObservedGeneration() {
        return observedGeneration;
    }

    /**
     * Sets the observed generation of the podmortem spec.
     *
     * @param observedGeneration the observed generation number
     */
    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    /**
     * Gets the list of recent pod failure analysis results.
     *
     * @return the list of recent failure statuses
     */
    public List<PodFailureStatus> getRecentFailures() {
        return recentFailures;
    }

    /**
     * Sets the list of recent pod failure analysis results.
     *
     * @param recentFailures the list of recent failure statuses
     */
    public void setRecentFailures(List<PodFailureStatus> recentFailures) {
        this.recentFailures = recentFailures;
    }

    /**
     * Status information for a single pod failure analysis.
     *
     * <p>Contains details about the failed pod, analysis results, and generated explanations.
     */
    public static class PodFailureStatus {
        private String podName;
        private String podNamespace;
        private Instant failureTime;
        private String analysisStatus;
        private String explanation;

        /**
         * Gets the name of the failed pod.
         *
         * @return the pod name
         */
        public String getPodName() {
            return podName;
        }

        /**
         * Sets the name of the failed pod.
         *
         * @param podName the pod name
         */
        public void setPodName(String podName) {
            this.podName = podName;
        }

        /**
         * Gets the namespace of the failed pod.
         *
         * @return the pod namespace
         */
        public String getPodNamespace() {
            return podNamespace;
        }

        /**
         * Sets the namespace of the failed pod.
         *
         * @param podNamespace the pod namespace
         */
        public void setPodNamespace(String podNamespace) {
            this.podNamespace = podNamespace;
        }

        /**
         * Gets the timestamp when the pod failure occurred.
         *
         * @return the failure timestamp
         */
        public Instant getFailureTime() {
            return failureTime;
        }

        /**
         * Sets the timestamp when the pod failure occurred.
         *
         * @param failureTime the failure timestamp
         */
        public void setFailureTime(Instant failureTime) {
            this.failureTime = failureTime;
        }

        /**
         * Gets the status of the failure analysis process.
         *
         * @return the analysis status (e.g., "Completed", "Failed", "InProgress")
         */
        public String getAnalysisStatus() {
            return analysisStatus;
        }

        /**
         * Sets the status of the failure analysis process.
         *
         * @param analysisStatus the analysis status
         */
        public void setAnalysisStatus(String analysisStatus) {
            this.analysisStatus = analysisStatus;
        }

        /**
         * Gets the AI-generated explanation for the pod failure.
         *
         * @return the failure explanation
         */
        public String getExplanation() {
            return explanation;
        }

        /**
         * Sets the AI-generated explanation for the pod failure.
         *
         * @param explanation the failure explanation
         */
        public void setExplanation(String explanation) {
            this.explanation = explanation;
        }
    }
}
