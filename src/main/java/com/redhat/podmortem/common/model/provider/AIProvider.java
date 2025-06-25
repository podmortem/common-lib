package com.redhat.podmortem.common.model.provider;

import com.redhat.podmortem.common.model.analysis.AnalysisResult;
import io.smallrye.mutiny.Uni;

/**
 * The core interface defining the contract for any AI provider implementation. It lives in the
 * common library so both the provider implementations and the consuming services can use it.
 */
public interface AIProvider {

    /**
     * Generates an explanation for a pod failure based on structured log analysis.
     *
     * @param result The analysis result from the log-parser component.
     * @param config The configuration for this specific provider.
     * @return A Uni that will resolve to the AI-generated response.
     */
    Uni<AIResponse> generateExplanation(AnalysisResult result, AIProviderConfig config);

    /**
     * Validates the provider's configuration and connectivity.
     *
     * @param config The configuration to validate.
     * @return A Uni that will resolve to the validation result.
     */
    Uni<ValidationResult> validateConfiguration(AIProviderConfig config);

    /**
     * Gets the capabilities of the AI provider, such as supported models and rate limits.
     *
     * @return The provider's capabilities.
     */
    ProviderCapabilities getCapabilities();

    /**
     * Returns the unique identifier for the provider (e.g., "openshift-ai", "watsonx").
     *
     * @return The provider ID.
     */
    String getProviderId();
}
