package com.github.hotire.springtest.context;

import java.util.ArrayList;
import java.util.List;

import org.springframework.test.context.MergedContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestContextBootstrapper;

/**
 * @see org.springframework.boot.test.context.SpringBootTestContextBootstrapper
 */
public class SpringBootTestContextBootstrapperCore {

    /**
     * @see org.springframework.boot.test.context.SpringBootTestContextBootstrapper#buildTestContext()
     * @see AbstractTestContextBootstrapper#buildTestContext()
     */
    public TestContext buildTestContext() {
        return null;
    }

    /**
     * @see org.springframework.boot.test.context.SpringBootTestContextBootstrapper#getAndProcessPropertySourceProperties(MergedContextConfiguration)
     */
    private List<String> getAndProcessPropertySourceProperties(MergedContextConfiguration mergedConfig) { getDifferentiatorPropertySourceProperty();
       return new ArrayList<>();
    }

    protected String getDifferentiatorPropertySourceProperty() {
        return getClass().getName() + "=true";
    }
}
