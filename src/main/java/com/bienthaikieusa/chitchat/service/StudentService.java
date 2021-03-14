package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {//Phuc
    Student findByAccountId(String id);

    List<Student> getStudents();

    Student addNewStudent(Student student);

    void deleteStudent(String id);

    Student updateStudent(Student student);

    Optional<Student> findByID(String id);
}
