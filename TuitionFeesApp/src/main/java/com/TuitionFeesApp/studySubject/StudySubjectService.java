package com.TuitionFeesApp.studySubject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudySubjectService {

    private final StudySubjectRepository studySubjectRepository;

    @Autowired
    public StudySubjectService(StudySubjectRepository studySubjectRepository){
        this.studySubjectRepository = studySubjectRepository;
    }


    public List<StudySubject> getStudySubject(){
        return studySubjectRepository.findAll();
    }

    public void addStudySubject( StudySubject studySubject) {
        System.out.println(studySubject);
    }
}
