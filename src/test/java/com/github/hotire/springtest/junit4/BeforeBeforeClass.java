package com.github.hotire.springtest.junit4;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeBeforeClass {

  private static String value;

  @BeforeClass
  public static void init() {
    assertThat(value).isNull();
    value = "init";
  }

  @Before
  public void config() {
    assertThat(value).isNotNull();
    assertThat(value).isEqualTo("init");
    value = "config";
  }

  @Test
  public void test() {
    assertThat(value).isNotNull();
    assertThat(value).isEqualTo("config");
  }
}
