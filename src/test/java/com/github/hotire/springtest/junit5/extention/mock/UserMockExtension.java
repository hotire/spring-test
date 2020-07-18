package com.github.hotire.springtest.junit5.extention.mock;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

import static org.mockito.Mockito.when;

public class UserMockExtension implements TestInstancePostProcessor, BeforeEachCallback {

    private Object testInstance;

    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
        this.testInstance = testInstance;
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        context.getTestMethod().ifPresent(method -> {
            UserMock userMock =  method.getAnnotation(UserMock.class);
            if (testInstance instanceof AbstractUserMockExtension) {
                final AbstractUserMockExtension extension = ((AbstractUserMockExtension) testInstance);
                when(extension.getUserService().findById(userMock.id())).thenReturn(extension.getUser());
            }
        });

    }
}
