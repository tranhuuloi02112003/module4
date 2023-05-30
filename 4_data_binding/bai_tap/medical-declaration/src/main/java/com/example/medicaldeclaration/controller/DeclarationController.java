package com.example.medicaldeclaration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeclarationController {
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("declaration",  );
        return "index";
    }

}
