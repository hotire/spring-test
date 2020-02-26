package com.github.hotire.springtest.mockito;

import org.junit.jupiter.api.Test;
import org.testcontainers.shaded.org.apache.commons.lang.RandomStringUtils;

import static org.mockito.Mockito.*;

class AnyTest {

    static class Service {
        void send(final String msg) {
        }
    }

    @Test
    void verifyAny() {
        // given
        final Service service = mock(Service.class);

        // when
        service.send(RandomStringUtils.randomAlphabetic(20));

        // then
        verify(service, times(1)).send(any());
    }
}
