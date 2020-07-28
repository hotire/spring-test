package com.github.hotire.springtest.core;

import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

import static org.assertj.core.api.Assertions.assertThat;

public class CoreTest {

    @Test
    public void helloTrue() {
       assertThat(true).isTrue();
    }

    @Test
    public void helloFalse() {
        assertThat(false).isFalse();
    }

    public static void main(String ... args) {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.run(CoreTest.class);
    }
}
