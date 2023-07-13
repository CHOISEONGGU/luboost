package com.luboost.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String baw(Model model) {
        model.addAttribute("message", "hello git action");
        return "hello";
    }
}
