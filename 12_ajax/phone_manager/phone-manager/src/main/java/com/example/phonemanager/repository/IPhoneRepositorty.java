package com.example.phonemanager.repository;

import com.example.phonemanager.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhoneRepositorty extends JpaRepository<Phone,Long> {

}
