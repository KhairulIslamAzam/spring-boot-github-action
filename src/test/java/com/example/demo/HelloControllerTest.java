package com.example.demo;

import com.example.demo.controller.HelloController;
import com.example.demo.service.HelloService;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

    @Test
    void testHelloEndpoint() {
        HelloService helloService = new HelloService();
        HelloController controller = new HelloController(helloService);
        assertThat(controller).isNotNull();
    }
}
