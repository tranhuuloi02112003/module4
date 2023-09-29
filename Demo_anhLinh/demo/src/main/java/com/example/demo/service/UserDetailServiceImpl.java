package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.entity.AccountRole;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.AccountRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountRoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByAccountName(username);
        if (account == null) {
            throw new UsernameNotFoundException("Account " + username + " không tồn tại");
        }

        List<AccountRole> accountRoles = roleRepository.findAllByAccount(account);
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (AccountRole accountRole: accountRoles) {
            authorities.add(new SimpleGrantedAuthority(accountRole.getRole().getRoleName()));
        }

        return new User(username, account.getPassword(), authorities);
    }
}
