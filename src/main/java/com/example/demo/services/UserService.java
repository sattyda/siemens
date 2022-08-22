package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public void saveUser( User user){

        userRepo.save( user);
    }

    public List<User> getUsrs() {

        return userRepo.findAll( );

    }
}
