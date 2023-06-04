package com.example.photooftheday.controller;

import com.example.photooftheday.entity.Photo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhotoController {

    @GetMapping("/view")
    public String view(Model model){
        model.addAttribute("photo",new Photo());
        return "/view";
    }
}
