package com.example.bookapp.service;

import com.example.bookapp.entity.Code;

import java.util.List;

public interface ICodeService {
    List<Code> findAllCodeByBookId(int id);
    void save(Code code);
}
