package com.example.music.service;

import com.example.music.entity.Music;
import com.example.music.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements IMusicService {
    @Autowired
    private IMusicRepository repository;

    @Override
    public List<Music> findList() {
        return repository.findList();
    }

    @Override
    public void create(Music music) {
        repository.create(music);
    }

    @Override
    public void update(Music music) {
        repository.update(music);
    }

    @Override
    public void delete(int id ) {
        repository.delete(id);
    }

    @Override
    public Music findById(int id) {
        return repository.findById(id);
    }
}
