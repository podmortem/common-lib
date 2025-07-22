package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

@RegisterForReflection
public class SequencePattern {
    private String description;

    @JsonProperty("bonus_multiplier")
    private double bonusMultiplier;

    private List<SequenceEvent> events;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getBonusMultiplier() {
        return bonusMultiplier;
    }

    public void setBonusMultiplier(double bonusMultiplier) {
        this.bonusMultiplier = bonusMultiplier;
    }

    public List<SequenceEvent> getEvents() {
        return events;
    }

    public void setEvents(List<SequenceEvent> events) {
        this.events = events;
    }
}
