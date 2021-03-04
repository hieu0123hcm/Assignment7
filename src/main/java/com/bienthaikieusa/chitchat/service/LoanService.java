package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.DTO.LoanDTO;
import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.Subject;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface LoanService {
    List<LoanDTO> getLoanByStudentID(String studentId);

    List<Loan> getAll();
<<<<<<< Updated upstream
=======

    Loan updateLoan(Loan loan);

    Loan saveLoan(Loan loan);

    void remove(Loan loan);

    Optional<Loan> findById(Long loanId);

>>>>>>> Stashed changes
}
