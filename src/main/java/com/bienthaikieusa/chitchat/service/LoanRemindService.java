package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.LoanRemind;

import java.util.List;
import java.util.Optional;

public interface LoanRemindService {
    void saveLoanRemind(LoanRemind loanRemind);
    List<LoanRemind> findLoanRemindByStuID(String studentId);
    Optional<LoanRemind> findByLoanRemindID(Long loanRemindID);
}
