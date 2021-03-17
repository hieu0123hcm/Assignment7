package com.bienthaikieusa.chitchat.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "loanbundle")
public class LoanBundle implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bundleId;

    @Column(name = "rate")
    private float rate;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "month")
    private int month;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public LoanBundle() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getBundleId() {
        return bundleId;
    }

    public void setBundleId(Long bundleId) {
        this.bundleId = bundleId;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
