package com.company.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class TestController {

    @RequestMapping(path = "/test")
    public ResponseEntity<String> test1(@RequestParam(value = "id", required = false, defaultValue = "1234") long id) {
        return ResponseEntity.ok(String.valueOf(id));
    }
}
