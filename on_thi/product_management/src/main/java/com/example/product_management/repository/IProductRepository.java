package com.example.product_management.repository;

import com.example.product_management.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select * from Product where name like :nameProduct", nativeQuery = true)
    Page<Product> searchByName(@Param("nameProduct") String nameProduct, Pageable p);
    @Query(value = "select * from Product where ( :searchByQuantity IS NOT NULL AND :searchByName IS NOT NULL AND name like :searchByName and quantity = :searchByQuantity) or (( :searchByQuantity IS NULL OR :searchByName IS NULL) AND ((quantity = :searchByQuantity and quantity is not null) or name like :searchByName) ) ", nativeQuery = true)
    Page<Product> searchByNameAndQuantity(@Param("searchByName") String searchByName,@Param("searchByQuantity") Integer searchByQuantity, Pageable p);

    @Query(value = "select p from Product p where p.price between :min and :max")
    List<Product> findProductByPrice(@Param("min") double min, @Param("max") double max);
}
