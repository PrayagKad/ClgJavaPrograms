package com.app.springbootwelcome.controller;

import com.app.springbootwelcome.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcomeMsg(@RequestParam String name , @RequestParam int age) {

        if(age < 18) {
            return "<h1><font color='red'>Welcome "+name+"!</font></h1>";
        }
        else
        {
            return " <h1>grow up , baccha hai kya havle</h1>";
        }
    }


    @GetMapping("/emp")
    public Employee getEmployee() {
        Employee emp = new Employee();
        emp.setEmployeeId(101);
        emp.setEmployeeName("dracu chicha");
        emp.setEmployeeSalary("1000");
        return emp;
    }
}
