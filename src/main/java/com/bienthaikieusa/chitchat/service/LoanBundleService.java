package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.LoanBundle;

import java.util.Optional;

public interface LoanBundleService {
    Optional<LoanBundle> findByLBundleID(Long loanBundleID);
}
