package com.example.formdk.controller;

import com.example.formdk.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/")
    public String check(Model model) {
        model.addAttribute("user", new User());
        return "/view";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            System.out.println("Lỗi");
            return "/view";
        }
        return "/result";
    }
}
