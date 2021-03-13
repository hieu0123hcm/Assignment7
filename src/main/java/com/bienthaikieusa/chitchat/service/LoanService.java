package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.DTO.LoanDTO;
import com.bienthaikieusa.chitchat.model.Loan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface LoanService {
    List<LoanDTO> getLoanByStudentID(String studentId);
    List<Loan> getAll();

    Loan updateLoan(Loan loan);//Phuc

    Loan saveLoan(Loan loan);//Phuc

    void remove(Loan loan);//Phuc

    Optional<Loan> findById(Long loanId);//Phuc
}
