package com.redhat.podmortem.common.model.analysis;

import io.quarkus.runtime.annotations.RegisterForReflection;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ConcurrentLinkedQueue;

@RegisterForReflection
public class PatternFrequency {

    private final ConcurrentLinkedQueue<Instant> recentMatches = new ConcurrentLinkedQueue<>();
    private final Duration timeWindow;

    public PatternFrequency() {
        this.timeWindow = Duration.ofHours(1);
    }

    public PatternFrequency(Duration timeWindow) {
        this.timeWindow = timeWindow;
    }

    /** Records a new pattern match at the current time. */
    public void incrementCount() {
        Instant now = Instant.now();
        recentMatches.offer(now);
        cleanupOldEntries(now);
    }

    /**
     * Gets the current hourly rate of pattern matches.
     *
     * @return Number of matches in the last hour (or configured time window)
     */
    public double getHourlyRate() {
        cleanupOldEntries(Instant.now());
        return recentMatches.size();
    }

    /**
     * Gets the total number of matches currently tracked in the time window.
     *
     * @return Total matches in the time window
     */
    public int getCurrentCount() {
        cleanupOldEntries(Instant.now());
        return recentMatches.size();
    }

    /**
     * Gets the time window duration.
     *
     * @return The time window duration
     */
    public Duration getTimeWindow() {
        return timeWindow;
    }

    /**
     * Removes entries older than the time window.
     *
     * @param now Current time for comparison
     */
    private void cleanupOldEntries(Instant now) {
        Instant cutoff = now.minus(timeWindow);
        while (!recentMatches.isEmpty() && recentMatches.peek().isBefore(cutoff)) {
            recentMatches.poll();
        }
    }

    /** Clears all recorded matches. */
    public void reset() {
        recentMatches.clear();
    }
}
