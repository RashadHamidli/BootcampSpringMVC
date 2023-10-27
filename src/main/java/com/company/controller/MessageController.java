package com.company.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/app")
public class MessageController {
    @GetMapping("/a{id}")
    public ResponseEntity<String> msg(@ModelAttribute(value = "id") Long id) {
        return ResponseEntity.ok(String.valueOf(id));
    }
}
