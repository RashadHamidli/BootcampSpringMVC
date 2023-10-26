package com.company.controller;

import com.company.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controlle

public class EnterController {
    @GetMapping
    public String enter(ModelMap modelMap) {
        Message message = new Message();
        message.setMessage("Hello RequestMappingHandlerMappin");
        modelMap.addAttribute("message", message.getMessage());
        return "index";
    }
}
