package com.github.hotire.springtest.spring;

import com.github.hotire.springtest.UserService;

import lombok.RequiredArgsConstructor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestConstructor;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
@RequiredArgsConstructor
class TestConstructorTest {
    private final UserService userService;

    @Test
    void di() {
        assertThat(userService).isNotNull();
    }
}
