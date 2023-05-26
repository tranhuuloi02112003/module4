package com.example.electronicmailbox.repository;

import com.example.electronicmailbox.model.MailBox;

import java.util.ArrayList;
import java.util.List;

public class MailBoxRepositoryImpl implements IMailBoxRepository {

    private static List<MailBox> list;
    private static List<String> listLanguages;
    private static List<Integer> listPageSize;


    static {
        list = new ArrayList<>();
        list.add(new MailBox(1, "English", 5, true, "Abc"));
        list.add(new MailBox(2, "Vietnamese", 10, false, "Cde"));
        list.add(new MailBox(3, "Japanese", 15, false, "Xyz"));
        list.add(new MailBox(4, "Chinese", 20, true, "Mnk"));
        listLanguages = new ArrayList<>();
        listLanguages.add("English");
        listLanguages.add("Vietnamese");
        listLanguages.add("Japanese");
        listLanguages.add("Chinese");
        listPageSize = new ArrayList<>();
        listPageSize.add(5);
        listPageSize.add(10);
        listPageSize.add(15);
        listPageSize.add(20);
        listPageSize.add(25);
        listPageSize.add(50);
        listPageSize.add(100);
    }

    @Override
    public List<MailBox> findAll() {
        return list;
    }

    @Override
    public MailBox findById(int id) {
        for (MailBox box : list) {
            if (box.getId() == id) {
                return box;
            }
        }
        return null;
    }

    @Override
    public List<String> showListLanguages() {
        return listLanguages;
    }

    @Override
    public List<Integer> showListPageSize() {
        return listPageSize;
    }

    @Override
    public void updateMainBox(MailBox mailBox) {
        for (MailBox box: list) {
            if (box.getId()==mailBox.getId()){
                box.setLanguages(mailBox.getLanguages());
                box.setSignature(mailBox.getSignature());
                box.setSpamsFilter(mailBox.isSpamsFilter());
                box.setPageSize(mailBox.getPageSize());
            }
        }
    }
}
