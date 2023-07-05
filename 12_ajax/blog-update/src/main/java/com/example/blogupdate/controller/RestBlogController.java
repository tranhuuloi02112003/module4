package com.example.blogupdate.controller;

import com.example.blogupdate.entity.Blog;
import com.example.blogupdate.entity.Category;
import com.example.blogupdate.service.IBlogService;
import com.example.blogupdate.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestBlogController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/listCategory")
    public ResponseEntity<List<Category>> findAllCategory(){
        List<Category>categories=iCategoryService.findAll();
        if (categories.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/listBlog")
    public ResponseEntity<List<Blog>> findAllBlog(){
        List<Blog>blogs=iBlogService.findAll();
        if (blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> findByBlogId(@PathVariable("id") int id){
        Blog blog= iBlogService.findById(id);
        if (blog==null){
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/category/{id}")
    public ResponseEntity<Category> findByCategoryId(@PathVariable("id") int id){
        Category category= iCategoryService.findById(id);
        if (category==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
          return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/search")
    public ResponseEntity<Page<Blog>> searchBlogByName(@RequestParam("name") String nameSearch,
                                   @RequestParam(name = "page", defaultValue = "0") int page) {
        Page<Blog> productList = iBlogService.searchByName(nameSearch,PageRequest.of(page,4));
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }




}
