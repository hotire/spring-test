package com.github.hotire.springtest.etc.auto_params;

import java.util.StringJoiner;

import org.javaunit.autoparams.AutoSource;
import org.junit.jupiter.params.ParameterizedTest;

class AutoParamsTest {

    @ParameterizedTest
    @AutoSource(repeat = 10)
    void testMethod(boolean x1, int x2, long x3, float x4, double x5) {
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
    }

    public static class ComplexObject {

        private final int value1;
        private final String value2;

        public ComplexObject(int value1, String value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public int getValue1() {
            return value1;
        }

        public String getValue2() {
            return value2;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", ComplexObject.class.getSimpleName() + "[", "]")
                    .add("value1=" + value1)
                    .add("value2='" + value2 + "'")
                    .toString();
        }
    }

    @ParameterizedTest
    @AutoSource(repeat = 10)
    void testMethod(ComplexObject object) {
        System.out.println(object);
    }
}
