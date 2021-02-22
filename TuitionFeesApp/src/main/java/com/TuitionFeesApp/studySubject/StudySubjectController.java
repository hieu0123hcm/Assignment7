package com.TuitionFeesApp.studySubject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudySubjectController {

    private final StudySubjectService studySubjectService;

    @Autowired
    public StudySubjectController(StudySubjectService studySubjectService){
        this.studySubjectService = studySubjectService;
    }

    @GetMapping
    public List<StudySubject> getStudySubject(){
        return studySubjectService.getStudySubject();
    }

    @PostMapping
    public void addStudySubject(@RequestBody StudySubject studySubject){
        studySubjectService.addStudySubject(studySubject);
    }
}
