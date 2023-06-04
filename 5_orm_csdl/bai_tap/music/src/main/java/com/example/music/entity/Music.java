package com.example.music.entity;

import javax.persistence.*;

@Entity
@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name_music")
    private String nameMusic;
    @Column(name = "name_singer")
    private String nameSinger;//ca sĩ
    private String category;
    private String url;

    public Music() {
    }

    public Music(int id, String nameMusic, String nameSinger, String category, String url) {
        this.id = id;
        this.nameMusic = nameMusic;
        this.nameSinger = nameSinger;
        this.category = category;
        this.url = url;
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
}
