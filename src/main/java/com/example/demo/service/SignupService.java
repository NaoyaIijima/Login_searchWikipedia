package com.example.demo.service;

import com.example.demo.repository.User;
import com.example.demo.repository.UserJdbcImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService{
    @Autowired
    UserJdbcImpl userJdbcImpl;
    
    public boolean isSignup(User user){        
        
        boolean result = true;
        
        int num = userJdbcImpl.insertOne(user);
        
        if(num<=0){
            result = false;
        }
        
        return result;
    }
}