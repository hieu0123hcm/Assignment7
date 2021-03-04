package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Student;

import java.util.Optional;

public interface StudentService {
    Student findByAccountId(Long id);
}
