package com.redhat.podmortem.common.model.event;

public class Event {

    private String kind;
    private String apiVersion;
    private EventMetadata metadata;
    private InvolvedObject involvedObject;
    private String reason;
    private String message;
    private EventSource source;
    private String firstTimestamp;
    private String lastTimestamp;
    private int count;
    private String type;
    private String eventTime;
    private String reportingComponent;
    private String reportingInstance;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public EventMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(EventMetadata metadata) {
        this.metadata = metadata;
    }

    public InvolvedObject getInvolvedObject() {
        return involvedObject;
    }

    public void setInvolvedObject(InvolvedObject involvedObject) {
        this.involvedObject = involvedObject;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EventSource getSource() {
        return source;
    }

    public void setSource(EventSource source) {
        this.source = source;
    }

    public String getFirstTimestamp() {
        return firstTimestamp;
    }

    public void setFirstTimestamp(String firstTimestamp) {
        this.firstTimestamp = firstTimestamp;
    }

    public String getLastTimestamp() {
        return lastTimestamp;
    }

    public void setLastTimestamp(String lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getReportingComponent() {
        return reportingComponent;
    }

    public void setReportingComponent(String reportingComponent) {
        this.reportingComponent = reportingComponent;
    }

    public String getReportingInstance() {
        return reportingInstance;
    }

    public void setReportingInstance(String reportingInstance) {
        this.reportingInstance = reportingInstance;
    }
}
