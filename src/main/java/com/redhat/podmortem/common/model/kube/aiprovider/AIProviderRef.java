package com.redhat.podmortem.common.model.kube.aiprovider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;

/** Reference to an AI Provider Custom Resource. */
@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AIProviderRef {

    private String name;
    private String namespace;

    public AIProviderRef() {}

    /**
     * Creates an AI provider reference with name and namespace.
     *
     * @param name the name of the AI provider resource
     * @param namespace the namespace of the AI provider resource
     */
    public AIProviderRef(String name, String namespace) {
        this.name = name;
        this.namespace = namespace;
    }

    /**
     * Gets the name of the referenced AI provider.
     *
     * @return the AI provider name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the referenced AI provider.
     *
     * @param name the AI provider name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the namespace of the referenced AI provider.
     *
     * @return the AI provider namespace
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the namespace of the referenced AI provider.
     *
     * @param namespace the AI provider namespace
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
