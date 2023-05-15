package com.example.chuyen_doi_tien_te.controller;

import com.example.chuyen_doi_tien_te.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {
    @Autowired
    private ICurrencyService service;
    @GetMapping("")
    public String home(){
        return "index";
    }

    @PostMapping("currency")
    public String conver(@RequestParam double usd, Model model){
        model.addAttribute("result",service.usdToVnd(usd));
        model.addAttribute("usd",usd);
        return "index";
    }

}
