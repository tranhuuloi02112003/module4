package com.example.baithi_module4.service;

import com.example.baithi_module4.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);
    void create(Product product);
    void deleteById(int id);
    void update(Product product);
    Product findById(int id);
//    Page<Product> search(String searchByLoaiSP,String searchByTenSP,Double searchByPrice,Pageable pageable);
//    Page<Product> searchByNameAndPrice(String searchByTenSP,String searchByPrice,Pageable pageable);



    Page<Product> searchByName(String searchByName, Pageable p);


    Page<Product> searchByPrice(String searchByPrice, Pageable of);
}
