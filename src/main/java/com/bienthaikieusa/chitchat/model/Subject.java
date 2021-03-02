package com.bienthaikieusa.chitchat.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SUBJECT")
public class Subject implements Serializable {


    @Id
    private String subjectid;
    @Column(name="tuitionfee")
    private float tuitionFee;
    @Column(name = "subject")
    private String subject;
    @Column(name = "description")
    private String description;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Subject(){};

    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }

    public float getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(float tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
}