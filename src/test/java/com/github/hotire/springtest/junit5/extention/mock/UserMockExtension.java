package com.github.hotire.springtest.junit5.extention.mock;

import com.github.hotire.springtest.User;
import com.github.hotire.springtest.UserService;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class UserMockExtension implements TestInstancePostProcessor, BeforeEachCallback {

    private Object testInstance;

    @Override
    public void postProcessTestInstance( Object testInstance, ExtensionContext context) throws Exception {
        this.testInstance = testInstance;
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        context.getTestMethod().ifPresent(method -> {
            UserMock userMock =  method.getAnnotation(UserMock.class);
            Arrays.stream(testInstance.getClass().getDeclaredFields())
                  .filter(field -> field.getType().equals(UserService.class))
                  .findAny()
                  .ifPresent(field -> {
                      final User user = mock(User.class);
                      field.setAccessible(true);
                      try {
                          final UserService userService = (UserService) field.get(testInstance);
                          // when
                          when(userService.findById(userMock.id())).thenReturn(user);
                          when(user.getId()).thenReturn(userMock.id());
                      } catch (IllegalAccessException ignore) {
                          ignore.printStackTrace();
                      }
                  });
        });
    }
}
