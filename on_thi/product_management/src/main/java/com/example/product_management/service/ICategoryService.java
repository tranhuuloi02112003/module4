package com.example.product_management.service;

import com.example.product_management.entity.Category;
import com.example.product_management.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
//    Page<Product> findAllWithPaging(Pageable pageable);
    void create(Category category);
    void deleteById(int id);
    void update(Category category);
    Category findById(int id);
//    Page<Product> searchByName(String nameProduct, Pageable p);
//    List<Product> findProductByPrice(double min,double max);
}
