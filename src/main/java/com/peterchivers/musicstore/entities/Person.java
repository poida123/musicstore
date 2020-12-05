package com.peterchivers.musicstore.entities;

import java.util.Date;

public class Person extends BaseEntity {

    private String firstName;
    private String lastName;
    private Date dob;

    public Person(Long id, String firstName, String lastName, Date dob) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
