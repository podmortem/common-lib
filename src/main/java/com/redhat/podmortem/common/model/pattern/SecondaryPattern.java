package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class SecondaryPattern {
    private String regex;
    private double weight;
    @JsonProperty("proximity_window")
    private int proximityWindow;

    public String getRegex() { return regex; }
    public void setRegex(String regex) { this.regex = regex; }
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
    public int getProximityWindow() { return proximityWindow; }
    public void setProximityWindow(int proximityWindow) { this.proximityWindow = proximityWindow; }
}