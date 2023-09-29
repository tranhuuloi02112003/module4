package com.example.baithi_module4.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    @Size(min = 5,max = 50 ,message = "Tên sản phẩm phải từ 5-50 ki tự")
    @NotBlank(message = "Tên sản phẩm k dc trống")
    private String name;
    @Min(value = 100000, message = "Giá phải lớn hơn hoặc bằng 100000")
    private Double price;
    @NotBlank(message = "Trạng thái k dc trống")
    private String status;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;


}
