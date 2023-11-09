package com.github.hotire.springtest.testdoubles.mock;

import com.github.hotire.springtest.testdoubles.Authorizer;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AcceptingAuthorizerVerificationMock implements Authorizer {

    private final Boolean authorized;

    boolean authorizedWasCalled = false;

    @Override
    public Boolean authorize(String username, String password) {
        authorizedWasCalled = true;
        return authorized;
    }

    public boolean verify() {
        return authorizedWasCalled;
    }
}
