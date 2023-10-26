package com.company.controller;

import com.company.model.Message;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MessageController {
    @GetMapping("/message1")
    public String index() {
        Message message = new Message();
        message.setMessage("Hello Spring MVC! message 1");
        return message.getMessage();
    }
    @GetMapping("/message2")
    public String index2() {
        Message message = new Message();
        message.setMessage("Hello Spring MVC! message 2");
        return message.getMessage();
    }
    @GetMapping("/message3")
    public String index3() {
        Message message = new Message();
        message.setMessage("Hello Spring MVC! message 3");
        return message.getMessage();
    }
}
