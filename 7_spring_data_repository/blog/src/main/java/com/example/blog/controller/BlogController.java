package com.example.blog.controller;

import com.example.blog.entity.Blog;
import com.example.blog.entity.Category;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;
    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("list", iBlogService.findAll());
        return "/list";
    }

    @GetMapping("/create/blog")
    public String showCreate(Model model){
        model.addAttribute("blog",new Blog());
        model.addAttribute("categories",iCategoryService.findAll());
        return "/create";
    }
    @PostMapping("/create/blog")
    public String doCreate(Model model,@ModelAttribute("blog") Blog blog){
        iBlogService.create(blog);
        return "redirect:/list";
    }

    @GetMapping("/create/category")
    public String showCreateCategory(Model model){
        model.addAttribute("category",new Category());
        return "/createCategory";
    }
    @PostMapping("/create/category")
    public String doCreateCategory(Model model,@ModelAttribute("category")Category category){
        iCategoryService.createCategory(category);
        return "redirect:/list";
    }
    @GetMapping("/update/{id}")
    public String showUpdate(@PathVariable("id")int id, Model model){
        model.addAttribute("blog", iBlogService.findById(id));
        model.addAttribute("listCategory",iCategoryService.findAll());
        return "/update";
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("blog") Blog blog){
        iBlogService.update(blog);
        return "redirect:/list";
    }
    @GetMapping("/updateCategory{categoryId}")
    public String showUpdateCategory(Model model,@PathVariable("categoryId") int categoryId){
        model.addAttribute("category",iCategoryService.findById(categoryId));
        return "/updateCategory";
    }
    @PostMapping("/updateCategory")
    public String doUpdateCategory(Model model,@ModelAttribute("category") Category category){
        iCategoryService.update(category);
        return "redirect:/showListCategory";
    }

    @GetMapping("/delete/{id}")
    public String doDelete(@PathVariable("id") int id){
        iBlogService.deleteById(id);
        return "redirect:/list";
    }
    @GetMapping("/deleteCategory{categoryId}")
    public String doDelete(Model model,@PathVariable("categoryId") int categoryId){
        iCategoryService.deleteById(categoryId);
        return "redirect:/showListCategory";
    }
    @GetMapping("/detail/{id}")
    public String showDetail(Model model,@PathVariable("id") int id ){
        model.addAttribute("blog", iBlogService.findById(id));
        return "/detail";
    }
    @GetMapping("/showListCategory")
    public String showListCategory(Model model){
        model.addAttribute("listCategory",iCategoryService.findAll());
        return "/listCategory";
    }
    @GetMapping("/listpaging")
    public String listPaging(@RequestParam(name = "page", defaultValue = "0") int page, Model model
//            Model model, @RequestParam("page")Optional <Integer> page,
//            @RequestParam("size") Optional<Integer> size,@RequestParam("sort") Optional<String> sort
    ){
//        int currentPage=page.orElse(1);
//        int pageSize=size.orElse(5);
//        String sortField=sort.orElse("content");
//        Sort sortBy=Sort.by("nameBlog").descending().and(Sort.by("content").ascending());
//        Page<Blog> blogs=iBlogService.findAllWithPaging
//                (PageRequest.of(currentPage-1,pageSize,Sort.by(sortField).ascending()));
//        model.addAttribute("blogs",blogs);
//
//        int totalPages = blogs.getTotalPages();
//        if (totalPages > 1) {
//            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
//                    .boxed()
//                    .collect(Collectors.toList());
//            model.addAttribute("pageNumbers", pageNumbers);
//        }

//        Sort sort = Sort.by("point").ascending().and(Sort.by("name_student"));
            Page<Blog> list = iBlogService.findAllWithPaging(PageRequest.of(page,4));
            model.addAttribute("listBlog", list);
        return "/listPaging";
    }

    @GetMapping(value = "/listpagingslice")
    public String listPagingSlice(Model model, @RequestParam("page") Optional<Integer> page,
                                  @RequestParam("size") Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        Slice<Blog> blogs = iBlogService.findAllWithSlice(PageRequest.of(currentPage - 1, pageSize));
        model.addAttribute("blogs", blogs.getContent());
        model.addAttribute("page", blogs);
        return "/listPagingSlice";
    }
    @PostMapping("/search")
    public String searchBlogByName(@RequestParam("nameSearch") String nameSearch,
                                   @RequestParam(name = "page", defaultValue = "0") int page, Model model){
        model.addAttribute("listBlog",iBlogService.searchByName(nameSearch,PageRequest.of(page,4)));
        return "redirect:/listPaging";

    }


}
