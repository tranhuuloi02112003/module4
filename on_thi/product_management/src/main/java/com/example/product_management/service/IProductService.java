package com.example.product_management.service;

import com.example.product_management.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Page<Product> findAllWithPaging(Pageable pageable);
    void create(Product blog);
    void deleteById(int id);
    void update(Product product);
    Product findById(int id);
    Page<Product> searchByName(String nameProduct, Pageable p);
    List<Product> findProductByPrice(double min,double max);
    Page<Product> searchByNameAndByQuantity(String searchByName,Integer searchByQuantity, Pageable p);


}
