package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Dockerized Spring Boot!";
    }

    @GetMapping("/page1")
    public String page1() {
        return "Welcome to JSB Page 1!";
    }
}