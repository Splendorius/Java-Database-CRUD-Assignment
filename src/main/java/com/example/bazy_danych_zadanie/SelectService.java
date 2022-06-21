package com.example.bazy_danych_zadanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectService {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Name_2> findAll() {
        String sql = "SELECT * FROM  zadania.table_1 LIMIT 100; ";
        return jdbcTemplate.query(sql,new Name_2RowMapper());
    }}