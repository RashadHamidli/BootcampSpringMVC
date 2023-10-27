package com.company.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class TestController {

    @RequestMapping(path = "/test")
    public ResponseEntity<String> test1(@PathVariable(value = "id", required = false) long id) {
        return ResponseEntity.ok("hello test1");
//    }
//    @RequestMapping("/{id}")
//    public ResponseEntity<String> test2(@PathVariable(required = false) long id) {
//        return ResponseEntity.ok("hello test2");
//    }

//    @RequestMapping("/{id}")
//    public ResponseEntity<String> test3(@PathVariable(value = "id", required = false) long l) {
//        return ResponseEntity.ok("hello test3");
    }
}
