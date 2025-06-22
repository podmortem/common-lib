package com.redhat.podmortem.common.model.pod;


import java.util.List;
import java.util.Map;

public class PodMetadata {

    private String name;
    private String namespace;
    private String uid;
    private String resourceVersion;
    private int generation;
    private String creationTimestamp;
    private Map<String, String> labels;
    private Map<String, String> annotations;
    private List<ManagedField> managedFields;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public List<ManagedField> getManagedFields() {
        return managedFields;
    }

    public void setManagedFields(List<ManagedField> managedFields) {
        this.managedFields = managedFields;
    }
}
