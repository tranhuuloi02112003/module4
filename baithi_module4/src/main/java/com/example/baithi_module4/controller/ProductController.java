package com.example.baithi_module4.controller;

import com.example.baithi_module4.entity.Product;
import com.example.baithi_module4.service.ICategoryService;
import com.example.baithi_module4.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/list")
    public String listPaging(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Page<Product> list = iProductService.findAll(PageRequest.of(page, 2));
//        model.addAttribute("categories", iCategoryService.findAll());
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
    public String doCreate(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("categories", iCategoryService.findAll());
            return "/create";
        }
        iProductService.create(product);
        return "redirect:/list";
    }

    @PostMapping("/search")
    public String doSearch(Model model,
                           @RequestParam("searchByTenSP") String searchByTenSP,
                           @RequestParam(name = "page", defaultValue = "0") int page) {
        model.addAttribute("products", iProductService.searchByName(searchByTenSP, PageRequest.of(page, 4)));

        return "/list";
    }
    @PostMapping("/searchPrice")
    public String doSearchPrice(Model model,
                           @RequestParam("searchByPrice") String searchByPrice,
                           @RequestParam(name = "page", defaultValue = "0") int page) {
        model.addAttribute("products", iProductService.searchByPrice(searchByPrice, PageRequest.of(page, 4)));
        return "/list";
    }


    @GetMapping("/delete")
    public String doDelete(Model model, @RequestParam("id") int id) {
        iProductService.deleteById(id);
        return "redirect:/list";
    }
}
