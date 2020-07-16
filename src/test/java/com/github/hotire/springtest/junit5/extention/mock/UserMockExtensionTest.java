package com.github.hotire.springtest.junit5.extention.mock;


import com.github.hotire.springtest.User;
import com.github.hotire.springtest.UserController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserMockExtensionTest extends AbstractUserMockExtension {

    @Autowired
    private UserController userController;

    @Test
    void test() {
        // when
        final User result = userController.findById(1L);

        // then
        Assertions.assertThat(result).isNotNull();
    }

}
