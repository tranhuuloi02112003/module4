package com.example.songinfo.repository;

import com.example.songinfo.entity.Song;
import org.springframework.data.repository.CrudRepository;

public interface ISongRepository extends CrudRepository<Song,Integer> {
}
