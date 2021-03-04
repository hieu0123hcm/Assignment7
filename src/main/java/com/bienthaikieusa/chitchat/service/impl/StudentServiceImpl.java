package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.Student;
import com.bienthaikieusa.chitchat.repository.StudentRepository;
import com.bienthaikieusa.chitchat.repository.SubjectRepository;
import com.bienthaikieusa.chitchat.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    private  final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(final StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student findByAccountId(Long id) {
        return studentRepository.findByAccountID(id);
    }
}
