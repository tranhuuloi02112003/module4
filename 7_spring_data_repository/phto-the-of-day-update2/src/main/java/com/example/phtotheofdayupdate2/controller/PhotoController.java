package com.example.phtotheofdayupdate2.controller;


import com.example.phtotheofdayupdate2.entity.Photo;
import com.example.phtotheofdayupdate2.service.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class PhotoController {
    @Autowired
    private IPhotoService service;

    @GetMapping("/view")
    public String view(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate=LocalDate.now();
        String today=localDate.format(dateTimeFormatter);
        model.addAttribute("photos",service.findAllTodayPaging(today, PageRequest.of(page,3)));
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
