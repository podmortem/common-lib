package com.redhat.podmortem.common.model.kube.pod;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.Map;

@RegisterForReflection
public class ManagedField {

    private String manager;
    private String operation;
    private String apiVersion;
    private String time;
    private String fieldsType;
    private Map<String, Object> fieldsV1;
    private String subresource;

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFieldsType() {
        return fieldsType;
    }

    public void setFieldsType(String fieldsType) {
        this.fieldsType = fieldsType;
    }

    public Map<String, Object> getFieldsV1() {
        return fieldsV1;
    }

    public void setFieldsV1(Map<String, Object> fieldsV1) {
        this.fieldsV1 = fieldsV1;
    }

    public String getSubresource() {
        return subresource;
    }

    public void setSubresource(String subresource) {
        this.subresource = subresource;
    }
}
