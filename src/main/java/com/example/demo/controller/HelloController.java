package com.example.demo.controller;

import com.example.demo.dto.HelloResponse;
import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public HelloResponse sayHello(@RequestParam(defaultValue = "World") String name) {
        return helloService.getGreeting(name);
    }
}
