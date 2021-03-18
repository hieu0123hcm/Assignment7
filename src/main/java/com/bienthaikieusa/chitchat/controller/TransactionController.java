package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.DTO.LoanDTO;
import com.bienthaikieusa.chitchat.model.Payment;
import com.bienthaikieusa.chitchat.model.Transaction;
import com.bienthaikieusa.chitchat.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @RequestMapping(value = "/trans/{loanid}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Transaction>> getLoanByStudentId(@PathVariable("loanid") Long loanid) {
        List<Transaction> transactionList = transactionService.getTransactionByTransID(loanid);
        if (transactionList.isEmpty()) {
            return new ResponseEntity<>(transactionList, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(transactionList, HttpStatus.OK);
    }

    @RequestMapping(value = "/trans/create",method = RequestMethod.POST)
    public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction, UriComponentsBuilder builder) {
        transactionService.save(transaction);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/trans/{loanid}").buildAndExpand(transaction.getLoanId()).toUri());
        return new ResponseEntity<>(transaction, HttpStatus.CREATED);
    }
}
