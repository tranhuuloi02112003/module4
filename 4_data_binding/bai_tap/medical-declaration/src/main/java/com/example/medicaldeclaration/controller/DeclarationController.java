package com.example.medicaldeclaration.controller;

import com.example.medicaldeclaration.model.Declaration;
import com.example.medicaldeclaration.repository.IDeclarationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeclarationController {
    @Autowired
    private IDeclarationRepository repository;

    @GetMapping("/a")
    public String home(Model model) {
        model.addAttribute("declaration", new Declaration());
        model.addAttribute("listNationality", repository.nationality());
        model.addAttribute("listDayOfBirth", repository.dayOfBirth());
        model.addAttribute("listVehicle", repository.vehicle());
        return "index";
    }

    @PostMapping("/declaration")
    public String result(@ModelAttribute("declaration") Declaration declaration, Model model) {
        model.addAttribute("declaration", declaration);
        return "result";
    }


}
