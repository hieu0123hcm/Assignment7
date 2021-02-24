package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.Study;
import com.bienthaikieusa.chitchat.model.StudyDTO;
import com.bienthaikieusa.chitchat.repository.StudyRepository;
import com.bienthaikieusa.chitchat.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<StudyDTO> findByStatusAndStudentID(String studentID, String studyStatus) {
        List<Study> studyList = studyRepository.find(studentID, studyStatus);
        List<StudyDTO> studyDTOList = new ArrayList<>();
        for (Study x: studyList) {

            StudyDTO studyDTO = new StudyDTO();
            studyDTO.setId(x.getId());
            studyDTO.setSemesterNo(x.getSemesterNo());
            studyDTO.setStudentID(x.getStudentID());
            studyDTO.setStudyStatus(x.getStudyStatus());
            studyDTO.setSubject(x.getSubject());
            studyDTO.setSubjectID(x.getSubjectID());
            studyDTO.setTuitionFee(1000000);

        }

        return studyDTOList;
    }
}
