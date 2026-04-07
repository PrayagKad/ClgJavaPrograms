package com.app.beans;

import java.util.Map;

public class College {

    private Map<String,String> facultySubjects;
    private Map<?,?> keyValue;

    public void setFacultySubjects(Map<String,String> facultySubjects) {
        this.facultySubjects = facultySubjects;
    }

    public void setKeyValue(Map<?,?> keyValue)
    {
        this.keyValue = keyValue;
    }

    @Override
    public String toString() {
        return "College{" +
                "facultySubjects=" + facultySubjects +
                ", keyValue=" + keyValue +
                '}';
    }
}
