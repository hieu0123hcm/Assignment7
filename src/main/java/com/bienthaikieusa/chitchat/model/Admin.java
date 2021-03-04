package com.bienthaikieusa.chitchat.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

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
    private Long account_id;

    public Admin(String admin_id, String fullname, Date birthdate, Long account_id) {
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

    public Long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(admin_id, admin.admin_id) &&
                Objects.equals(fullname, admin.fullname) &&
                Objects.equals(birthdate, admin.birthdate) &&
                Objects.equals(account_id, admin.account_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admin_id, fullname, birthdate, account_id);
    }
}
