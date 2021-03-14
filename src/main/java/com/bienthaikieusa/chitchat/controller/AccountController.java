package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.Account;
import com.bienthaikieusa.chitchat.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/account/{account_id}")
    private Optional<Account> findAccountByID(@PathVariable("account_id") String id){
        return accountService.findAccountByID(id);
    }
}
