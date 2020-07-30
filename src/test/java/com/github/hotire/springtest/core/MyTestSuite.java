package com.github.hotire.springtest.core;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static com.github.hotire.springtest.core.CoreUtils.resultReport;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        SingleTest.class,
        MultiTest.class
})
public class MyTestSuite {
    public static void main(String ... args) {
        final JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        final Result result = junit.run(MyTestSuite.class);
        resultReport(result);
    }
}