package com.example.phonemanager.service;

import com.example.phonemanager.entity.Phone;

import java.util.Optional;

public interface IPhoneService {
    Iterable<Phone> findAll();

    Optional<Phone> findById(Long id);

    Phone save(Phone smartPhone);

    void remove(Long id);
}
