package com.bienthaikieusa.chitchat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


//Phuc
@Entity
@Table(name = "student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String student_id;

    @Column(name = "account_id")
    private String account_id;

    @Column(name = "major")
    private String major;

    @Column(name = "semester")
    private String semester;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "birthdate")
    private Date birthdate;

    public Student(String student_id, String account_id, String major, String semester, String fullname, Date birthdate) {
        this.student_id = student_id;
        this.account_id = account_id;
        this.major = major;
        this.semester = semester;
        this.fullname = fullname;
        this.birthdate = birthdate;
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

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
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
}
