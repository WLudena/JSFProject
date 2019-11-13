package com.sparta.wla.services;

import com.sparta.wla.components.User;

public class LoginService {

    public String validateUser(User user) {
        return checkSignIn(user);
    }

    private String checkSignIn(User user){
        if(user.getUserName().equals("username") && user.getPassword().equals("password")){
            return "welcome";
        }else{
            return "login";
        }
    }

}
