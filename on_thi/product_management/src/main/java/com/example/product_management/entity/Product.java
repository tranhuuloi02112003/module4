package com.example.product_management.entity;


import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    @NotBlank(message = "name k dc trống")
    private String name;
    @Min(value = 1,message ="SL phải lớn hơn 1")
    private int quantity;
    @Range(message = "GT phải lớn hơn 1 nhỏ 1000000",min = 1,max = 100000)
    private double price;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateRelease;
    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "category_id")
    private Category category;

    public Product() {
    }

    public Product(Integer id, String name, int quantity, double price, Date dateRelease, Category category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.dateRelease = dateRelease;
        this.category = category;
    }

    public Product(String name, int quantity, double price, Date dateRelease, Category category) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.dateRelease = dateRelease;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date dateRelease) {
        this.dateRelease = dateRelease;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

