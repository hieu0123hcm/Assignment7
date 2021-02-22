package com.TuitionFeesApp.studySubject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class StudySubject {
    @Id
    private int id;
    private String subject;
    private int semester;
    private String studentID;
    private String subjectID;
    private boolean studyStatus;

    public StudySubject(int id, String subject, int semester, String studentID, String subjectID, boolean studyStatus) {
        this.id = id;
        this.subject = subject;
        this.semester = semester;
        this.studentID = studentID;
        this.subjectID = subjectID;
        this.studyStatus = studyStatus;
    }

    public StudySubject(String subject, int semester, String studentID, String subjectID, boolean studyStatus) {
        this.subject = subject;
        this.semester = semester;
        this.studentID = studentID;
        this.subjectID = subjectID;
        this.studyStatus = studyStatus;
    }

    public StudySubject() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public boolean isStudyStatus() {
        return studyStatus;
    }

    public void setStudyStatus(boolean studyStatus) {
        this.studyStatus = studyStatus;
    }
}
