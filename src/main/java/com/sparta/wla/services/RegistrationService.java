package com.sparta.wla.services;

import com.sparta.wla.components.User;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.util.Scanner;

@Named
public class RegistrationService {

    public String registerUser(EntityManager entityManager,User user) {
        return checkCredentials(entityManager,user);
    }

    private String checkCredentials(EntityManager entityManager, User user){
        if(!user.getUserName().isEmpty() && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && !user.getPassword().isEmpty()){
            if(!checkIfUserExists()){
                setUserDetails(entityManager,user);
            }
        }
        return "newUser";
    }
    private void setUserDetails(EntityManager entityManager, User user){
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    private boolean checkIfUserExists(){
        return false;
    }
}
