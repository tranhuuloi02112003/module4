package com.example.baithi_module4.repository;

import com.example.baithi_module4.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
