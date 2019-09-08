package com.example.demo.controller;



@Controller
public class LoginController{
    @GetMapping("/login")
    public getLogin(){
        return "login";
    }
}