package com.github.hotire.springtest.junit5.extention.mock;

import com.github.hotire.springtest.User;
import com.github.hotire.springtest.UserService;
import lombok.Getter;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.mock;

@ExtendWith(UserMockExtension.class)
public abstract class AbstractUserMockExtension {

    @Getter
    @MockBean
    private UserService userService;

    @Getter
    private User user = mock(User.class);
}
