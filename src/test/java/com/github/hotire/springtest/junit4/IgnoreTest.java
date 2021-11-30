package com.github.hotire.springtest.junit4;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class IgnoreTest {

    @Ignore
    @Test
    public void ignore() {
        Assertions.fail();
    }
}
