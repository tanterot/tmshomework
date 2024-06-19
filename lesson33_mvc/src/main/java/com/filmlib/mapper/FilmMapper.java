package com.filmlib.mapper;

import com.filmlib.model.Film;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class FilmMapper implements RowMapper<Film> {
    @Override
    public Film mapRow(ResultSet rs, int rowNum) throws SQLException {
        UUID id = rs.getObject("id", UUID.class);
        String name = rs.getString("name");
        String description = rs.getString("description");
        int year = rs.getInt("year");
        return new Film(id,name,description,year);
    }
}
