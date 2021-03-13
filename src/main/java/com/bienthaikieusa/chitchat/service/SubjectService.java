package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectService {
    Optional<Subject> findSubjectByID(String subjectID);

    List<Subject> getAll();

    Subject updateSubject(Subject subject);

    Subject saveSubject(Subject subject);

    void remove(Subject subject);
}
