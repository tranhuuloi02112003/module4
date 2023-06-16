package com.example.blog.repository;

import com.example.blog.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category,Integer> {
}
