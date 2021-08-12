package com.github.hotire.springtest.junit5.factory;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;

import org.apache.commons.math3.util.Pair;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class TestFactoryTest {

    @TestFactory
    Stream<DynamicTest> isEmpty() {
        return Stream.of(
                new Pair<>("abc", false),
                new Pair<>("", true)
        ).map(param -> DynamicTest.dynamicTest("isEmpty, param : " + param, () -> {
            // given
            final String s = param.getFirst();
            final boolean expected  = param.getSecond();

            // when
            final boolean result = s.isEmpty();

            // then
            assertThat(result).isEqualTo(expected);
        }));
    }
}
