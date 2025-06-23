package com.redhat.podmortem.common.model.kube.podmortem;

import io.fabric8.kubernetes.api.model.LabelSelector;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PodmortemSpec {

    private LabelSelector podSelector;

    public LabelSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(LabelSelector podSelector) {
        this.podSelector = podSelector;
    }
}
