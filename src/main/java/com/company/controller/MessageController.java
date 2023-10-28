package com.company.controller;

import com.company.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/app")
public class MessageController {
    @GetMapping("/aaa")
    @ResponseBody
    public Message index() {
        Message mesaj = new Message();
        mesaj.setMessage("Merhaba Spring MVC!");
        return mesaj;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> msg(@ModelAttribute(value = "id") Long id) {
        return ResponseEntity.ok(String.valueOf(id));
    }

    @GetMapping("/id")
    @ModelAttribute(value = "id")
    public ResponseEntity<String> message(Long id){
        return ResponseEntity.ok(String.valueOf(id));
    }
}
