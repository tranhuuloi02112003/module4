package com.example.baithi_module4.service.impl;

import com.example.baithi_module4.entity.Product;
import com.example.baithi_module4.repository.IProductRepository;
import com.example.baithi_module4.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public void create(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).orElse(null);
    }
//
//    @Override
//    public Page<Product> search(String searchByLoaiSP, String searchByTenSP, Double searchByPrice, Pageable pageable) {
//        return productRepository.search("%"+searchByLoaiSP+"%","%"+searchByTenSP+"%",+searchByPrice,pageable);
//    }
//
//    @Override
//    public Page<Product> searchByNameAndPrice(String searchByTenSP, String searchByPrice, Pageable pageable) {
////        return productRepository.searchByNameAndPrice("%"+searchByTenSP+"%",searchByPrice,pageable);
//        return null;
//    }

    @Override
    public Page<Product> searchByName(String searchByName, Pageable p) {
        return productRepository.searchByName("%"+searchByName+"%",p);
    }

    @Override
    public Page<Product> searchByPrice(String searchByPrice, Pageable of) {
        return productRepository.searchByPrice("%"+searchByPrice+"%",of);
    }




}
