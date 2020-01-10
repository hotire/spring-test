package com.github.hotire.springtest.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class DisabledTest {

  @Disableit cmd
  @Test
  void ignore() {
    Assertions.fail();
  }
}
