package com.bank.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Project {
    @Id
    private int proid;
    private String proname;
    @ManyToMany(mappedBy = "projects")
    private Set<Programmer> programmers = new HashSet<Programmer>();
    public Project() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Project:0-param constructor");
    }
    public Project(int proid, String proname) {
        super();
        System.out.println("Project: 2 param constructor");
        this.proid = proid;
        this.proname = proname;
    }




}
