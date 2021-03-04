package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.Admin;
import com.bienthaikieusa.chitchat.repository.AdminRepository;
import com.bienthaikieusa.chitchat.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminServiceImpl(final AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin findByAccountId(Long id) {
        return adminRepository.findByAccountID(id);
    }
}
