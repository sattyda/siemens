package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    UserService userService;

    @PostMapping("/apisave")
    public String apisave(@RequestBody User user){

        userService.saveUser( user );

        return "saveuser";
    }

    @PostMapping("/users")
    public List<User> getusers(){
        return  userService.getUsrs();

    }



}
