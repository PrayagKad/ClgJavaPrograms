package com.app.beans;

import java.beans.ConstructorProperties;

public class Student {

    private int sno;
    private String name;
    private Float savg;

    @ConstructorProperties(value ={"no","name","avg"})
    public Student(int no, String name, Float avg) {
        super();
        System.out.println("student 3 parm constructor");
        this.sno = no;
        this.name = name;
        this.savg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", savg=" + savg +
                '}';
    }
}
