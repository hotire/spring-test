package com.github.hotire.springtest.core;

import junit.extensions.RepeatedTest;
import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Repeated {

    public static void main(final String ... args) {
        final Test test = new JUnit4TestAdapter(SingleTest.class);
        final RepeatedTest repeatedTest = new RepeatedTest(test, 5);

        final JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));

        junit.run(repeatedTest);
    }
}
