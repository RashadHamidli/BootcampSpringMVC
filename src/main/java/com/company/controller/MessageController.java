package com.company.controller;

import com.company.model.Message;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.DispatcherServlet;

@RestController
@RequestMapping("/app")
public class MessageController {
    @GetMapping("/message")
    public String index(ModelMap modelMap) {
        Message message = new Message();
        message.setMessage("Merhaba Spring MVC! test");
        modelMap.addAttribute("message", message.getMessage());
        return message.getMessage();
    }
}
