package com.example.electronicmailbox.controller;

import com.example.electronicmailbox.model.MailBox;
import com.example.electronicmailbox.service.IMailBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("mailBox")
public class MailBoxController {
    @Autowired
    private IMailBoxService service;

    @GetMapping("list")
    public String showList(Model model){
        model.addAttribute("listMainBox",service.findAll());
        return "list";
    }
    @GetMapping("update/{id}")
    public String showFormUpdate(@PathVariable int id, Model model){
        model.addAttribute("listPageSize",service.showListPageSize());
        model.addAttribute("listLanguages",service.showListLanguages());
        model.addAttribute("mailBox",service.findById(id));
        return "update";
    }
    @PostMapping("update")
    public String updateMailBox(@ModelAttribute("mailBox") MailBox mailBox ,Model model){
        service.updateMainBox(mailBox);
        return "redirect:/mailBox/list";
    }
}
