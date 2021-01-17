package com.github.hotire.springtest.junit5.parameterized_test;

import org.junit.jupiter.params.provider.ArgumentsSource;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ArgumentsSource(FieldArgumentsProvider.class)
public @interface FieldSource {

  /**
   * The name of the static variable
   */
  String value();
}
