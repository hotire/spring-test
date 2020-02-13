package com.github.hotire.springtest.junit4;

import org.junit.Test;

public class TimeoutTest {

    @Test(timeout = 1000)
    public void timeout() throws InterruptedException {
        Thread.sleep(500);
    }
}
