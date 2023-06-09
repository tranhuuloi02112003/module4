package com.example.product_management.controller;

import com.example.product_management.entity.Product;
import com.example.product_management.service.ICategoryService;
import com.example.product_management.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
//    @Autowired
//    private IProductService iProductService;
    
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/list")
    public String listPaging(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Page<Product> list = iProductService.findAllWithPaging(PageRequest.of(page, 4));
        model.addAttribute("products", list);
        return "/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", iCategoryService.findAll());
        return "/create";
    }

    @PostMapping("/create")
    public String doCreate(Model model, @ModelAttribute("product") Product product) {
        iProductService.create(product);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String doDelete(Model model, @PathVariable("id") int id) {
        iProductService.deleteById(id);
        return "redirect:/list";
    }

    @GetMapping("/update/{id}")
    public String showUpdate(Model model, @PathVariable("id") int id) {
        model.addAttribute("product", iProductService.findById(id));
        model.addAttribute("categories", iCategoryService.findAll());
        return "/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("product") Product product) {
        iProductService.update(product);
        return "redirect:/list";
    }
    @GetMapping("/detail/{id}")
    public String showDetail(Model model, @PathVariable("id") int id) {
        model.addAttribute("product", iProductService.findById(id));
        return "/detail";
    }



}
