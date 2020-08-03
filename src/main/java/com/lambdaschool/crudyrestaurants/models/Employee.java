package com.lambdaschool.crudyrestaurants.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // lets database decide how to generate value of id
    private long employeeid;

    @Column(nullable = false, unique = true)
    private String name;

    private double salary;

    @ManyToMany()
    /*
     * Note: JoinTable is the name of a table that will get created in the database combining the two primary keys making up this relationship
     *       joinColumn is the primary key of the main, driving, table
     *       inverseJoinColumns is the primary key of the other table in the relationship
     *
     * We are using a Set inside of a List to help with enforcing uniqueness in the employeetitles. Sets by their very nature
     * only contain unique values. By using Sets we do not have to do a lot of extra coding to enforce uniqueness.
     * We can treat the HashSet very similar to ArrayLists. Differences will be highlighted throughout the course
     */
    @JoinTable(name = "employeetitles",
        joinColumns = @JoinColumn(name = "employeeid"),
        inverseJoinColumns = @JoinColumn(name = "jobtitleid"))
    Set<JobTitle> jobtitles = new HashSet<>();

    @OneToMany(mappedBy = "employee",
        cascade = CascadeType.ALL,
        orphanRemoval = true) // if email has ref to employee that doesn't exist, delete the email record
    private List<Email> emails = new ArrayList<>();

    public Employee() {
        // default constructor required by JPA
    }

    public long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(long employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public Set<JobTitle> getJobtitles() {
        return jobtitles;
    }

    public void setJobtitles(Set<JobTitle> jobtitles) {
        this.jobtitles = jobtitles;
    }
}
