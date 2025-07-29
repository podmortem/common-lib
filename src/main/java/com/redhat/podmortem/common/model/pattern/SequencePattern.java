package com.redhat.podmortem.common.model.pattern;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

/**
 * Pattern for matching sequences of events over time.
 *
 * <p>Defines a sequence of events that must occur in order within specified time windows to
 * identify complex failure scenarios. Provides bonus scoring when sequences match.
 */
@RegisterForReflection
@JsonIgnoreProperties(ignoreUnknown = true)
public class SequencePattern {
    private String description;

    @JsonProperty("bonus_multiplier")
    private double bonusMultiplier;

    private List<SequenceEvent> events;

    /**
     * Gets the human-readable description of this sequence pattern.
     *
     * @return the sequence pattern description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the human-readable description of this sequence pattern.
     *
     * @param description the sequence pattern description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the bonus multiplier applied when this sequence matches.
     *
     * @return the bonus multiplier for confidence scoring
     */
    public double getBonusMultiplier() {
        return bonusMultiplier;
    }

    /**
     * Sets the bonus multiplier applied when this sequence matches.
     *
     * @param bonusMultiplier the bonus multiplier for confidence scoring
     */
    public void setBonusMultiplier(double bonusMultiplier) {
        this.bonusMultiplier = bonusMultiplier;
    }

    /**
     * Gets the ordered list of events in this sequence.
     *
     * @return the list of sequence events
     */
    public List<SequenceEvent> getEvents() {
        return events;
    }

    /**
     * Sets the ordered list of events in this sequence.
     *
     * @param events the list of sequence events
     */
    public void setEvents(List<SequenceEvent> events) {
        this.events = events;
    }
}
