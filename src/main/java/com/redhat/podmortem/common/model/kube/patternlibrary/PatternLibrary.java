package com.redhat.podmortem.common.model.kube.patternlibrary;

import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Kind;
import io.fabric8.kubernetes.model.annotation.Version;
import io.quarkus.runtime.annotations.RegisterForReflection;

@Group("podmortem.redhat.com")
@Version("v1alpha1")
@Kind("PatternLibrary")
@RegisterForReflection
public class PatternLibrary extends CustomResource<PatternLibrarySpec, PatternLibraryStatus> {}
