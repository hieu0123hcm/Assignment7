package com.bienthaikieusa.chitchat.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "LOAN")
public class Loan implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(name = "loandate")
    private Date loanDate;
    @Column(name = "studentid")
    private String studentId;
    @Column(name = "expireddate")
    private Date expiredDate;
    @Column(name = "bundleid")
    private Long bundleId;
    @Column(name = "amount")
    private Long amount;
    @Column(name = "loanstatus")
    private String loadStatus;
    @Column(name = "amountreturned")
    private Long amountReturned;

    public Loan() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loadId) {
        this.loanId = loadId;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Long getBundleId() {
        return bundleId;
    }

    public void setBundleId(Long bundleId) {
        this.bundleId = bundleId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getLoadStatus() {
        return loadStatus;
    }

    public void setLoadStatus(String loadStatus) {
        this.loadStatus = loadStatus;
    }
}
