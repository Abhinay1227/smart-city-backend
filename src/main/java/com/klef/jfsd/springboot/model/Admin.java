package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin_table")
public class Admin {  // Renamed to Admin

    @Id
    @Column(name = "admin_id")
    private int id;

    @Column(name = "admin_email", nullable = false, length = 100, unique = true)
    private String email;

    @Column(name = "admin_password", nullable = false, length = 100)
    private String password;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}
