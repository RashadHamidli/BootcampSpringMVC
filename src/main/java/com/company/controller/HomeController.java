package com.company.controller;

import com.company.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index(ModelMap modelMap) {
        Message message = new Message();
        message.setMessage("Hello Spring MVC!");
        modelMap.addAttribute("message", message.getMessage());
        return "index";
    }
}
