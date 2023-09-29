package com.example.baithi_module4.service.impl;

import com.example.baithi_module4.entity.Category;
import com.example.baithi_module4.repository.ICategoryRepository;
import com.example.baithi_module4.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;


    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }
}
