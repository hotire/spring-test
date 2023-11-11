package com.github.hotire.springtest.testdouble.spy;

import com.github.hotire.springtest.testdouble.Authorizer;

public class AcceptingAuthorizerSpy implements Authorizer {

    public boolean authorizeWasCalled = false;

    @Override
    public Boolean authorize(String username, String password) {
        authorizeWasCalled = true;
        return null;
    }
}
