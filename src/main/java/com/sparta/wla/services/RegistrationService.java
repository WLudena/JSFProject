package com.sparta.wla.services;

import com.sparta.wla.components.User;

import javax.inject.Named;
import java.util.Scanner;

@Named
public class RegistrationService {

    public String registerUser(User user) {
        return checkCredentials(user);
    }

    private String checkCredentials(User user){
        if(!user.getUserName().isEmpty() && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && !user.getPassword().isEmpty()){
            return "newUser";
        }else{
            return "register";
        }
    }
}
