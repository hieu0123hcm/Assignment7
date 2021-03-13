package com.bienthaikieusa.chitchat.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "SUBJECT")
public class Subject implements Serializable {


    @Id
    private String subjectid;
    @Column(name="tuitionfee")
    private Long tuitionFee;
    @Column(name = "subject")
    private String subject;
    @Column(name = "description")
    private String description;

    public Subject(String subjectid, Long tuitionFee, String subject, String description) {
        this.subjectid = subjectid;
        this.tuitionFee = tuitionFee;
        this.subject = subject;
        this.description = description;
    }

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

    public Long getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(Long tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject1 = (Subject) o;
        return Float.compare(subject1.tuitionFee, tuitionFee) == 0 &&
                Objects.equals(subjectid, subject1.subjectid) &&
                Objects.equals(subject, subject1.subject) &&
                Objects.equals(description, subject1.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectid, tuitionFee, subject, description);
    }
}