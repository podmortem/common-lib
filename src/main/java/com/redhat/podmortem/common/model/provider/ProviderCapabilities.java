package com.redhat.podmortem.common.model.provider;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/** A shared model to describe the capabilities of an AI Provider. */
public class ProviderCapabilities implements Serializable {
    private static final long serialVersionUID = 1L;

    private boolean supportsStreaming;
    private int maxTokens;
    private List<String> supportedModels;
    private String rateLimitInfo;
    private double costPerToken;

    public ProviderCapabilities() {
        this.supportedModels = Collections.emptyList();
    }

    public ProviderCapabilities(
            boolean supportsStreaming,
            int maxTokens,
            List<String> supportedModels,
            String rateLimitInfo,
            double costPerToken) {
        this.supportsStreaming = supportsStreaming;
        this.maxTokens = maxTokens;
        this.supportedModels = supportedModels;
        this.rateLimitInfo = rateLimitInfo;
        this.costPerToken = costPerToken;
    }

    public boolean isSupportsStreaming() {
        return supportsStreaming;
    }

    public void setSupportsStreaming(boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;
    }

    public int getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(int maxTokens) {
        this.maxTokens = maxTokens;
    }

    public List<String> getSupportedModels() {
        return supportedModels;
    }

    public void setSupportedModels(List<String> supportedModels) {
        this.supportedModels = supportedModels;
    }

    public String getRateLimitInfo() {
        return rateLimitInfo;
    }

    public void setRateLimitInfo(String rateLimitInfo) {
        this.rateLimitInfo = rateLimitInfo;
    }

    public double getCostPerToken() {
        return costPerToken;
    }

    public void setCostPerToken(double costPerToken) {
        this.costPerToken = costPerToken;
    }

    @Override
    public String toString() {
        return "ProviderCapabilities{"
                + "supportsStreaming="
                + supportsStreaming
                + ", maxTokens="
                + maxTokens
                + ", supportedModels="
                + supportedModels
                + '}';
    }
}
