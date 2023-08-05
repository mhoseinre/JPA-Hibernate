package org.example.jsp03.util;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    private  static  final EntityManagerFactory entityManagerFactory;

    static {
        entityManagerFactory= Persistence.createEntityManagerFactory("Unit");
    }
    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    }
}
