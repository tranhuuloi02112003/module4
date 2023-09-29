package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.entity.AccountRole;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.AccountRoleRepository;
import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    AccountRoleRepository accountRoleRepository;

    @GetMapping("/create")
    public String displayCreate(Model model){
        model.addAttribute("account", new Account());
        return "account/create";
    }

    @PostMapping("/create")
    public String doCreate(Model model, @ModelAttribute("account") Account account) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        account.setPassword(encoder.encode(account.getPassword()));
        accountRepository.save(account);
        return "index";
    }

    @GetMapping("/addRole")
    public String displayAddRole(Model model) {
        model.addAttribute("accountRole", new AccountRole());
        model.addAttribute("roles", roleRepository.findAll());
        model.addAttribute("accounts", accountRepository.findAll());
        return "/account/addRole";
    }

    @PostMapping("/addRole")
    public String doAddRole(@ModelAttribute("accountRole") AccountRole accountRole) {
        accountRoleRepository.save(accountRole);
        return "index";
    }
}
