package com.example.demo.service;

import com.example.demo.dto.HelloResponse;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloResponse getGreeting(String name) {
        return new HelloResponse("Hello, " + name + "!");
    }
}
