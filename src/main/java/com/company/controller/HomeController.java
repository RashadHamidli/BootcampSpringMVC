package com.company.controller;

import com.company.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index() {
        return "form";
    }

    @PostMapping
    public ResponseEntity<?> sayfa(@ModelAttribute Message mesaj) {
        return ResponseEntity.ok(mesaj.getMessage());
    }

}
