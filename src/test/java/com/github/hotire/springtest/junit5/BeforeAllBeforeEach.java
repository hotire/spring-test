package com.github.hotire.springtest.junit5;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAllBeforeEach {

  private static String value;

  @BeforeAll
  static void init() {
    assertThat(value).isNull();
    value = "init";
  }

  @BeforeEach
  void config() {
    assertThat(value).isNotNull();
    assertThat(value).isEqualTo("init");
    value = "config";
  }

  @Test
  void test() {
    assertThat(value).isNotNull();
    assertThat(value).isEqualTo("config");
  }
}
