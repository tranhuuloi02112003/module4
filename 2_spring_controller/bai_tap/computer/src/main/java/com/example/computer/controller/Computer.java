package com.example.computer.controller;

import com.example.computer.service.IServiceComputer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Computer {
    @Autowired
    IServiceComputer serviceComputer;
    @GetMapping("")
    public String home(){
        return "home";
    }

    @PostMapping("caculator")
    public String caculator(@RequestParam("item1") double item1, @RequestParam("item2") double item2,
                            @RequestParam("calculation") String calculation, Model model) {
        model.addAttribute("item1",item1);
        model.addAttribute("item2",item2);
        model.addAttribute("result", serviceComputer.caculator(item1, item2, calculation));
        return "home";
    }
}
