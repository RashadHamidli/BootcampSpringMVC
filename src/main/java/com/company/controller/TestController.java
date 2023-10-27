package com.company.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;

@RestController
@RequestMapping("/app")
public class TestController {

    @RequestMapping(path = "/test{id}")
    public ResponseEntity<String> test1(@RequestParam(value = "id", required = false, defaultValue = "1234") long id) {
        return ResponseEntity.ok(String.valueOf(id));
    }

    @GetMapping("/sayfa")
    public ResponseEntity<?> sayfa(HttpServletRequest request, HttpSession httpSession) {
        boolean esit = request.getSession().equals(httpSession);
        return ResponseEntity.ok("Eşit" + (esit ? "tir" : "değildir."));
    }
    @GetMapping("/s")
    public ResponseEntity<?> sayfa(HttpServletRequest request, InputStream inputStream)
            throws Exception {
        boolean esit = request.getInputStream().equals(inputStream);
        return ResponseEntity.ok("Eşit" + (esit ? "tir" : "değildir."));
    }
}
