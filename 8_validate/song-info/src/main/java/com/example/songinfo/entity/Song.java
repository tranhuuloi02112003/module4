package com.example.songinfo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Song {
    @Id
    private int id;

    @Column (name = "song_name")
    @NotBlank( message = "Tên bài hát k dc để trống")
    @Size(max = 800)
    @Pattern(regexp =  "^[a-zA-Z0-9]+$")
    private String songName;

    @NotBlank( message = "Tên nghệ sĩ k dc để trống")
    @Size(max = 300)
    @Pattern(regexp =  "^[a-zA-Z0-9]+$")
    private String singer;

    @NotBlank( message = "Tên loại k dc để trống")
    @Size(max = 1000)
    @Pattern(regexp =  "^[a-zA-Z0-9,]+$")
    private String category;

    public Song() {
    }

    public Song(int id, String songName, String singer, String category) {
        this.id = id;
        this.songName = songName;
        this.singer = singer;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
