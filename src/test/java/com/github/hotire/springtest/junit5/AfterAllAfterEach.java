package com.github.hotire.springtest.junit5;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class AfterAllAfterEach {

  private static String value;

  @AfterAll
  static void init() {
    assertThat(value).isNotNull();
    assertThat(value).isEqualTo("config");
  }

  @AfterEach
  void config() {
    assertThat(value).isNotNull();
    assertThat(value).isEqualTo("test");
    value = "config";
  }

  @Test
  void test() {
    assertThat(value).isNull();
    value = "test";
  }
}
