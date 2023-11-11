package com.github.hotire.springtest.testdouble.fake;

import com.github.hotire.springtest.testdouble.Authorizer;
import java.util.HashMap;
import java.util.Map;

public class AcceptingAuthorizerFake implements Authorizer {

    public Map<String, String> repository = new HashMap<>();

    @Override
    public Boolean authorize(String username, String password) {
        return password.equals(repository.get(username));
    }
}
