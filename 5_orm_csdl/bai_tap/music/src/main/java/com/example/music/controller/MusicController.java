package com.example.music.controller;

import com.example.music.entity.Music;
import com.example.music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MusicController {
    @Autowired
    private IMusicService service;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("list", service.findList());
        return "/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("music", new Music());
        return "/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute("music") Music music) {
        service.create(music);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        service.delete(id);
        return "redirect:/list";
    }
    @GetMapping("/update/{id}")
    public String showUpdate(Model model,@PathVariable("id") int id){
        model.addAttribute("music",service.findById(id));
        return "/update";
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("music")Music music ){
        service.update(music);
        return "redirect:/list";
    }


}
