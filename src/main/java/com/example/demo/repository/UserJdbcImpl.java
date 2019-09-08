package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcImpl{
    
    @Autowired
    JdbcTemplate jdbc;
    
    public int insertOne(User user){
        
         //１件登録
        int rowNumber = jdbc.update("INSERT INTO m_user(user_id,"
                + " password)"
                + " VALUES(?, ?)",
                user.getUserId(),
                user.getPassword());

        return rowNumber;
    }
}