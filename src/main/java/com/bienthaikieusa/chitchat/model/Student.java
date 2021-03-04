package com.bienthaikieusa.chitchat.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String student_id;

    @Column(name = "account_id")
    private Long account_id;

    @Column(name = "major")
    private String major;

    @Column(name = "semester")
    private String semester;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "birthdate")
    private Date birthdate;

    public Student(String student_id, Long account_id, String major, String semester, String fullname, Date birthdate) {
        this.student_id = student_id;
        this.account_id = account_id;
        this.major = major;
        this.semester = semester;
        this.fullname = fullname;
        this.birthdate = birthdate;
    }

    public Student(String student_id) {
        this.student_id = student_id;
    }

    public Student() {

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public Long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(student_id, student.student_id) &&
                Objects.equals(account_id, student.account_id) &&
                Objects.equals(major, student.major) &&
                Objects.equals(semester, student.semester) &&
                Objects.equals(fullname, student.fullname) &&
                Objects.equals(birthdate, student.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student_id, account_id, major, semester, fullname, birthdate);
    }
}
