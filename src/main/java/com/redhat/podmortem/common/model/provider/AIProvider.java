package com.redhat.podmortem.common.model.provider;

import com.redhat.podmortem.common.model.analysis.AnalysisResult;
import io.quarkus.runtime.annotations.RegisterForReflection;
import io.smallrye.mutiny.Uni;

/** A simplified core interface for any AI provider implementation. */
@RegisterForReflection
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
     * Returns the unique identifier for the provider (e.g., "openshift-ai", "watsonx").
     *
     * @return The provider ID.
     */
    String getProviderId();
}
