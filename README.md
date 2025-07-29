# common-lib

A Quarkus-based common library providing shared models and interfaces for the Podmortem system.

## Overview

This library contains the core data models, interfaces, and Kubernetes Custom Resource Definitions (CRDs) used across all Podmortem components. It provides a unified foundation for pod failure analysis, AI provider integration, and pattern library management.

## Key Components

- **Provider Models** - Common interfaces and data models for AI provider integration
- **Analysis Models** - Data structures for log analysis results and failure pattern matching
- **Pattern Models** - Definitions for failure patterns, remediation steps, and pattern libraries
- **Kubernetes CRDs** - Custom Resource Definitions for AI providers, pattern libraries, and pod monitoring

## Kubernetes Resources

- **AIProvider** - Configuration for AI services (OpenAI, Ollama, etc.)
- **PatternLibrary** - Management of failure pattern repositories  
- **Podmortem** - Pod failure monitoring and analysis configuration

## Usage

This library is consumed as a dependency by other Podmortem components:

- `ai-interface` - Uses provider models and analysis interfaces
- `log-parser` - Uses analysis and pattern models for log processing
- `operator` - Uses all CRD models for Kubernetes resource management

## Building

```bash
./mvnw package
```

For native compilation:
```bash
./mvnw package -Dnative
```
