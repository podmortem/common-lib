package com.redhat.podmortem.common.model.pod;

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
