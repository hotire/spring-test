package com.github.hotire.springtest.mockito;

import com.github.hotire.springtest.User;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class MockConstructionTest {

    @Test
    void mocked() {
        try (MockedConstruction mocked = mockConstruction(User.class)) {
            final User user = new User();
            when(user.getName()).thenReturn("hotire");
            assertThat(user.getName()).isEqualTo("hotire");
            verify(user).getName();
        }
    }
}
