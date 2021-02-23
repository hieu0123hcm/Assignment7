package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Study;

import java.util.List;

public interface StudyService {
    List<Study> findAll();
    List<Study> findByStatusAndStudentID(String studentID, String studyStatus);
}
