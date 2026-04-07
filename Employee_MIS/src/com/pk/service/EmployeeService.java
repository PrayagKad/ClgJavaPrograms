package com.pk.service;

import com.pk.dao.EmployeeDao;
import com.pk.dto.request.EmployeeRequestDTO;
import com.pk.model.Employee;
import com.pk.util.Status;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {

    EmployeeRequestDTO empdto = new EmployeeRequestDTO();
    EmployeeDao dao = new EmployeeDao();


    public String addEmployee() {
        String response = "";
        Employee emp = empdto.getEmpData();
        try {
            Status status = dao.insert(emp);
            if (status == Status.SUCCESS)
                response = "Employee added successfully ....";

            else if (status == Status.FAIL)
                response = " Record not inserted";
            else
                response = " infrs problem . check connection ...";
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return response;
    }

    public List<Employee> getEmployees() throws SQLException {
        ResultSet rs = dao.select();
        List<Employee> employees = new ArrayList<Employee>();
        while (rs.next()) { ///  match the numbers as per columns in db 1 = id , 2 = name , .....
            employees.add(new Employee(rs.getInt(1),
                    rs.getString(2),
                    rs.getString("address"),
                    rs.getFloat("salary"),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getInt(7)));
        }
        return employees;
    }

    public String update() {
        Employee emp = empdto.updateEmpData();
        String response = "";
        try {

            Status status = dao.updateEmployee(emp);

            if (status == Status.SUCCESS)
                response = "Employee updatated successfully ....";

            else if (status == Status.FAIL)
                response = " Record not found ......";
            else
                response = " infrs problem . check connection ...";
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return response;
    }


    public String delete() {
        System.out.println("enter employee id ...");
        int id = new Scanner(System.in).nextInt();

        String response = null;
        try {

            Status status = dao.deleteEmployee(id);

            if (status == Status.SUCCESS)
                response = "Employee deleted successfully ....";

            else if (status == Status.FAIL)
                response = " Record not found ......";
            else
                response = " infrs problem . check connection ...";
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return response;

    }

    public Employee findByID(int id) {
        String response = "";

        Employee employee = new Employee();
        try {


            employee = dao.findById(id);

            Status status = null;

            if (status == Status.SUCCESS)
                System.out.println("Employee found successfully ....");

            else if (status == Status.FAIL)
                System.out.println( " Employee not found ......");

            else
                System.out.println( " infrs problem . check connection ...");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employee;
    }
}

