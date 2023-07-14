package com.example.product_management.service.impl;

import com.example.product_management.entity.Category;
import com.example.product_management.repository.ICategoryRepository;
import com.example.product_management.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public void create(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public void deleteById(int id) {
        iCategoryRepository.deleteById(id);
    }

    @Override
    public void update(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public Category findById(int id) {
        return iCategoryRepository.findById(id).orElse(null);
    }
}
