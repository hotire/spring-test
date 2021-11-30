package com.github.hotire.springtest.junit5.parameterized_test;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.AnnotationConsumer;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public class FieldArgumentsProvider implements ArgumentsProvider,
                                               AnnotationConsumer<FieldSource> {

    private String variableName;

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return context.getTestClass()
                      .map(this::getField)
                      .map(this::getValue)
                      .orElseThrow(() ->
                                           new IllegalArgumentException("Failed to load test arguments"));
    }

    @Override
    public void accept(FieldSource fieldSource) {
        variableName = fieldSource.value();
    }

    private Field getField(Class<?> clazz) {
        try {
            return clazz.getDeclaredField(variableName);
        } catch (Exception e) {
            throw new IllegalStateException("not found field : " + variableName + " in " + clazz.getSimpleName());
        }
    }

    @SuppressWarnings("unchecked")
    private Stream<Arguments> getValue(Field field) {
        field.setAccessible(true);
        try {
            return (Stream<Arguments>) field.get(null);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }
}
