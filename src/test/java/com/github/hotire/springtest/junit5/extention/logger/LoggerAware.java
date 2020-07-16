package com.github.hotire.springtest.junit5.extention.logger;

import org.apache.logging.log4j.Logger;

public interface LoggerAware {
    void setLogger(Logger logger);
}
