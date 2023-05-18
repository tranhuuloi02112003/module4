package com.example.display_spice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping("")
    public String home(){
    return "home";
    }
    @PostMapping("sandwich")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        model.addAttribute("result", condiment);
        return "result";
    }

}
