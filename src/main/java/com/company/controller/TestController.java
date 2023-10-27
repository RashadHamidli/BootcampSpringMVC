package com.company.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "test printed";
    }

    @RequestMapping({"/page", "/{id}"})
    public ResponseEntity<String> test2(@PathVariable(value = "id", required = false) long id) {
        return ResponseEntity.ok("hello test");
    }
}
