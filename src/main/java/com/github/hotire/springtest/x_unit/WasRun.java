package com.github.hotire.springtest.x_unit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WasRun implements Runnable {
    private final String name;
    private boolean wasRun;

    public void testMethod() {
        wasRun = true;
    }

    @Override
    public void run() {
        try {
            final Method method = getClass().getMethod(name);
            method.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
