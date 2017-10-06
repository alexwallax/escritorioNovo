package com.rcelestinoadvocacia.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DataBase {
    
    private static DataBase singleton = new DataBase();
    private static EntityManager manager;
    
    public DataBase(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ConexaoM");
        manager = factory.createEntityManager();
    }
    
    public static DataBase getInstance(){
        return singleton;
    }
    public EntityManager getEm(){
        return manager;

    }
}