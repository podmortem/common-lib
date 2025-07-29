package com.redhat.podmortem.common.model.kube.aiprovider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Reference to authentication credentials stored in a Kubernetes Secret.
 *
 * <p>Provides secure access to authentication information for AI providers without exposing
 * sensitive data directly in Custom Resource specifications.
 */
@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationRef {

    private String secretName;
    private String secretKey;

    public AuthenticationRef() {}

    /**
     * Creates an authentication reference with secret name and key.
     *
     * @param secretName the name of the Kubernetes Secret
     * @param secretKey the key within the Secret containing the authentication data
     */
    public AuthenticationRef(String secretName, String secretKey) {
        this.secretName = secretName;
        this.secretKey = secretKey;
    }

    /**
     * Gets the name of the Kubernetes Secret containing authentication data.
     *
     * @return the secret name
     */
    public String getSecretName() {
        return secretName;
    }

    /**
     * Sets the name of the Kubernetes Secret containing authentication data.
     *
     * @param secretName the secret name
     */
    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    /**
     * Gets the key within the Secret that contains the authentication data.
     *
     * @return the secret key (e.g., "api-key", "token")
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * Sets the key within the Secret that contains the authentication data.
     *
     * @param secretKey the secret key
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
