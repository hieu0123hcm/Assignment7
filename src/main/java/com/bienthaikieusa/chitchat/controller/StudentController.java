package com.bienthaikieusa.chitchat.controller;

import com.bienthaikieusa.chitchat.model.Student;
import com.bienthaikieusa.chitchat.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Phuc
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/student/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> findByAccountId(@PathVariable String id) {

        Student student = service.findByAccountId(id);
        if (student == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
            return new ResponseEntity<>(student, HttpStatus.OK);


        }


    @GetMapping({"/student"})
    public List<Student> getStudents() {
        return this.service.getStudents();
    }

    @PostMapping({"/student/add"})
    public Student createNewStudent(@RequestBody Student student) {
        return this.service.addNewStudent(student);
    }

    @DeleteMapping({"/student/delete/{student_id}"})
    public void deleteStudent(@PathVariable("student_id") String id) {
        this.service.deleteStudent(id);
    }

    @PutMapping({"/student/update"})
    public Student updateStudent(@RequestBody Student student) {
        return this.service.updateStudent(student);
    }

    @GetMapping({"/student/profile/{student_id}"})
    public Optional<Student> findStudentByID(@PathVariable("student_id") String id) {
        return this.service.findByID(id);
    }

    }