package com.example.medicaldeclaration.controller;

import com.example.medicaldeclaration.model.Declaration;
import com.example.medicaldeclaration.service.IDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeclarationController {
    @Autowired
    private IDeclarationService service;
    @GetMapping("")
    public String home(Model model){
        model.addAttribute("declaration", service.findAll());
        return "list";
    }

    @GetMapping("create")
    public String showCreate(Model model){
        model.addAttribute("declaration", new Declaration());
        return "create";
    }


}
