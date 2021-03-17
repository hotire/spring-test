package com.github.hotire.springtest.etc.auto_params;

import org.javaunit.autoparams.AutoSource;
import org.junit.jupiter.params.ParameterizedTest;

class AutoParamsTest {

    @ParameterizedTest
    @AutoSource
    void testMethod(boolean x1, int x2, long x3, float x4, double x5) {
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
    }
}
