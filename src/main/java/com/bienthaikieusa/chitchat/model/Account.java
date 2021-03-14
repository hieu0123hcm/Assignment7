package com.bienthaikieusa.chitchat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "account")
public class Account implements Serializable {

    @Id
    @Column(
            name = "account_id"
    )
    private String account_id ;

    @Column(
            name = "role"
    )
    private String role ;

    public Account(String account_id, String role) {
        this.account_id = account_id;
        this.role = role;
    }

    public Account() {
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
