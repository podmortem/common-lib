package com.redhat.podmortem.common.model.event;

import com.redhat.podmortem.common.model.pod.ManagedField;
import java.util.List;

public class EventMetadata {
    private String name;
    private String namespace;
    private String uid;
    private String resourceVersion;
    private String creationTimestamp;
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

    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public List<ManagedField> getManagedFields() {
        return managedFields;
    }

    public void setManagedFields(List<ManagedField> managedFields) {
        this.managedFields = managedFields;
    }
}
