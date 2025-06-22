package com.redhat.podmortem.common.model.pod;

import java.util.List;

public class PodStatus {
    private String phase;
    private List<PodCondition> conditions;
    private String hostIP;
    private List<PodIP> hostIPs;
    private String podIP;
    private List<PodIP> podIPs;
    private String startTime;
    private List<ContainerStatus> containerStatuses;
    private String qosClass;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public List<PodCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<PodCondition> conditions) {
        this.conditions = conditions;
    }

    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(String hostIP) {
        this.hostIP = hostIP;
    }

    public List<PodIP> getHostIPs() {
        return hostIPs;
    }

    public void setHostIPs(List<PodIP> hostIPs) {
        this.hostIPs = hostIPs;
    }

    public String getPodIP() {
        return podIP;
    }

    public void setPodIP(String podIP) {
        this.podIP = podIP;
    }

    public List<PodIP> getPodIPs() {
        return podIPs;
    }

    public void setPodIPs(List<PodIP> podIPs) {
        this.podIPs = podIPs;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public List<ContainerStatus> getContainerStatuses() {
        return containerStatuses;
    }

    public void setContainerStatuses(List<ContainerStatus> containerStatuses) {
        this.containerStatuses = containerStatuses;
    }

    public String getQosClass() {
        return qosClass;
    }

    public void setQosClass(String qosClass) {
        this.qosClass = qosClass;
    }
}
