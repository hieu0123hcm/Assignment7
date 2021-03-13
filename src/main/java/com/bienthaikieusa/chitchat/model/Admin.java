package com.bienthaikieusa.chitchat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


//Phuc
@Entity
@Table(name = "admin")
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String admin_id;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "account_id")
    private String account_id;

    public Admin(String admin_id, String fullname, Date birthdate, String account_id) {
        this.admin_id = admin_id;
        this.fullname = fullname;
        this.birthdate = birthdate;
        this.account_id = account_id;
    }

    public Admin() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
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

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }
}
