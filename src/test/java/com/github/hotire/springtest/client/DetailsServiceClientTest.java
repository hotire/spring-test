package com.github.hotire.springtest.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.context.TestConstructor.AutowireMode;
import org.springframework.test.web.client.MockRestServiceServer;

import lombok.RequiredArgsConstructor;

@RestClientTest(DetailsServiceClient.class)
@TestConstructor(autowireMode = AutowireMode.ALL)
@RequiredArgsConstructor
class DetailsServiceClientTest {
    private final DetailsServiceClient client;
    private final MockRestServiceServer server;

    @Test
    void getUserDetails() {
        // when
        server.expect(requestTo("/hotire/details"))
                   .andRespond(withSuccess("hello", MediaType.APPLICATION_JSON));
        final String result = client.getUserDetails("hotire");

        // then
        assertThat(result).isEqualTo("hello");
    }
}