package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.LoanBundle;
import com.bienthaikieusa.chitchat.service.LoanBundleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LoanBundleController {
    @Autowired
    private LoanBundleService loanBundleService;

    @RequestMapping(value = "/loanbundle/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoanBundle> findLoanBundle(@PathVariable("id") Long id) {
        Optional<LoanBundle> loanBundle = loanBundleService.findByLBundleID(id);
        if (!loanBundle.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(loanBundle.get(), HttpStatus.OK);
    }
}
