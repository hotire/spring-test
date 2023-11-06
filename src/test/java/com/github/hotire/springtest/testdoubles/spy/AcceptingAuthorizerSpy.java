package com.github.hotire.springtest.testdoubles.spy;

import com.github.hotire.springtest.testdoubles.Authorizer;

public class AcceptingAuthorizerSpy implements Authorizer {

    public boolean authorizeWasCalled = false;

    @Override
    public Boolean authorize(String username, String password) {
        authorizeWasCalled = true;
        return null;
    }
}
