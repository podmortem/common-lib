package com.redhat.podmortem.common.model.kube.event;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class EventSource {
    private String component;
    private String host;

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
