package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestRoleController {
    @GetMapping("/role/index")
    public String indexRole(Model model, HttpServletRequest request) {
        model.addAttribute("accountName", request.getUserPrincipal().getName());
        return "role";
    }

    @GetMapping("/admin/index")
    public String admin() {
        return "admin";
    }

    @GetMapping("/accessDenied")
    public String denied() {
        return "denied";
    }
}
