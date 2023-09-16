package com.example.v2basicconcept.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Hello Controller", description = "The first controller!")
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "hello", description = "The first method!")
    public String hello() {
        return "Hello Newcomers!";
    }
}
