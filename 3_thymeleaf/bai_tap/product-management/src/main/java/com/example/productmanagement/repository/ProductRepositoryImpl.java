package com.example.productmanagement.repository;

import com.example.productmanagement.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepositoryImpl implements IProductRepository {

    private static List<Product> list;

    static {
        list = new ArrayList<>();
        list.add(new Product("1", "Iphone 11", 10000000, "new", "IOS"));
        list.add(new Product("2", "Samsum s23", 15000000, "old", "Android"));
        list.add(new Product("3", "Oppo a71", 3000000, "new", "Android"));
        list.add(new Product("4", "Iphone 14", 19000000, "new", "IOS"));
        list.add(new Product("5", "Nokia 1280", 200000, "old", "Android"));
    }


    @Override
    public List<Product> findList() {
        return list;
    }

    @Override
    public void create(Product product) {
        list.add(product);
    }

    @Override
    public void update(Product product) {
        for (Product p : list) {
            if (p.getId().equals(product.getId())) {
                p.setId(product.getId());
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setProducer(product.getProducer());
                p.setDescribe(product.getDescribe());
                break;
            }
        }
    }

    @Override
    public void delete(Product product) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(product.getId())) {
                list.remove(i);
                break;
            }
        }
    }

    @Override
    public Product findById(String id) {
        for (Product p: list) {
            if (p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Product findByName(String name) {
        for (Product p: list) {
            if (p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
}
