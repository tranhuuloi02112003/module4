package com.example.medicaldeclaration.service;

import com.example.medicaldeclaration.model.Declaration;

import java.util.List;

public interface IDeclarationService {
    List<Declaration> findAll();
    void create(Declaration declaration);

}
