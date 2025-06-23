package com.redhat.podmortem.common.model.analysis;

import com.redhat.podmortem.common.model.kube.event.Event;
import com.redhat.podmortem.common.model.kube.pod.Pod;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

@RegisterForReflection
public class PodAnalysisRequest {

    private Pod pod;
    private String logs;
    private List<Event> events;

    public PodAnalysisRequest(Pod pod, String logs, List<Event> events) {
        this.pod = pod;
        this.logs = logs;
        this.events = events;
    }

    public Pod getPod() {
        return pod;
    }

    public void setPod(Pod pod) {
        this.pod = pod;
    }

    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
