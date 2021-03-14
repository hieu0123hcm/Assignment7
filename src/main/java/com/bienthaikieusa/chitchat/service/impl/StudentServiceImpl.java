package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.Student;
import com.bienthaikieusa.chitchat.model.Subject;
import com.bienthaikieusa.chitchat.repository.StudentRepository;
import com.bienthaikieusa.chitchat.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service//Phuc
@Transactional
public class StudentServiceImpl implements StudentService {
    private  final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(final StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return (List<Student>) this.studentRepository.findAll();
    }

    public Student addNewStudent(Student student) {
        return (Student)this.studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        boolean exist = this.studentRepository.existsById(id);
        if (exist) {
            this.studentRepository.deleteById(id);
        }

    }

    public Student updateStudent(Student student) {
        Student existStudent = (Student)this.studentRepository.findById(student.getStudent_id()).orElse((Student) null);
        existStudent.setMajor(student.getMajor());
        existStudent.setFullname(student.getFullname());
        existStudent.setBirthdate(student.getBirthdate());
        existStudent.setSemester(student.getSemester());
        existStudent.setAccount_id(student.getAccount_id());
        return (Student)this.studentRepository.save(existStudent);
    }

    public Optional<Student> findByID(String id) {
        return this.studentRepository.findById(id);
    }

    @Override
    public Student findByAccountId(String id) {
        return studentRepository.findByAccountID(id);
    }
}
