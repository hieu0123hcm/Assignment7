package com.bienthaikieusa.chitchat.service.impl;


import com.bienthaikieusa.chitchat.model.LoanBundle;
import com.bienthaikieusa.chitchat.repository.LoanBundleRepository;
import com.bienthaikieusa.chitchat.service.LoanBundleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoanBundleServiceImpl implements LoanBundleService {
    @Autowired
    LoanBundleRepository loanBundleRepository;

    @Override
    public Optional<LoanBundle> findByLBundleID(Long loanBundleID) {
        return loanBundleRepository.findByLBundleID(loanBundleID);
    }
}
