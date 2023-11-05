package com.github.hotire.springtest.testdoubles.stub;

import com.github.hotire.springtest.testdoubles.Authorizer;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AcceptingAuthorizerStub implements Authorizer {

    private final Boolean authorized;

    @Override
    public Boolean authorize(String username, String password) {
        return authorized;
    }
}
