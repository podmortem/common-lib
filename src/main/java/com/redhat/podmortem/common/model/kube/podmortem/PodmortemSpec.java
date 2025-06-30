package com.redhat.podmortem.common.model.kube.podmortem;

import com.redhat.podmortem.common.model.kube.aiprovider.AIProviderRef;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class PodmortemSpec {

    private LabelSelector podSelector;
    private AIProviderRef aiProviderRef;
    private Boolean aiAnalysisEnabled = true;

    public LabelSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(LabelSelector podSelector) {
        this.podSelector = podSelector;
    }

    public AIProviderRef getAiProviderRef() {
        return aiProviderRef;
    }

    public void setAiProviderRef(AIProviderRef aiProviderRef) {
        this.aiProviderRef = aiProviderRef;
    }

    public Boolean getAiAnalysisEnabled() {
        return aiAnalysisEnabled;
    }

    public void setAiAnalysisEnabled(Boolean aiAnalysisEnabled) {
        this.aiAnalysisEnabled = aiAnalysisEnabled;
    }
}
