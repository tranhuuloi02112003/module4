package com.example.electronicmailbox.repository;

import com.example.electronicmailbox.model.MailBox;

import java.util.List;

public interface IMailBoxRepository {
    List<MailBox> findAll();
    MailBox findById(int id);

    List<String> showListLanguages();

    List<Integer> showListPageSize();

    boolean updateMainBox(MailBox mailBox);
}
