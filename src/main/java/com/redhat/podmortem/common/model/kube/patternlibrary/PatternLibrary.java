package com.redhat.podmortem.common.model.kube.patternlibrary;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Kind;
import io.fabric8.kubernetes.model.annotation.Version;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Kubernetes CRD for Pattern Library configuration.
 *
 * <p>Represents a pattern library that synchronizes failure pattern definitions from external Git
 * repositories. Manages the lifecycle of pattern repositories, refresh schedules, and provides
 * pattern discovery for log analysis services.
 */
@Group("podmortem.redhat.com")
@Version("v1alpha1")
@Kind("PatternLibrary")
@RegisterForReflection
public class PatternLibrary extends CustomResource<PatternLibrarySpec, PatternLibraryStatus>
        implements Namespaced {}
