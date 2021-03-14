package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Account;

import java.util.Optional;

public interface AccountService {

    Optional<Account> findAccountByID(String id);
}
