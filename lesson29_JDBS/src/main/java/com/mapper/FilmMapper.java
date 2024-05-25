package com.mapper;

import com.model.Film;
import lombok.SneakyThrows;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FilmMapper {
    @SneakyThrows
    public Film map(ResultSet resultSet,boolean needNext) {
        if (needNext){
            resultSet.next();
        }
        Film film = new Film();
            UUID id = resultSet.getObject("id", UUID.class);
            String name = resultSet.getString("name");
            String description = resultSet.getString("description");
            int year = resultSet.getInt("year");
            boolean isViewed = resultSet.getBoolean("is_viewed");

            film.setId(id);
            film.setName(name);
            film.setDescription(description);
            film.setYear(year);
            film.setViewed(isViewed);
        return film;

    }

    @SneakyThrows
    public List<Film> maps(ResultSet resultSet) {
        List<Film> films = new ArrayList<>();
        while (resultSet.next()) {
            Film film = map(resultSet,false);
            if (film != null) {
                films.add(film);
            }
        }
        return films;

    }
}

