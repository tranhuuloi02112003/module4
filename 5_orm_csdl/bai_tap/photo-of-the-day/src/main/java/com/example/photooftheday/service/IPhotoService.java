package com.example.photooftheday.service;

import com.example.photooftheday.entity.Photo;

import java.util.List;

public interface IPhotoService {
    void create(Photo photo);
    List<Photo> showAll();
    List<Photo> findAllToday(String date);

    void addLike(Photo photo);


    Photo findById(int id);
}
