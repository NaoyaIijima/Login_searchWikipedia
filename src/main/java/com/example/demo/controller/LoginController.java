package com.example.demo.controller;

import com.example.demo.form.SignupForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController{
    
    @Autowired
    SignupService signupService;
    
    /**
     * ログイン画面のGETメソッド用処理.
     */
    @GetMapping("/login")
    public String getLogin(@ModelAttribute SignupForm form, Model model) {

        //login.htmlに画面遷移
        return "login";
    }

    /**
     * ログイン画面のPOSTメソッド用処理.
     */
    @PostMapping("/login")
    public String postLogin(@ModelAttribute SignupForm form, Model model) {

        System.out.println(form);
        
        // データベースに登録されているかを確認
        boolean result = true;
        
        
        
        //login.htmlに画面遷移
        return "redirect:/home";
    }
}