package com.bank.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBUtil {

    public static EntityManager getConnection() {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("programmer");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
}