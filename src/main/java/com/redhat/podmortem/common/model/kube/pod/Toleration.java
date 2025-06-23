package com.redhat.podmortem.common.model.kube.pod;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Toleration {
    private String key;
    private String operator;
    private String effect;
    private int tolerationSeconds;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getTolerationSeconds() {
        return tolerationSeconds;
    }

    public void setTolerationSeconds(int tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
    }
}
