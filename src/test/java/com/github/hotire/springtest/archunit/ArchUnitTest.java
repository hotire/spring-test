package com.github.hotire.springtest.archunit;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.library.Architectures.LayeredArchitecture;
import org.junit.jupiter.api.Test;

class ArchUnitTest {
    final JavaClasses importedClasses = new ClassFileImporter().importPackages("com.github.hotire.springtest.arch_unit");

    @Test
    void checkLayer() {
        final LayeredArchitecture rule = layeredArchitecture()
            .consideringOnlyDependenciesInLayers()
            .layer("Controller").definedBy("..layered.controller..")
            .layer("Service").definedBy("..layered.service..")
            .layer("Repository").definedBy("..layered.repository..")
            .whereLayer("Controller").mayNotBeAccessedByAnyLayer()
            .whereLayer("Service").mayOnlyBeAccessedByLayers("Controller")
            .whereLayer("Repository").mayOnlyBeAccessedByLayers("Service");
        rule.check(importedClasses);
    }
}
