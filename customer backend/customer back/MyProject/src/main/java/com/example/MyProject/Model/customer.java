package com.example.MyProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String place;
    private String email;
    private Long number;
    public customer() {
    }
    public customer(Integer id, String name, String place, String email, Long number) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.email = email;
        this.number = number;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getNumber() {
        return number;
    }
    public void setNumber(Long number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "customer [id=" + id + ", name=" + name + ", place=" + place + ", email=" + email + ", number=" + number
                + "]";
    }

    
}
   