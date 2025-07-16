package com.redhat.podmortem.common.model.kube.podmortem;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.Event;
import io.fabric8.kubernetes.api.model.Pod;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

@RegisterForReflection
public class PodFailureData {

    private Pod pod;
    private String logs;
    private List<Event> events;

    public PodFailureData() {}

    @JsonCreator
    public PodFailureData(
            @JsonProperty("pod") Pod pod,
            @JsonProperty("logs") String logs,
            @JsonProperty("events") List<Event> events) {
        this.pod = pod;
        this.logs = logs;
        this.events = events;
    }

    @JsonProperty("pod")
    public Pod getPod() {
        return pod;
    }

    public void setPod(Pod pod) {
        this.pod = pod;
    }

    @JsonProperty("logs")
    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }

    @JsonProperty("events")
    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
