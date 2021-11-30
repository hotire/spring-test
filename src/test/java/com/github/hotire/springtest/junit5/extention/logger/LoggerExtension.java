package com.github.hotire.springtest.junit5.extention.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class LoggerExtension implements TestInstancePostProcessor {

    @Override
    public void postProcessTestInstance(Object testInstance,
                                        ExtensionContext context) throws Exception {
        final Logger logger = LogManager.getLogger(testInstance.getClass());

        if (testInstance instanceof LoggerAware) {
            ((LoggerAware) testInstance).setLogger(logger);
        }
    }
}
