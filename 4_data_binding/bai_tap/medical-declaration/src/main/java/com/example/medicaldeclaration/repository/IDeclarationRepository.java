package com.example.medicaldeclaration.repository;

import com.example.medicaldeclaration.model.Declaration;

import java.util.List;

public interface IDeclarationRepository {
    List<String> nationality();

    List<String> dayOfBirth();

    List<String> vehicle();
}
