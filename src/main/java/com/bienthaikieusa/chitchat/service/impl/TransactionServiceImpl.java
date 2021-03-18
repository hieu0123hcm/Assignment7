package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.Transaction;
import com.bienthaikieusa.chitchat.repository.TransactionRepository;
import com.bienthaikieusa.chitchat.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public List<Transaction> getTransactionByTransID(Long transID) {
        return transactionRepository.findByLoanId(transID);
    }

    @Override
    public void save(Transaction transaction) {
        transactionRepository.save(transaction);
    }
}
