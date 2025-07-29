package com.redhat.podmortem.common.model.analysis;

import com.redhat.podmortem.common.model.pattern.Pattern;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Represents a log event that matched a known failure pattern during analysis.
 *
 * <p>Contains the matching score, location information, contextual data, and the pattern that was
 * matched. Used to provide detailed information for AI explanation generation.
 */
@RegisterForReflection
public class MatchedEvent {
    private double score;
    private int lineNumber;
    private EventContext context;
    private Pattern matchedPattern;

    /**
     * Gets the confidence score for this pattern match.
     *
     * @return the match score (0.0 to 1.0)
     */
    public double getScore() {
        return score;
    }

    /**
     * Sets the confidence score for this pattern match.
     *
     * @param score the match score (0.0 to 1.0)
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * Gets the line number in the log where this event was found.
     *
     * @return the line number
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the line number in the log where this event was found.
     *
     * @param lineNumber the line number
     */
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * Gets contextual information surrounding this event.
     *
     * @return the event context
     */
    public EventContext getContext() {
        return context;
    }

    /**
     * Sets contextual information surrounding this event.
     *
     * @param context the event context
     */
    public void setContext(EventContext context) {
        this.context = context;
    }

    /**
     * Gets the pattern that matched this event.
     *
     * @return the matched pattern
     */
    public Pattern getMatchedPattern() {
        return matchedPattern;
    }

    /**
     * Sets the pattern that matched this event.
     *
     * @param matchedPattern the matched pattern
     */
    public void setMatchedPattern(Pattern matchedPattern) {
        this.matchedPattern = matchedPattern;
    }
}
