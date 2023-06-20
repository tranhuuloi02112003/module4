package com.example.phtotheofdayupdate2.controller;


import com.example.phtotheofdayupdate2.entity.Photo;
import com.example.phtotheofdayupdate2.service.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class PhotoController {
    @Autowired
    private IPhotoService service;

    @GetMapping("/view")
    public String view(Model model) {
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate=LocalDate.now();
        String today=localDate.format(dateTimeFormatter);
        model.addAttribute("photos",service.findAllToday(today));
        model.addAttribute("photo", new Photo());
        return "/view";
    }
    @PostMapping("/create")
    public String doCreate(Model model, @ModelAttribute("photo") Photo photo){
        service.create(photo);
        return "redirect:/view";
    }
    @GetMapping("/likeComment{id}")
    public String likeComment(Model model,@PathVariable("id") int id){
        service.addLike(service.findById(id));
        return  "redirect:/view";
    }

//

}
