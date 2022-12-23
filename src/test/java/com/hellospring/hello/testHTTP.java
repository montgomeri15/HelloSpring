package com.hellospring.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class testHTTP {
    @LocalServerPort private int port;
    @Autowired private TestRestTemplate testRestTemplate;

    @Test
    void testHTTPResponse() {
        String helloTest = "Hello Spring!";
        assertThat(testRestTemplate.getForObject("http://localhost:" + port + "/", String.class))
                .isEqualTo(helloTest);
    }
}
