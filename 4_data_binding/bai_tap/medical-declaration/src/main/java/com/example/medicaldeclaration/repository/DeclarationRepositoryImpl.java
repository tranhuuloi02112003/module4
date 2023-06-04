package com.example.medicaldeclaration.repository;

import com.example.medicaldeclaration.model.Declaration;

import java.util.ArrayList;
import java.util.List;

public class DeclarationRepositoryImpl implements IDeclarationRepository{

    private List<Declaration> list= new ArrayList<>();

    @Override
    public List<Declaration> findAll() {
        return list;
    }

    @Override
    public void create(Declaration declaration) {
        list.add(declaration);
    }
}
