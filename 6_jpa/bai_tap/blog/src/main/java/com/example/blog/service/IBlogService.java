package com.example.blog.service;

import com.example.blog.entity.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    void create(Blog blog);
    void deleteById(int id);
    void update(Blog blog);
    Blog findById(int id);
}
