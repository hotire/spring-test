package com.github.hotire.springtest.junit4;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AfterAfterClass {

  private static String value;

  @AfterClass
  public static void init() {
    assertThat(value).isNotNull();
    assertThat(value).isEqualTo("config");
  }

  @After
  public void config() {
    assertThat(value).isNotNull();
    assertThat(value).isEqualTo("test");
    value = "config";
  }

  @Test
  public void test() {
    assertThat(value).isNull();
    value = "test";
  }
}
