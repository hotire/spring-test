package com.github.hotire.springtest.junit5.test_instacne;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestInstanceTest {

  private int sum = 1;

  @BeforeAll // non-static
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
