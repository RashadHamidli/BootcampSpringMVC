package com.company.controller;

import com.company.model.Message;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MessageController {
    @GetMapping("/message")
    public String index(ModelMap modelMap) {
        Message mesaj = new Message();
        mesaj.setMessage("Merhaba Spring MVC!");
//        modelMap.addAttribute("mesaj", mesaj.getMessage());
        return mesaj.getMessage();
    }
}
