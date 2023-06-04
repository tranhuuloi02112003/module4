package com.example.medicaldeclaration.repository;

import com.example.medicaldeclaration.model.Declaration;

import java.util.List;

public interface IDeclarationRepository {
    List<Declaration> findAll();

    void create(Declaration declaration);
}
