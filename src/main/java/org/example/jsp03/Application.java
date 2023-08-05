package org.example.jsp03;


import org.example.jsp03.util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class Application {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = HibernateUtil.getEntityManagerFactory();

        EntityManager entityManager = entityManagerFactory.createEntityManager();


    }
}
