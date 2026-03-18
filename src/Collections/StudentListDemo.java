package Collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
    int rollno;
    String name ;
    String email;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    String branch;

    public Student(int rollno, String name, String email, String branch) {
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}

public class StudentListDemo {
    public static void main(String[] args) {

        Student std1 = new Student(100, "rahul","rah@gmail" , " comp");
        Student std2 = new Student(101, "ramu","ramu@gmail" , " comp");

        ArrayList<Student> sl = new ArrayList<Student>();
        sl.add(std1);
        sl.add(std2);

        System.out.println(sl); // override toString() in student class to print info properly


        Iterator<Student> it = sl.iterator();
        while(it.hasNext())
        {

            Student s = it.next();
            System.out.println(s.getName() + s.getBranch() + s.email);
        }




    }
}
