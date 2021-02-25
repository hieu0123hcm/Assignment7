package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.DTO.LoanDTO;
import com.bienthaikieusa.chitchat.model.Loan;
import com.bienthaikieusa.chitchat.model.LoanBundle;
import com.bienthaikieusa.chitchat.repository.LoanBundleRepository;
import com.bienthaikieusa.chitchat.repository.LoanRepository;
import com.bienthaikieusa.chitchat.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LoanServiceImpl implements LoanService {
    @Autowired
    LoanRepository loanRepository;

    @Autowired
    LoanBundleRepository loanBundleRepository;

    @Override
    public List<LoanDTO> getLoanByStudentID(String studentId) {
        List<Loan> loans = loanRepository.findByStudentID(studentId);

        List<LoanDTO> loanDTOList = new ArrayList<>();
        for (Loan x: loans) {
            int rate = loanBundleRepository.findLoanRate(x.getBundleId());

            LoanDTO loanDTO = new LoanDTO();
            loanDTO.setAmount(x.getAmount());
            loanDTO.setAmountReturned(x.getAmount());
            loanDTO.setBundleId(x.getBundleId());
            loanDTO.setExpiredDate(x.getExpiredDate());
            loanDTO.setRate(rate);
            loanDTO.setLoanDate(x.getLoanDate());
            loanDTO.setloanId(x.getLoanId());
            loanDTO.setStudentId(x.getStudentId());
            loanDTO.setloanStatus(x.getLoadStatus());

            loanDTOList.add(loanDTO);
        }
        return loanDTOList;
    }
}
