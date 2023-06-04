package com.example.blog.service;

import com.example.blog.entity.Blog;
import com.example.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements IBlogService{
    @Autowired
    private IBlogRepository repository;
    @Override
    public List<Blog> findAll() {
        return (List<Blog>) repository.findAll();
    }

    @Override
    public void create(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Blog blog) {
        repository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return repository.findById(id).orElse(null);
    }
}
