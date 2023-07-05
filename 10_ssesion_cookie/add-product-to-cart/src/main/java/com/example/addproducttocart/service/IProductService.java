package com.example.addproducttocart.service;

import com.example.addproducttocart.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);

    //Lớp Optional trong Java được giới thiệu để cung cấp một giải pháp cấp độ loại cho việc đại diện cho các
    // giá trị tùy chọn thay vì tham chiếu null1. Mục đích của lớp này là để cung cấp một kiểu trả về có thể
    // đại diện cho sự vắng mặt của giá trị trong các tình huống mà trả về null có thể gây ra lỗi không mong
    // muốn, chẳng hạn như lỗi NullPointerException nổi tiếng

}
