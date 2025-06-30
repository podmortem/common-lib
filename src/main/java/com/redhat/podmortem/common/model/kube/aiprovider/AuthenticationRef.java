package com.redhat.podmortem.common.model.kube.aiprovider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;

@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationRef {

    private String secretName;
    private String secretKey;

    public AuthenticationRef() {}

    public AuthenticationRef(String secretName, String secretKey) {
        this.secretName = secretName;
        this.secretKey = secretKey;
    }

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
