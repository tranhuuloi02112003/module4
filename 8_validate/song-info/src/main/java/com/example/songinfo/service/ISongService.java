package com.example.songinfo.service;

import com.example.songinfo.entity.Song;

import java.util.List;

public interface ISongService {
    void create(Song song);
    List<Song> findAll();
    void update(Song song);
    Song findById(int id);

}
