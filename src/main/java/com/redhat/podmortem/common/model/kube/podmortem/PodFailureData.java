package com.redhat.podmortem.common.model.kube.podmortem;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.model.Event;
import io.fabric8.kubernetes.api.model.Pod;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

/**
 * Complete failure data collected for a failed pod.
 *
 * <p>Contains all relevant information needed for failure analysis including the pod spec,
 * container logs, and Kubernetes events related to the failure.
 */
@RegisterForReflection
public class PodFailureData {

    private Pod pod;
    private String logs;
    private List<Event> events;

    public PodFailureData() {}

    /**
     * Creates pod failure data with complete failure information.
     *
     * @param pod the failed pod specification and status
     * @param logs the container logs from the failed pod
     * @param events the Kubernetes events related to the pod failure
     */
    @JsonCreator
    public PodFailureData(
            @JsonProperty("pod") Pod pod,
            @JsonProperty("logs") String logs,
            @JsonProperty("events") List<Event> events) {
        this.pod = pod;
        this.logs = logs;
        this.events = events;
    }

    /**
     * Gets the failed pod specification and status.
     *
     * @return the Kubernetes Pod object
     */
    @JsonProperty("pod")
    public Pod getPod() {
        return pod;
    }

    /**
     * Sets the failed pod specification and status.
     *
     * @param pod the Kubernetes Pod object
     */
    public void setPod(Pod pod) {
        this.pod = pod;
    }

    /**
     * Gets the container logs from the failed pod.
     *
     * @return the log content as a string
     */
    @JsonProperty("logs")
    public String getLogs() {
        return logs;
    }

    /**
     * Sets the container logs from the failed pod.
     *
     * @param logs the log content as a string
     */
    public void setLogs(String logs) {
        this.logs = logs;
    }

    /**
     * Gets the Kubernetes events related to the pod failure.
     *
     * @return the list of related Kubernetes events
     */
    @JsonProperty("events")
    public List<Event> getEvents() {
        return events;
    }

    /**
     * Sets the Kubernetes events related to the pod failure.
     *
     * @param events the list of related Kubernetes events
     */
    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
