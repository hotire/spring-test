package com.github.hotire.springtest.core;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SingleTest.class,
        MultiTest.class
})
public class MyTestSuite {
}