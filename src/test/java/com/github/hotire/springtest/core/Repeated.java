package com.github.hotire.springtest.core;

import junit.extensions.RepeatedTest;
import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class Repeated {

    public static void main(String ... args) {
        Test test = new JUnit4TestAdapter(SingleTest.class);
        RepeatedTest repeatedTest = new RepeatedTest(test, 5);

        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));

        junit.run(repeatedTest);
    }
}
