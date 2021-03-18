package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.LoanRemind;

import java.util.List;

public interface LoanRemindService {
    void saveLoanRemind(LoanRemind loanRemind);
    List<LoanRemind> findLoanRemindByStuID(String studentId);
}
