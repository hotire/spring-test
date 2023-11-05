package com.github.hotire.springtest.testdoubles.dummy;

import com.github.hotire.springtest.testdoubles.Authorizer;

public class DummyAuthorizer implements Authorizer {

    @Override
    public Boolean authorize(String username, String password) {
        return null;
    }
}
