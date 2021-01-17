package com.github.hotire.springtest.mockito;

import com.github.hotire.springtest.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mockStatic;

class MockedStaticTest {

    @DisplayName("development mockito 3.4.0 after")
    @Test
    void mocked() {
        final String expected = "hotire";
        assertThat(User.method()).isNotEqualTo(expected);
        try (MockedStatic mocked = mockStatic(User.class)) {
            mocked.when(User::method).thenReturn(expected);
            assertThat(User.method()).isEqualTo(expected);
            mocked.verify(User::method);
        }
        assertThat(User.method()).isNotEqualTo(expected);
    }
}
