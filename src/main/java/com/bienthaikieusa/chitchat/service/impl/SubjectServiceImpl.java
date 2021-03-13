package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.Subject;
import com.bienthaikieusa.chitchat.repository.SubjectRepository;
import com.bienthaikieusa.chitchat.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Optional<Subject> findSubjectByID(String subjectID) {
        return subjectRepository.findById(subjectID);
    }

    @Override
    public Subject updateSubject(Subject subject) {
        Subject subject1 = subjectRepository.findById(subject.getSubjectid()).orElse(null);
        subject1.setDescription(subject.getDescription());
        subject1.setTuitionFee(subject.getTuitionFee());
        subject1.setSubject(subject.getSubject());
        subject1.setSubjectid(subject.getSubjectid());
        return  subjectRepository.save(subject1);
    }

    @Override
    public void remove(Subject subject) {
        subjectRepository.delete(subject);
    }

    @Override
    public Subject saveSubject(Subject subject)
    {
        return subjectRepository.save(subject);
    }

    @Override
    public List<Subject> getAll() {
        return (List<Subject>) subjectRepository.findAll();
    }
}
