package com.redhat.podmortem.common.model.kube.patternlibrary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Credentials for accessing private Git repositories.
 *
 * <p>References a Kubernetes Secret containing authentication information for secure access to
 * pattern library repositories.
 */
@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Credentials {

    private String secretRef;

    /**
     * Gets the reference to the Kubernetes Secret containing Git credentials.
     *
     * @return the secret reference name
     */
    public String getSecretRef() {
        return secretRef;
    }

    /**
     * Sets the reference to the Kubernetes Secret containing Git credentials.
     *
     * <p>The secret should contain standard Git authentication data like username, password, or SSH
     * keys depending on the repository access method.
     *
     * @param secretRef the secret reference name
     */
    public void setSecretRef(String secretRef) {
        this.secretRef = secretRef;
    }
}
