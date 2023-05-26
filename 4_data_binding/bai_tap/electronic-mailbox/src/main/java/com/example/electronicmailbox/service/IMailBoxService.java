package com.example.electronicmailbox.service;

import com.example.electronicmailbox.model.MailBox;

import java.util.List;

public interface IMailBoxService {
    List<MailBox> findAll();
    List<String>showListLanguages();
    List<Integer>showListPageSize();
    boolean updateMainBox(MailBox mailBox);
    MailBox findById(int id);
}
