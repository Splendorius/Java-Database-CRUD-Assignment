package com.example.bazy_danych_zadanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Cont {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping(path = "addName")
    public String addName(Name name) {
       String insert_query = "INSERT INTO zadania.table_1(" +"Name)" + "VALUES" + "(?);";
       int rows = jdbcTemplate.update(insert_query,Name.getName());
        if(rows==1){
        return "OK";
    }
    else{
        return "NO";
        }

    }
}
