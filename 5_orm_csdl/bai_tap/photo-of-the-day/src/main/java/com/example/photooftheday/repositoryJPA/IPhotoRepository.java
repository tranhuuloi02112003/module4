package com.example.photooftheday.repositoryJPA;

import com.example.photooftheday.entity.Photo;

import java.util.List;

public interface IPhotoRepository {
    void create(Photo photo);
    List<Photo> showAll();

    void addLike(Photo photo);


    Photo findById(int id);

    List<Photo> findAllToday(String date);
}
