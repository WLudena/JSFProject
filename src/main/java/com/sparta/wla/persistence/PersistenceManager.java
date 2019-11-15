package com.sparta.wla.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {

    public EntityManager entityManager(){
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("UserPersistenceUnit");
        EntityManager entityManager = managerFactory.createEntityManager();

        return entityManager;
    }
}
