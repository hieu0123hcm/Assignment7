package com.bienthaikieusa.chitchat.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SUBJECT")
public class Subject implements Serializable {


    @Id
    private String subjectid;
    @Column(name="tuitionfee")
    private String tuitionFee;

    public Subject(){};

    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }

    public String getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(String tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
}