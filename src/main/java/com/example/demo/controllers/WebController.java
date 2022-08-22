package com.example.demo.controllers;

import com.example.demo.entities.Response;
import com.example.demo.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;


@RestController
public class WebController {

    @PostMapping("/test")
    public ResponseEntity<Response> test(@RequestBody User user, @RequestParam("q") String name){

        Response response = new Response();

        if( user.getUsername().equals("test") ){
            response.setStatus("success");
        } else {
            response.setStatus("failure");
        }

        return new ResponseEntity<Response>( response , HttpStatus.OK );
    }

    @GetMapping("/myname/{name}/{color}")
    public String myName(  ){
        return  "hi";



    }


}
