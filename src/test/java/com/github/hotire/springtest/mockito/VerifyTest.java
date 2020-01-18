package com.github.hotire.springtest.mockito;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;
import org.junit.Test;

public class VerifyTest {

  @Test
  public void simple() {
    final List mocks = mock(List.class);
    mocks.size();
    verify(mocks).size();
  }

}
