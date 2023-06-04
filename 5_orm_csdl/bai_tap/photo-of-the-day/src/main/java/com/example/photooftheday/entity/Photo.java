package com.example.photooftheday.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Photo {

    @Id
    private int id;
    @Column (name = "name_author")
    private String nameAuthor;
    @Column (name = "feed_back")
    private String feedBack;
    private String comment;

    public Photo() {
    }

    public Photo(int id, String nameAuthor, String feedBack, String comment) {
        this.id = id;
        this.nameAuthor = nameAuthor;
        this.feedBack = feedBack;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
