package com.pk.dao;

import com.pk.model.Employee;
import com.pk.util.DButil;
import com.pk.util.Status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {


    Connection conn;
    ResultSet rs = null;
    PreparedStatement psmt = null;
    Status status;

    public EmployeeDao()  {

    }

    public Status insert(Employee emp) throws SQLException {
        conn = DButil.getConnection();
        psmt = conn.prepareStatement(" insert into employee(id,name,salary,address,gender,department,joinyear)values(?,?,?,?,?,?,?)");
        psmt.setInt(1, emp.getEmpId());
        psmt.setString(2, emp.getEmpName());
        psmt.setFloat(3, emp.getSalary());
        psmt.setString(4, emp.getAddress());
        psmt.setString(5, emp.getGender());
        psmt.setString(6, emp.getDept());
        psmt.setInt(7, emp.getJoiningYear());
        int row = psmt.executeUpdate();


        if (row != 0) {
            status = Status.SUCCESS;
        } else
            status = Status.FAIL;
        return status;
    }

    public ResultSet select()  {


        try {
            conn = DButil.getConnection();
            psmt = conn.prepareStatement("select * from employee");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            return psmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
         }

    public Status updateEmployee(Employee emp) throws SQLException {
        conn = DButil.getConnection();

        psmt = conn.prepareStatement("update employee set salary = ? where id = ?");
        psmt.setInt(2,emp.getEmpId());
        psmt.setFloat(1,emp.getSalary());

        int row = psmt.executeUpdate();

        if(row!=0)
            status = Status.SUCCESS;
        else
            status = Status.FAIL;

        return status;
    }

    public Status deleteEmployee(int id) throws SQLException {

        conn = DButil.getConnection();
        psmt = conn.prepareStatement("Delete from Employee where id = ?");
        psmt.setInt(1,id);


        int row = psmt.executeUpdate();

        if(row!=0)
            status = Status.SUCCESS;
        else
            status = Status.FAIL;

        return status;
    }
}
