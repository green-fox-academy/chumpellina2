package com.greenfoxacademy.helloworld.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greetin")
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        return "greeting";
    }
}
