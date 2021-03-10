package com.bienthaikieusa.chitchat.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "notification")
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "sendid")
    private String sendid;
    @Column(name = "message")
    private String message;
    @Column(name="created_on")
    private Date created_on;
    @Column(name = "isadminread")
    private boolean isAdminRead;

    public boolean isAdminRead() {
        return isAdminRead;
    }

    public void setAdminRead(boolean adminRead) {
        isAdminRead = adminRead;
    }

    public Notification() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSendid() {
        return sendid;
    }

    public void setSendid(String sendeid) {
        this.sendid = sendeid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }
}
