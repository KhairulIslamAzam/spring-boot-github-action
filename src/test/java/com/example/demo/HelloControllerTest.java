package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

    @Test
    void testHelloEndpoint() {
        HelloController controller = new HelloController(name -> null);
        assertThat(controller).isNotNull();
    }
}
