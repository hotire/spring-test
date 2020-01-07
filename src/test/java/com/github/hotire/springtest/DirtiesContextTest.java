package com.github.hotire.springtest;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;


@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
@SpringBootTest
class DirtiesContextTest {

  @Autowired
  private UserService userService;

  @Test
  void di() {
    // given
    userService.getCache().put("test1", new Object());

    // when
    int size = userService.getCache().size();

    // then
    assertThat(size).isEqualTo(1);
  }

  @Test
  void di2() {
    // given
    userService.getCache().put("test2", new Object());

    // when
    int size = userService.getCache().size();

    // then
    assertThat(size).isEqualTo(1);
  }
}
