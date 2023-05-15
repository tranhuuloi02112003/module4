package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// đánh dấu lớp GreetingController là một controller (đối tượng sẽ xử lý các request)
@Controller
public class GreetingController {
    // đánh dấu phương thức greeting() là một phương thức dùng để xử lý request khi
    // có một request GET được gửi đến đường dẫn "/greeting".urlpatten
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model model){
        model.addAttribute("name",name);
        return "index";
    }
}
