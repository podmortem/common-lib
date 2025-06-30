package com.redhat.podmortem.common.model.kube.aiprovider;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Kind;
import io.fabric8.kubernetes.model.annotation.Version;
import io.quarkus.runtime.annotations.RegisterForReflection;

@Group("podmortem.redhat.com")
@Version("v1alpha1")
@Kind("AIProvider")
@RegisterForReflection
public class AIProvider extends CustomResource<AIProviderSpec, AIProviderStatus>
        implements Namespaced {}
