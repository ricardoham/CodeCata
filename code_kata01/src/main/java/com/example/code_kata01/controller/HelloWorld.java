package com.example.code_kata01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloWorld {

    @GetMapping("/hello")
    ResponseEntity<String> getHelloWorld() {
        return ResponseEntity.ok("Hello, world!");
    }
}
