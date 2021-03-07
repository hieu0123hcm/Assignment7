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

    @Column(name="create_on", insertable=false)
    private Date create_on;

    @Column(name = "amount")
    private Long amount;

    public Payment(Long payment_id, int semester, String studentID, Date create_on, Long amount) {
        this.payment_id = payment_id;
        this.semester = semester;
        this.studentID = studentID;
        this.create_on = create_on;
        this.amount = amount;
    }

    public Payment() {
    }

    public Date getCreate_on() {
        return create_on;
    }

    public void setCreate_on(Date create_on) {
        this.create_on = create_on;
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


    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
