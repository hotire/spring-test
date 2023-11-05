package com.github.hotire.springtest.testdoubles;

public interface Authorizer {
    Boolean authorize(String username, String password);
}
