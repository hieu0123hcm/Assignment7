package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.LoanRemind;
import com.bienthaikieusa.chitchat.repository.LoanRemindRepository;
import com.bienthaikieusa.chitchat.service.LoanRemindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<LoanRemind> findByLoanRemindID(Long loanRemindID) {
        return loanRemindRepository.findById(loanRemindID);
    }


}
