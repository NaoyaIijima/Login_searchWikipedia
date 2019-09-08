package com.example.demo.controller;

import com.example.demo.form.SignupForm;
import com.example.demo.service.SignupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController{
    
    @Autowired
    SignupService signupService;
    
    @GetMapping("/signup")
    public String getMethod(@ModelAttribute SignupForm form, Model model){
        return "signup";
    }
    
    @PostMapping("/signup")
    public String postRequest(@ModelAttribute SignupForm form, Model model){
        
        System.out.println(form);

        
//        // データベースへ登録する処理
//        // 失敗した場合はsignup画面へ戻る
//        boolean result = signupService(user);
//        
//        if(result==false){
//            return "signup";
//        }
        
        return "redirect:/login";
    }
    
}