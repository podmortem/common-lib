package com.redhat.podmortem.common.model.kube.pod;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Volume {
    private String name;
    private ProjectedVolumeSource projected;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectedVolumeSource getProjected() {
        return projected;
    }

    public void setProjected(ProjectedVolumeSource projected) {
        this.projected = projected;
    }
}
