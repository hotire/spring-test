package com.github.hotire.springtest.junit5;


import static org.assertj.core.api.Assertions.assertThat;

import java.time.Month;
import java.util.EnumSet;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

class JUnit5ParameterizedTest {

  @ParameterizedTest
  @ValueSource(strings = {"", "  "})
  void isBlank(String input) {
    assertThat(input).isBlank();
  }

  @ParameterizedTest
  @EnumSource(Month.class)
  void isAlwaysBetweenOneAndTwelve(Month month) {
    final int monthNumber = month.getValue();
    assertThat(monthNumber).isBetween(1, 12);
  }

  @ParameterizedTest
  @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
  void someMonths_Are30DaysLong(Month month) {
    final boolean isALeapYear = false;
    assertThat(month.length(isALeapYear)).isEqualTo(30);
  }

  @ParameterizedTest
  @EnumSource(value = Month.class, names = ".+BER", mode = EnumSource.Mode.MATCH_ANY)
  void fourMonths_AreEndingWithBer(Month month) {
    final EnumSet<Month> months =
      EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER);
    assertThat(months).contains(month);
  }

}
