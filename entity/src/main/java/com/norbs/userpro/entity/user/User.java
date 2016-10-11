package com.norbs.userpro.entity.user;

import com.norbs.userpro.entity.base.SimpleEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Norbs on 18/09/2016.
 */
@Entity
@Table(name = "user")
public class User extends SimpleEntity {

    @Column(name = "email", nullable = false, length = 64, unique = true)
    private String email;

    @Column(name = "password", nullable = false, length = 128)
    private String password;

    @Column(name = "full_name", nullable = false, length = 64)
    private String fullName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}