package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Admin;

import java.util.Optional;

public interface AdminService {
    Admin findByAccountId(Long id);
}
