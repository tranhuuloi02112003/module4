package com.example.product_management.service.impl;

import com.example.product_management.entity.Product;
import com.example.product_management.repository.IProductRepository;
import com.example.product_management.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;
    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Page<Product> findAllWithPaging(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public void create(Product blog) {
        iProductRepository.save(blog);
    }

    @Override
    public void deleteById(int id) {
        iProductRepository.deleteById(id);

    }

    @Override
    public void update(Product blog) {
        iProductRepository.save(blog);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Product> searchByName(String nameProduct, Pageable p) {

        return iProductRepository.searchByName("%"+nameProduct+"%",p);
    }

    @Override
    public List<Product> findProductByPrice(double min, double max) {
        return iProductRepository.findProductByPrice(min,max);
    }

    @Override
    public Page<Product> searchByNameAndByQuantity(String searchByName, Integer searchByQuantity, Pageable p) {
        return iProductRepository.searchByNameAndQuantity("%"+searchByName+"%",searchByQuantity,p);
    }
}
