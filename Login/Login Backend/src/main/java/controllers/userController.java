package controllers;

import models.User;
import services.userService;

import javax.inject.Inject;

public class userController {

    @Inject
    private userService userService;

    public User login(String username, String password){
        return userService.login(username,password);
    }
}
