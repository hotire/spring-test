package com.github.hotire.springtest.junit5.test_instacne;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Lifecycle {
    private int sum = 1;

    @Test
    void addingTwoReturnsThree() {
        sum += 2;
        assertThat(sum).isEqualTo(3);
    }

    @Test
    void addingThreeReturnsFour() {
        sum += 3;
        assertThat(sum).isEqualTo(4);
    }
}
