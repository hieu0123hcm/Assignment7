package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.LoanRemind;
import com.bienthaikieusa.chitchat.repository.LoanRemindRepository;
import com.bienthaikieusa.chitchat.service.LoanRemindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanRemindServiceImpl implements LoanRemindService {

    @Autowired
    LoanRemindRepository loanRemindRepository;

    @Override
    public void saveLoanRemind(LoanRemind loanRemind) {
        loanRemindRepository.save(loanRemind);
    }

    @Override
    public List<LoanRemind> findLoanRemindByStuID(String studentId) {
        return loanRemindRepository.findLRByStudentID(studentId);
    }
}
