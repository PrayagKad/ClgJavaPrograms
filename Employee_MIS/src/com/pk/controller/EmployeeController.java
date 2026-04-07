package com.pk.controller;

import com.pk.dto.request.EmployeeRequestDTO;
import com.pk.model.Employee;
import com.pk.service.EmployeeService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeController {

    EmployeeService employeeService = new EmployeeService();

    public void addEmployee()
    {

        String status = employeeService.addEmployee();
        System.out.println(status);

    }

    public void display()  {
        List<Employee> list = null;

        try {
            list = employeeService.getEmployees();
            list.stream().forEach(e-> System.out.println(e));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update() {


        String status = employeeService.update();
        System.out.println(status);
    }

    public void deleteEmployee() {

        String status = employeeService.delete();
        System.out.println(status);
    }

    public void findByID(int id) {

            Employee emp  = employeeService.findByID(id);
        System.out.println(emp);


    }
}
