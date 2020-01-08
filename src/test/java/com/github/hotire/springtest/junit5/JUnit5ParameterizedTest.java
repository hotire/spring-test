package com.github.hotire.springtest.junit5;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class JUnit5ParameterizedTest {

  @ParameterizedTest
  @ValueSource(strings = {"", "  "})
  void isBlank(String input) {
    assertThat(input).isBlank();
  }
}
