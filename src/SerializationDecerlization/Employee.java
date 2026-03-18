package SerializationDecerlization;

import java.io.Serializable;

public class Employee implements Serializable {
    public Employee(int empId, String name, float salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    private int empId;
    private String name;
    private float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString()
    {
        return "Employee[empId =" +empId + " empName : "+ name +"salaray : "+salary+"]";

    }

}
