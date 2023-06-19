package com.example.songinfo.controller;

import com.example.songinfo.entity.Song;
import com.example.songinfo.service.ISongService;
import com.example.songinfo.validate.SongValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class SongController {
    @Autowired
    ISongService iSongService;
    @GetMapping("/list")
    public String findAll(Model model){
        model.addAttribute("songs",iSongService.findAll());
        return "/list";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("song",new Song());
        return "/create";
    }
    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("song") Song song, BindingResult bindingResult,Model model){
        SongValidate validate = new SongValidate();
        if (iSongService.findById(song.getId())!=null){
            validate.validate(song, bindingResult);
        }
        if (bindingResult.hasFieldErrors()){
            return "/create";
        }
        iSongService.create(song);
        return "redirect:/list";
    }
    @GetMapping("/update{id}")
    public String showUpdate(Model model, @PathVariable("id") int id){
        Song  song= iSongService.findById(id);
        model.addAttribute("song",song);
        return "/update";
    }
    @PostMapping("/update")
    public String doUpdate(Model model,@ModelAttribute("song") Song song){
        iSongService.update(song);
        return "redirect:/list";
    }
}
//validate.SongValidate.validate(SongValidate.java:26)