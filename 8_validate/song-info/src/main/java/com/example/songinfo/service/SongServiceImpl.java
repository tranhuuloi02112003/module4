package com.example.songinfo.service;

import com.example.songinfo.entity.Song;
import com.example.songinfo.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongServiceImpl implements ISongService{
    @Autowired
    private ISongRepository repository;

    @Override
    public void create(Song song) {
        repository.save(song);
    }

    @Override
    public List<Song> findAll() {
        return (List<Song>) repository.findAll();
    }

    @Override
    public void update(Song song) {
        repository.save(song);
    }

    @Override
    public Song findById(int id) {
        return repository.findById(id).orElse(null);
    }
}
