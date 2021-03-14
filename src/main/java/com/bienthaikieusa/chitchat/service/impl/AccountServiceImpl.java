package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.Account;
import com.bienthaikieusa.chitchat.repository.AccountRepository;
import com.bienthaikieusa.chitchat.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository ;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Optional<Account> findAccountByID(String id) {
        return accountRepository.findById(id);
    }
}
