package com.example.productmanagement.repository;

import com.example.productmanagement.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findList();

    void create(Product product);

    void update(Product product);

    void delete(Product product);

    Product findById(String id);

    Product findByName(String name);
}
