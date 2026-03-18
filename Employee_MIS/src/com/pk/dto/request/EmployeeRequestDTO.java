package com.pk.dto.request;

import com.pk.model.Employee;

import java.util.Scanner;

public class EmployeeRequestDTO {
    Scanner sn = new Scanner(System.in);


    public Employee getEmpData() {
        System.out.println("Enter Employee id");
        int id = sn.nextInt();

        System.out.println("Enter Employee name");
        String name = sn.next();

        System.out.println("Enter Employee salary");
        Float sal = sn.nextFloat();

        System.out.println("Enter Employee address");
        String address = sn.next();

        System.out.println("Enter Employee dept");
        String dept = sn.next();

        System.out.println("Enter Employee join year");
        int year = sn.nextInt();

        System.out.println("Enter Employee gender");
        String gender = sn.next();


        return new Employee(id, name, address, sal, dept, gender, year);
    }

    public Employee updateEmpData() {

        System.out.println("Enter Employee id");
        int id = sn.nextInt();

        System.out.println("Enter Employee salary");
        Float sal = sn.nextFloat();

        Employee emp = new Employee();
        emp.setEmpId(id);
        emp.setSalary(sal);
        return emp;
    }
}
