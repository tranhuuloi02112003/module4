package com.example.productmanagement.controller;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private IProductService service;

    @GetMapping("/list")
    String showList(Model model) {
        model.addAttribute("listProduct", service.findList());
        return "/list";
    }

    @GetMapping("/update/{id}")
    String showUpdate(Model model, @PathVariable("id") String id) {
        model.addAttribute("product", service.findById(id));
        return "/update";
    }

    @GetMapping("/delete/{id}")
    String doDelete(Model model, @PathVariable("id") String id) {
        service.delete(service.findById(id));
        return "redirect:/list";
    }

    @PostMapping("/update")
    String doUpdate(@ModelAttribute("product") Product product) {
        service.update(product);
        return "redirect:/list";
    }

    @GetMapping("/create")
    String showCreate(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/create")
    String doCreate(@ModelAttribute("product") Product product,Model model ) {
        service.create(product);
        return "redirect:/list";
    }
    @GetMapping("/detail/{id}")
    String showDetail(Model model,@PathVariable("id") String id){
        model.addAttribute("product",service.findById(id));
        return "/detail";
    }
    @PostMapping("/searchByName")
    String doSearch(@RequestParam("name") String name,Model model){
        List<Product> list= new ArrayList<>();
        list.add(service.findByName(name));
        model.addAttribute("listProduct",list);
        return "/list";
    }



}
