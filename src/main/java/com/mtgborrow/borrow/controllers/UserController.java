package com.mtgborrow.borrow.controllers;

import com.mtgborrow.borrow.models.RequestUser;
import com.mtgborrow.borrow.models.User;
import com.mtgborrow.borrow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class
UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user/new")
    public User createNewUser(@RequestBody RequestUser user){
        return userService.createNewUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

}
