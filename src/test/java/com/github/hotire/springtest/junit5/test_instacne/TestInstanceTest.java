package com.github.hotire.springtest.junit5.test_instacne;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestInstanceTest {

    private int sum = 1;

    @BeforeAll
        // non-static
    void config() {
        sum = 1;
    }

    @Order(-1)
    @Test
    void addingTwoReturnsThree() {
        sum += 2;
        assertThat(sum).isEqualTo(3);
    }

    @Order(0)
    @Test
    void addingThreeReturnsFour() {
        sum += 3;
        assertThat(sum).isNotEqualTo(4);
        assertThat(sum).isEqualTo(6);
    }

}
