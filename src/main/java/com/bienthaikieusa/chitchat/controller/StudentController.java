package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.Admin;
import com.bienthaikieusa.chitchat.model.Student;
import com.bienthaikieusa.chitchat.service.AdminService;
import com.bienthaikieusa.chitchat.service.StudentService;
import com.bienthaikieusa.chitchat.service.StudyService;
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
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/student/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> findByAccountId(@PathVariable Long id) {

        Student student = service.findByAccountId(id);
        if (student == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
            return new ResponseEntity<>(student, HttpStatus.OK);


        }

    }