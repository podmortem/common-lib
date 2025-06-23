package com.redhat.podmortem.common.model.kube.patternlibrary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.quarkus.runtime.annotations.RegisterForReflection;

@JsonDeserialize
@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Credentials {

    private String secretRef;

    public String getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(String secretRef) {
        this.secretRef = secretRef;
    }
}
