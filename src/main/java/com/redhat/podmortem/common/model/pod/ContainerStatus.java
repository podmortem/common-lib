package com.redhat.podmortem.common.model.pod;

import java.util.Map;

public class ContainerStatus {
    private String name;
    private boolean ready;
    private int restartCount;
    private String image;
    private String imageID;
    private Map<String, Object> state;
    private Map<String, Object> lastState;
    private String containerID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public int getRestartCount() {
        return restartCount;
    }

    public void setRestartCount(int restartCount) {
        this.restartCount = restartCount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public Map<String, Object> getState() {
        return state;
    }

    public void setState(Map<String, Object> state) {
        this.state = state;
    }

    public Map<String, Object> getLastState() {
        return lastState;
    }

    public void setLastState(Map<String, Object> lastState) {
        this.lastState = lastState;
    }

    public String getContainerID() {
        return containerID;
    }

    public void setContainerID(String containerID) {
        this.containerID = containerID;
    }
}
