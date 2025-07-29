package com.redhat.podmortem.common.model.provider;

import com.redhat.podmortem.common.model.analysis.AnalysisResult;
import io.quarkus.runtime.annotations.RegisterForReflection;
import io.smallrye.mutiny.Uni;

/** Core interface for AI provider implementations that generate explanations for pod failures. */
@RegisterForReflection
public interface AIProvider {

    /**
     * Generates an explanation for a pod failure based on structured log analysis.
     *
     * @param result the analysis result from the log-parser component
     * @param config the configuration for this specific provider
     * @return a Uni that will resolve to the AI-generated response
     */
    Uni<AIResponse> generateExplanation(AnalysisResult result, AIProviderConfig config);

    /**
     * Validates the provider's configuration and connectivity.
     *
     * @param config the configuration to validate
     * @return a Uni that will resolve to the validation result
     */
    Uni<ValidationResult> validateConfiguration(AIProviderConfig config);

    /**
     * Returns the unique identifier for the provider.
     *
     * @return the provider ID (e.g., "openai", "ollama")
     */
    String getProviderId();
}
