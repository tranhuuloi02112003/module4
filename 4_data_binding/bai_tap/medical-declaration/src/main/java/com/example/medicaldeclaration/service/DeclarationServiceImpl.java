package com.example.medicaldeclaration.service;

import com.example.medicaldeclaration.model.Declaration;
import com.example.medicaldeclaration.repository.IDeclarationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeclarationServiceImpl implements IDeclarationService{
    @Autowired
    private IDeclarationRepository repository;

    @Override
    public List<Declaration> findAll() {
        return repository.findAll();
    }

    @Override
    public void create(Declaration declaration) {
        repository.create(declaration);
    }
}
