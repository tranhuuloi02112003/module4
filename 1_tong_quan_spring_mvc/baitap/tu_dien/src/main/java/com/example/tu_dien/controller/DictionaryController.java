package com.example.tu_dien.controller;

import com.example.tu_dien.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    IDictionaryService service;
    @GetMapping("")
    public String pandemic(){
        return "index";
    }
    @PostMapping("dictionary")
    public String dictionary(@RequestParam String english, Model model){
        model.addAttribute("english",english);
        model.addAttribute("vns",service.change(english));
        return "index";
    }
}
