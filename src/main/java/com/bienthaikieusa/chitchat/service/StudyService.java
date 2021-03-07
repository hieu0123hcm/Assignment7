package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Message;
import com.bienthaikieusa.chitchat.model.Study;
import com.bienthaikieusa.chitchat.model.DTO.StudyDTO;

import java.util.List;
import java.util.Optional;

public interface StudyService {
    List<Study> findAll();
    List<StudyDTO>  findByStatusAndStudentID(String studentID, String studyStatus);
    Optional<Study> findByStudyID(Long studyID);
    void save(Study study);
}
