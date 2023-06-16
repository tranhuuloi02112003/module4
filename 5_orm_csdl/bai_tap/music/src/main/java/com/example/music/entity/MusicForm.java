package com.example.music.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;



public class MusicForm {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name_music")
    private String nameMusic;
    @Column(name = "name_singer")
    private String nameSinger;
    private String category;
    private String url;
    private MultipartFile play;

    public MusicForm() {
    }

    public MusicForm(int id, String nameMusic, String nameSinger, String category, String url, MultipartFile play) {
        this.id = id;
        this.nameMusic = nameMusic;
        this.nameSinger = nameSinger;
        this.category = category;
        this.url = url;
        this.play = play;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MultipartFile getPlay() {
        return play;
    }

    public void setPlay(MultipartFile play) {
        this.play = play;
    }
}

