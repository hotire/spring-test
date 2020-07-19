package com.github.hotire.springtest.junit5.extention.mock;

import com.github.hotire.springtest.User;
import com.github.hotire.springtest.UserService;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.context.ApplicationContext;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.context.junit.jupiter.SpringExtension.getApplicationContext;


public class UserMockExtension implements BeforeEachCallback {

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        final ApplicationContext applicationContext = getApplicationContext(context);
        context.getTestMethod().ifPresent(method -> {
            final UserMock userMock =  method.getAnnotation(UserMock.class);
            final UserService userService = applicationContext.getBean(UserService.class);
            final User user = mock(User.class);

            // when
            when(userService.findById(userMock.id())).thenReturn(user);
            when(user.getId()).thenReturn(userMock.id());
            when(user.getName()).thenReturn(userMock.name());
        });
    }
}
