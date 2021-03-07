package com.bienthaikieusa.chitchat.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "PAYMENT")
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long payment_id;

    @Column(name = "semester")
    private int semester;

    @Column(name = "student_id")
    private String studentID;

    @Column(name="date", insertable=false)
    private Date date;

    @Column(name = "amount")
    private Long amount;

    public Payment() {
    }

    public Payment(Long payment_id, int semester, String studentID, Date date, Long amount) {
        this.payment_id = payment_id;
        this.semester = semester;
        this.studentID = studentID;
        this.date = date;
        this.amount = amount;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Long payment_id) {
        this.payment_id = payment_id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
