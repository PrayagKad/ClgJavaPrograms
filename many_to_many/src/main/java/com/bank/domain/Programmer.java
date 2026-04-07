package com.bank.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="programmers")
public class Programmer {
    @Id
    private int pid;
    private String name;
    private long salary;

    @ManyToMany(targetEntity = Project.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinTable(name = "programmers_projects",
            joinColumns = @JoinColumn(name = "programmer_id", referencedColumnName = "pid"),
            inverseJoinColumns = @JoinColumn(name = "project_id", referencedColumnName = "proid"))

    private Set<Project> projects = new HashSet<Project>();

    public Programmer() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Programmer(int pid, String name, long salary) {
        super();
        this.pid = pid;
        this.name = name;
        this.salary = salary;

    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Programmer [pid=" + pid + ", name=" + name + ", salary=" + salary + ", projects=" + projects + "]";
    }
}