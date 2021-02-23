package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.Study;
import com.bienthaikieusa.chitchat.repository.StudyRepository;
import com.bienthaikieusa.chitchat.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyServiceImpl implements StudyService {

    @Autowired
    private StudyRepository studyRepository;

    @Override
    public List<Study> findAll() {
        return (List<Study>) studyRepository.findAll();
    }

    @Override
    public List<Study> findByStatusAndStudentID(String studentID, String studyStatus) {
        return studyRepository.find(studentID, studyStatus);
    }
}
