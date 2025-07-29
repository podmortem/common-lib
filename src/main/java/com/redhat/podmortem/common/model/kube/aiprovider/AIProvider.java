package com.redhat.podmortem.common.model.kube.aiprovider;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Kind;
import io.fabric8.kubernetes.model.annotation.Version;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Kubernetes CRD for AI Provider configuration.
 *
 * <p>Represents an AI provider that can be configured and managed through Kubernetes. Defines the
 * API endpoint, authentication, and model configuration for services like OpenAI, Ollama, or other
 * AI providers used for pod failure explanation.
 */
@Group("podmortem.redhat.com")
@Version("v1alpha1")
@Kind("AIProvider")
@RegisterForReflection
public class AIProvider extends CustomResource<AIProviderSpec, AIProviderStatus>
        implements Namespaced {}
