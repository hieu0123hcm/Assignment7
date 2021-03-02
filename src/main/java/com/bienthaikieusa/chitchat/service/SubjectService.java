package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Subject;

import java.util.Optional;

public interface SubjectService {
    Optional<Subject> findSubjectByID(String subjectID);
}
