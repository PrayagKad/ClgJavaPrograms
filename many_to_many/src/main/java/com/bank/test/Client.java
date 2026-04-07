package com.bank.test;

import com.bank.domain.Programmer;
import com.bank.domain.Project;
import com.bank.util.DBUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        EntityManager manager = DBUtil.getConnection();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        Programmer p1 = new Programmer(167, "raja", 9000);
        Programmer p2 = new Programmer(166, "ravi", 2000);
        Programmer p3 = new Programmer(144, "ramu", 7000);
        //child Objects
        Project pro1 = new Project(1060, "project1");
        Project pro2 = new Project(1088, "project2");

        //set programmers to projects

        p1.getProjects().add(pro1);
        p1.getProjects().add(pro2);

        p2.getProjects().add(pro1);

        p3.getProjects().add(pro1);
        p3.getProjects().add(pro2);

        manager.persist(p1);
        manager.persist(p2);
        manager.persist(p3);
        tx.commit();
        manager.close();

        System.out.println("SUCCESS");


    }
}
