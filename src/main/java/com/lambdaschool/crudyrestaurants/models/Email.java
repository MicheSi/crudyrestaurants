package com.lambdaschool.crudyrestaurants.models;

import javax.persistence.*;

@Entity
@Table(name = "emails")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long emailid;

    private String email;

    @ManyToOne
    @JoinColumn(name = "employeeid",
        nullable = false)
    private Employee employee;

    public Email() {
        // default constructor required by JPA
    }

    public long getEmailid() {
        return emailid;
    }

    public void setEmailid(long emailid) {
        this.emailid = emailid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
