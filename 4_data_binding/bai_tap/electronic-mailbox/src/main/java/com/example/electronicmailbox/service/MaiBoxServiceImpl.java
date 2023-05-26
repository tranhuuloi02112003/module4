package com.example.electronicmailbox.service;

import com.example.electronicmailbox.model.MailBox;
import com.example.electronicmailbox.repository.IMailBoxRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MaiBoxServiceImpl implements IMailBoxService{
    @Autowired
    private IMailBoxRepository repository;

    @Override
    public List<MailBox> findAll() {
        return repository.findAll();
    }

    @Override
    public List<String> showListLanguages() {
        return repository.showListLanguages();
    }

    @Override
    public List<Integer> showListPageSize() {
        return repository.showListPageSize();
    }

    @Override
    public boolean updateMainBox(MailBox mailBox) {
        return repository.updateMainBox(mailBox);
    }

    @Override
    public MailBox findById(int id) {
        return repository.findById(id);
    }
}
