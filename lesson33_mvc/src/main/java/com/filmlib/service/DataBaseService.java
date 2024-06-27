package com.filmlib.service;

import com.filmlib.exc.DescriptionException;
import com.filmlib.exc.NameException;
import com.filmlib.model.Film;
import lombok.Data;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Data
public class DataBaseService {
    private static List<Film> films = new ArrayList<>();
    private ObjectProvider<Connection> connectionProvider;

    static {
        films.add(new Film("Titanic", "Titanic is a 1997 American."
                , 1995));
        films.add(new Film("RoboCop", "RoboCop is a 1987 American."
                , 1999));
    }

    public Film filmFabric(String name, String description, Integer year) {
        return new Film(name, description, year);

    }

    public void add(Film film) {
        if (film.getName().equals("test")) {
            throw new NameException("Film name is too long");
        }
        if (film.getDescription().equals("testD")) {
            throw new DescriptionException("Film description is bad");
        }
        films.add(film);
    }

    public List<Film> getAll() {
        return films;
    }

    public Film getById(UUID id) {
        var film = films.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst();
        return film
                .orElseThrow(() -> new RuntimeException("film not found"));
    }

    public void delete(UUID id) {
        Film byId = getById(id);
        films.remove(byId);
    }

    public void update(Film film, UUID id) {
        for (var items : films) {
            if (items.getId().equals(id)) {
                items.setName(film.getName());
                items.setDescription(film.getDescription());
                items.setYear(film.getYear());
            }
        }
    }
}
