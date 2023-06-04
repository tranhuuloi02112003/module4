package com.example.music.service;

import com.example.music.entity.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findList();
    void create(Music music);
    void update(Music music);

    void delete(int id);
     Music findById(int id);
}
