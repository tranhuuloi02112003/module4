package com.example.demo.repository;

import com.example.demo.entity.Account;
import com.example.demo.entity.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRoleRepository extends JpaRepository<AccountRole, Long> {
    List<AccountRole> findAllByAccount(Account account);
}
