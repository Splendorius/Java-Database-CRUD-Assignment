package com.example.bazy_danych_zadanie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Name_2RowMapper implements RowMapper<Name_2> {
    @Override
    public Name_2 mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Name_2(
                rs.getInt("id"),
                rs.getString("name")
        );
    }
}