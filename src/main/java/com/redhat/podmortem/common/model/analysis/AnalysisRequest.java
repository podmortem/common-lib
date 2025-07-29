package com.redhat.podmortem.common.model.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.redhat.podmortem.common.model.provider.AIProviderConfig;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Request model for AI analysis containing log analysis results and AI provider configuration.
 *
 * <p>Combines the structured analysis output from the log-parser component with the AI provider
 * configuration needed to generate explanations. Sent by the operator to the AI interface.
 */
@RegisterForReflection
public class AnalysisRequest {

    @JsonProperty("analysis_result")
    private AnalysisResult analysisResult;

    @JsonProperty("provider_config")
    private AIProviderConfig providerConfig;

    public AnalysisRequest() {}

    /**
     * Creates an analysis request with the provided components.
     *
     * @param analysisResult the log analysis results
     * @param providerConfig the AI provider configuration
     */
    public AnalysisRequest(AnalysisResult analysisResult, AIProviderConfig providerConfig) {
        this.analysisResult = analysisResult;
        this.providerConfig = providerConfig;
    }

    /**
     * Gets the log analysis results to be explained.
     *
     * @return the analysis result
     */
    public AnalysisResult getAnalysisResult() {
        return analysisResult;
    }

    /**
     * Sets the log analysis results to be explained.
     *
     * @param analysisResult the analysis result
     */
    public void setAnalysisResult(AnalysisResult analysisResult) {
        this.analysisResult = analysisResult;
    }

    /**
     * Gets the AI provider configuration for generating explanations.
     *
     * @return the provider configuration
     */
    public AIProviderConfig getProviderConfig() {
        return providerConfig;
    }

    /**
     * Sets the AI provider configuration for generating explanations.
     *
     * @param providerConfig the provider configuration
     */
    public void setProviderConfig(AIProviderConfig providerConfig) {
        this.providerConfig = providerConfig;
    }
}
