package com.lambdaschool.crudyrestaurants.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "jobtitles")
public class JobTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long jobtitleid;

    private String title;

    @ManyToMany(mappedBy = "jobtitles")
    private Set<Employee> employees = new HashSet<>();

    public JobTitle() {
        // default constructor required by JPA
    }

    public long getJobtitleid() {
        return jobtitleid;
    }

    public void setJobtitleid(long jobtitleid) {
        this.jobtitleid = jobtitleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
