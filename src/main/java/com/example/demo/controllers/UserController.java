package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Autowired
    UserService userService;

    @GetMapping("/register")
    public String register(){

        return "register";
    }

    @GetMapping("/success")
    public String success(){

        return "saveuser";
    }


    @PostMapping("/saveuser")
    public String saveuser(User user){

        user.setPassword( bCryptPasswordEncoder.encode(user.getPassword()) );

        userService.saveUser( user);

        return "redirect:/success";
    }

    @PreAuthorize( "hasRole('ROLE_ADMIN')")
    @GetMapping("/allusers")
    public String allusers(Model models ){

        models.addAttribute("name" , "Test");
        models.addAttribute("users" , userService.getUsrs() );

        return "allusers";
    }


}
