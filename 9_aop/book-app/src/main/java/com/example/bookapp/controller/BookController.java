package com.example.bookapp.controller;

import com.example.bookapp.entity.Book;
import com.example.bookapp.service.IBookService;
import com.example.bookapp.service.ICodeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    private ICodeService iCodeService;
    @Autowired
    private IBookService iBookService;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("books", iBookService.findAllBook());
        return "/list";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("book",new Book());
        return "/create";
    }
    @PostMapping("/create")
    public String doCreate(@ModelAttribute("book") Book book, BindingResult bindingResult, Model  model){
        if (bindingResult.hasFieldErrors()){
            return "/create";
        }
        iBookService.save(book);
        return "redirect:/list";
    }
    @GetMapping("/borrow")
    public String


}
