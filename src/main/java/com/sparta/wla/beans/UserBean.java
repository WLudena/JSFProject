package com.sparta.wla.beans;

import com.sparta.wla.components.User;
import com.sparta.wla.persistence.PersistenceManager;
import com.sparta.wla.services.LoginService;
import com.sparta.wla.services.RegistrationService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Index;

@Named
@RequestScoped
public class UserBean {

    @Inject
    private RegistrationService registrationService;
    @Inject
    private LoginService loginService;
    @Inject
    private PersistenceManager persistenceManager;

    private User user = new User();

    public User getUser() {
        return user;
    }

    public String registerNewUser(){
        return  registrationService.registerUser(persistenceManager.entityManager(),user);
    }

    public String validateUser(){
        return loginService.validateUser(user);
    }
}
