package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.DTO.LoanDTO;
import com.bienthaikieusa.chitchat.model.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getTransactionByTransID(Long transID);
}
