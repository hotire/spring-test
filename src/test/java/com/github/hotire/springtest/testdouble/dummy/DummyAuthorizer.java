package com.github.hotire.springtest.testdouble.dummy;

import com.github.hotire.springtest.testdouble.Authorizer;

public class DummyAuthorizer implements Authorizer {

    @Override
    public Boolean authorize(String username, String password) {
        return null;
    }
}
