package com.example.practiceHibernate.module;

import jakarta.persistence.Embeddable;

@Embeddable
public class FullName {
    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    @Override
    public String toString(){
        return firstname+" "+lastname;
    }

}
