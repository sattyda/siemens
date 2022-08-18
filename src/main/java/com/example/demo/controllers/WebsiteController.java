package com.example.demo.controllers;

import com.example.demo.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WebsiteController {

    @GetMapping("/website")
    public String test(Model model , HttpSession httpSession){

        httpSession.setAttribute("myName" , "satty");


        model.addAttribute("name" , "sattyda");
        List<User> userList = new ArrayList<>();

        userList.add( new User( "rat" , "123"));
        userList.add( new User( "cat" , "13"));
        userList.add( new User( "mat" , "789"));

        model.addAttribute("users" , userList );

        return "test";
    }

    @GetMapping("/profile")
    public String profile(Model model , HttpSession httpSession){

        model.addAttribute( "name" , httpSession.getAttribute("myName") );


        return "profile";
    }
}
