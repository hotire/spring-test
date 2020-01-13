package com.github.hotire.springtest.junit5.parameterized_test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.params.provider.ArgumentsSource;

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
