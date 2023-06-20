package com.example.phtotheofdayupdate2.service;

import com.example.phtotheofdayupdate2.entity.Photo;

import java.util.List;

public interface IPhotoService {
    void create(Photo photo);
    List<Photo> showAll();
    List<Photo> findAllToday(String date);

    void addLike(Photo photo);


    Photo findById(int id);
}
