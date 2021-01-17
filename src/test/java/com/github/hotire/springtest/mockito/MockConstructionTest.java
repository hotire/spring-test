package com.github.hotire.springtest.mockito;

import com.github.hotire.springtest.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;

import static org.mockito.Mockito.*;

class MockConstructionTest {

    @Test
    void mocked() {
        try (MockedConstruction mocked = mockConstruction(User.class)) {
            User user = new User();
            when(user.getName()).thenReturn("hotire");
            Assertions.assertThat(user.getName()).isEqualTo("hotire");
            verify(user).getName();
        }
    }
}
