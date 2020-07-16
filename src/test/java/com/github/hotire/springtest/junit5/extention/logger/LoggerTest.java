package com.github.hotire.springtest.junit5.extention.logger;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(LoggerExtension.class)
public class LoggerTest implements LoggerAware {

    private Logger logger;

    @Test
    void di() {
        logger.info("hello");
    }

    @Override
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
