package com.github.hotire.springtest.junit5.extention.mock;


import com.github.hotire.springtest.User;
import com.github.hotire.springtest.UserController;
import com.github.hotire.springtest.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(UserMockExtension.class)
@SpringBootTest
class UserMockExtensionTest {

    @Autowired
    private UserController userController;

    @MockBean
    private UserService userService;

    @UserMock(id = 1L)
    @Test
    void test() {
        // when
        final User result = userController.findById(1L);

        // then
        assertThat(result).isNotNull();
    }

}
