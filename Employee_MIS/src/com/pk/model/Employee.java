package com.pk.model;

public class Employee {

    private int empId;
    private String empName;
    private String address;
    private float salary;
    private String dept;
    private String gender;
    private int joiningYear;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", gender='" + gender + '\'' +
                ", joiningYear=" + joiningYear +
                '}';
    }

    public Employee(int empId, String empName, String address, float salary, String dept, String gender, int joiningYear) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.salary = salary;
        this.dept = dept;
        this.gender = gender;
        this.joiningYear = joiningYear;
    }

    public Employee()
    {
        super();
    }
}
