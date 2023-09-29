package com.example.baithi_module4.repository;

import com.example.baithi_module4.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
//    @Query(value = "select * from Product p join category c  on c.category_id=p.id where name like :searchByTenSP and price =searchByPrice and category_name like :searchByLoaiSP", nativeQuery = true)
//    Page<Product> search(@Param("searchByLoaiSP") String searchByLoaiSP,
//                         @Param("searchByTenSP") String searchByTenSP,
//                         @Param("searchByPrice") Double searchByPrice, Pageable p);
    @Query(value = "select * from Product where name like :s", nativeQuery = true)
    Page<Product> searchByName(@Param("s") String s, Pageable p);
    @Query(value = "select * from product  where price like %?%", nativeQuery = true)
    Page<Product> searchByPrice(String searchByPrice, Pageable of);


//    @Query(value = "select * from Product where select p.* from product p join category c  on c.category_id=p.id where name like :searchByTenSP and price =searchByPrice and category_name like :searchByLoaiSP", nativeQuery = true)
//    Page<Product> searchByNameAndPrice(@Param("searchByTenSP") String searchByTenSP,@Param("searchByPrice")String searchByPrice, Pageable pageable);
}
