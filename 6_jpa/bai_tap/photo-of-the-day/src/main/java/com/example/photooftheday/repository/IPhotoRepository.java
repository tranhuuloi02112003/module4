package com.example.photooftheday.repository;

import com.example.photooftheday.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IPhotoRepository extends JpaRepository<Photo, Integer> {

    @Query(value = "select p from Photo p  where p.date = :date")
    List<Photo> findAllToday(@Param("date") String date);


}
