package com.redhat.podmortem.common.model.analysis;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.redhat.podmortem.common.model.provider.AIProviderConfig;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Request model for AI analysis containing both the log analysis results and the AI provider
 * configuration sent by the operator.
 */
@RegisterForReflection
public class AnalysisRequest {

    @JsonProperty("analysis_result")
    private AnalysisResult analysisResult;

    @JsonProperty("provider_config")
    private AIProviderConfig providerConfig;

    public AnalysisRequest() {}

    public AnalysisRequest(AnalysisResult analysisResult, AIProviderConfig providerConfig) {
        this.analysisResult = analysisResult;
        this.providerConfig = providerConfig;
    }

    public AnalysisResult getAnalysisResult() {
        return analysisResult;
    }

    public void setAnalysisResult(AnalysisResult analysisResult) {
        this.analysisResult = analysisResult;
    }

    public AIProviderConfig getProviderConfig() {
        return providerConfig;
    }

    public void setProviderConfig(AIProviderConfig providerConfig) {
        this.providerConfig = providerConfig;
    }
}
