package com.redhat.podmortem.common.model.pod;

import java.util.List;
import java.util.Map; // Add this line

public class ProjectedVolumeSource {
    private List<Map<String, Object>> sources;
    private int defaultMode;

    // Getters and Setters
    public List<Map<String, Object>> getSources() {
        return sources;
    }

    public void setSources(List<Map<String, Object>> sources) {
        this.sources = sources;
    }

    public int getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(int defaultMode) {
        this.defaultMode = defaultMode;
    }
}
