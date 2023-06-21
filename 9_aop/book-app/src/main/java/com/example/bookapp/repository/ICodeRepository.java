package com.example.bookapp.repository;

import com.example.bookapp.entity.Code;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ICodeRepository extends JpaRepository<Code,Integer> {
    @Query(value = "select c from  Code c where c.book.bookId=:id")
    List<Code> findAllCodeByBookId(@RequestParam("id") int id);
}
