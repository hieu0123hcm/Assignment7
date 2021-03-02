package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.Subject;
import com.bienthaikieusa.chitchat.repository.SubjectRepository;
import com.bienthaikieusa.chitchat.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Optional<Subject> findSubjectByID(String subjectID) {
        return subjectRepository.findById(subjectID);
    }
}
