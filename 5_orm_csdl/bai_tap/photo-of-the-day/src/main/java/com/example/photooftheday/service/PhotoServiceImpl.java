package com.example.photooftheday.service;

import com.example.photooftheday.entity.Photo;
import com.example.photooftheday.repositoryJPA.IPhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhotoServiceImpl implements IPhotoService{
    @Autowired
    private IPhotoRepository repository;
    @Override
    public void create(Photo photo) {
        repository.create(photo);
    }

    @Override
    public List<Photo> showAll() {
        return repository.showAll();
    }

    @Override
    public List<Photo> findAllToday(String date) {
        return repository.findAllToday(date);
    }

    @Override
    public void addLike(Photo photo) {
        repository.addLike(photo);
    }



    @Override
    public Photo findById(int id) {
        return repository.findById(id);
    }
}
