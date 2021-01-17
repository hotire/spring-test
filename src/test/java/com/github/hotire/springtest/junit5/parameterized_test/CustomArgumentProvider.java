package com.github.hotire.springtest.junit5.parameterized_test;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CustomArgumentProvider implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext)
    throws Exception {
    return Stream.of(
      Arguments.of((String) null),
      Arguments.of(""),
      Arguments.of("   ")
    );
  }
}