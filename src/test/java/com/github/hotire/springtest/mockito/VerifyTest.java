package com.github.hotire.springtest.mockito;


import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * https://www.baeldung.com/mockito-verify
 */
public class VerifyTest {

  @Test
  public void simple() {
    final List mocks = mock(List.class);
    mocks.size();
    verify(mocks).size();
  }

  @Test
  public void numberOfInteractions() {
    final List mocks = mock(List.class);
    mocks.size();
    verify(mocks, times(1)).size();
  }

  @Test
  public void noInteraction() {
    List mocks = mock(List.class);
    verifyNoInteractions(mocks);
  }

  @Test
  public void noInteractionWithSpecificMethod() {
    List mocks = mock(List.class);
    verify(mocks, times(0)).size();
  }

  @Test
  public void interactionNever() {
    List mocks = mock(List.class);
    verify(mocks, never()).clear();
  }

  @Test
  public void orderOfInteractions() {
    List mocks = mock(List.class);
    mocks.size();
    mocks.clear();
    mocks.size();

    InOrder inOrder = Mockito.inOrder(mocks);
    inOrder.verify(mocks).size();
    inOrder.verify(mocks).clear();
    inOrder.verify(mocks).size();
  }

  @Test
  public void interactionAtLeast() {
    List mocks = mock(List.class);
    mocks.size();
    mocks.size();
    verify(mocks, atLeast(1)).size();
  }
}
