package com.redhat.podmortem.common.model.kube.pod;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Pod {

    private String kind;
    private String apiVersion;
    private PodMetadata metadata;
    private PodSpec spec;
    private PodStatus status;

    // Getters and Setters
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public PodMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PodMetadata metadata) {
        this.metadata = metadata;
    }

    public PodSpec getSpec() {
        return spec;
    }

    public void setSpec(PodSpec spec) {
        this.spec = spec;
    }

    public PodStatus getStatus() {
        return status;
    }

    public void setStatus(PodStatus status) {
        this.status = status;
    }
}
