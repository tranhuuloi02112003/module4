package com.example.music.repository;

import com.example.music.entity.Music;

import java.util.List;

public interface IMusicRepository {

    List<Music> findList();

    void create(Music music);

    void update(Music music);

    void delete(int id);
    Music findById(int id);
}
