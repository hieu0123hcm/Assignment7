package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.Message;
import com.bienthaikieusa.chitchat.model.Subject;
import com.bienthaikieusa.chitchat.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value = "/subjects/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Subject> getSubjectByID(@PathVariable("id") String id) {
        Optional<Subject> subject = subjectService.findSubjectByID(id);

        if (!subject.isPresent()) {
            return new ResponseEntity<>(subject.get(), HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(subject.get(), HttpStatus.OK);
    }
}
