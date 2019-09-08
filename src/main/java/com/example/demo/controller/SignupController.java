package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController{
    
    @Autowired
    
    
    @GetMapping("/signup")
    public String getMethod(){
        return "signup";
    }
    
    @PostMapping("/signup")
    public String postRequest(Model model){
        
        // データベースへ登録する処理
        // 失敗した場合はsignup画面へ戻る
        
        
        return "redirect:/login";
    }
    
}