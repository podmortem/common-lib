package com.redhat.podmortem.common.model.analysis;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

/**
 * Contextual information surrounding a matched log event.
 *
 * <p>Contains the matched line and surrounding context lines that provide additional information
 * for understanding the failure scenario and generating explanations.
 */
@RegisterForReflection
public class EventContext {

    private List<String> linesBefore;
    private String matchedLine;
    private List<String> linesAfter;

    /**
     * Gets the list of log lines that occurred before the matched event.
     *
     * @return the list of preceding context lines
     */
    public List<String> getLinesBefore() {
        return linesBefore;
    }

    /**
     * Sets the list of log lines that occurred before the matched event.
     *
     * @param linesBefore the list of preceding context lines
     */
    public void setLinesBefore(List<String> linesBefore) {
        this.linesBefore = linesBefore;
    }

    /**
     * Gets the specific log line that matched the failure pattern.
     *
     * @return the matched log line
     */
    public String getMatchedLine() {
        return matchedLine;
    }

    /**
     * Sets the specific log line that matched the failure pattern.
     *
     * @param matchedLine the matched log line
     */
    public void setMatchedLine(String matchedLine) {
        this.matchedLine = matchedLine;
    }

    /**
     * Gets the list of log lines that occurred after the matched event.
     *
     * @return the list of following context lines
     */
    public List<String> getLinesAfter() {
        return linesAfter;
    }

    /**
     * Sets the list of log lines that occurred after the matched event.
     *
     * @param linesAfter the list of following context lines
     */
    public void setLinesAfter(List<String> linesAfter) {
        this.linesAfter = linesAfter;
    }
}
