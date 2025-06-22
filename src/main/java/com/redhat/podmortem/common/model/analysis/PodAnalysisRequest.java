package com.redhat.podmortem.common.model.analysis;

import com.redhat.podmortem.common.model.event.Event;
import com.redhat.podmortem.common.model.pod.Pod;
import java.util.List;

public class PodAnalysisRequest {

    private Pod pod;
    private String logs;
    private List<Event> events;

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
