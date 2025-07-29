package com.redhat.podmortem.common.model.kube.podmortem;

import com.redhat.podmortem.common.model.kube.aiprovider.AIProviderRef;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Specification for Podmortem Custom Resource.
 *
 * <p>Defines which pods to monitor for failures, which AI provider to use for analysis, and
 * configuration for automated failure investigation.
 */
@RegisterForReflection
public class PodmortemSpec {

    private LabelSelector podSelector;
    private AIProviderRef aiProviderRef;
    private Boolean aiAnalysisEnabled = true;

    /**
     * Gets the label selector for pods to monitor for failures.
     *
     * @return the Kubernetes label selector
     */
    public LabelSelector getPodSelector() {
        return podSelector;
    }

    /**
     * Sets the label selector for pods to monitor for failures.
     *
     * <p>Only pods matching this selector will be monitored and analyzed when they fail or
     * terminate unexpectedly.
     *
     * @param podSelector the Kubernetes label selector
     */
    public void setPodSelector(LabelSelector podSelector) {
        this.podSelector = podSelector;
    }

    /**
     * Gets the reference to the AI provider for generating failure explanations.
     *
     * @return the AI provider reference
     */
    public AIProviderRef getAiProviderRef() {
        return aiProviderRef;
    }

    /**
     * Sets the reference to the AI provider for generating failure explanations.
     *
     * @param aiProviderRef the AI provider reference
     */
    public void setAiProviderRef(AIProviderRef aiProviderRef) {
        this.aiProviderRef = aiProviderRef;
    }

    /**
     * Gets whether AI analysis is enabled for pod failures.
     *
     * @return true if AI analysis is enabled (default: true), false otherwise
     */
    public Boolean getAiAnalysisEnabled() {
        return aiAnalysisEnabled;
    }

    /**
     * Sets whether AI analysis is enabled for pod failures.
     *
     * <p>When disabled, only basic log analysis will be performed without AI-generated explanations
     * and recommendations.
     *
     * @param aiAnalysisEnabled true to enable AI analysis, false to disable
     */
    public void setAiAnalysisEnabled(Boolean aiAnalysisEnabled) {
        this.aiAnalysisEnabled = aiAnalysisEnabled;
    }
}
