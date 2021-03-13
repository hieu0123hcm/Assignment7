package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.Message;
import com.bienthaikieusa.chitchat.model.Subject;
import com.bienthaikieusa.chitchat.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @RequestMapping(value = "/subjects",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Subject>> getListSubject() {
        List<Subject> subject = subjectService.getAll();

        if (subject.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(subject, HttpStatus.OK);
    }

    @RequestMapping(value = "/subject/add",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Subject> addSubject(@RequestBody Subject subject) {
        Subject subjectAdd = subjectService.saveSubject(subject);
        if (subjectAdd == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(subjectAdd, HttpStatus.OK);
    }

    @RequestMapping(value = "/subject/update",method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Subject> updateSubject( @RequestBody Subject subject) {
        Subject subjectUpdate = subjectService.updateSubject(subject);

        if (subjectUpdate != null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>( subjectUpdate, HttpStatus.OK);
    }

    @RequestMapping(value = "/subject/delete/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Subject> deteleSubject(@PathVariable("id") String id) {
        Optional<Subject> findBySubject = subjectService.findSubjectByID(id);
        if (!findBySubject.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        subjectService.remove(findBySubject.get());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
