package com.github.hotire.springtest.core;

import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import static com.github.hotire.springtest.core.CoreUtils.resultReport;
import static org.assertj.core.api.Assertions.assertThat;

public class MultiTest {

    @Test
    public void helloTrue() {
        assertThat(true).isTrue();
    }

    @Test
    public void helloFalse() {
        assertThat(false).isFalse();
    }

    public static void main(String... args) {
        final JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        final Result result = junit.run(SingleTest.class, MultiTest.class);

        resultReport(result);
    }
}
