package com.example.blog.service.impl;

import com.example.blog.entity.Category;
import com.example.blog.repository.ICategoryRepository;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository repository;

    @Override
    public void createCategory(Category category) {
        repository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) repository.findAll();
    }

    @Override
    public void create(Category category) {
        repository.save(category);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Category category) {
        repository.save(category);
    }

    @Override
    public Category findById(int id) {
        return repository.findById(id).orElse(null);
    }

}
