package com.filmlib.service;


import com.filmlib.model.Film;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Data
@RequiredArgsConstructor
public class FilmService {

    private final DataBaseService service;

    public void add(@Valid Film film) {
        var name = film.getName();
        var description = film.getDescription();
        var year = film.getYear();
        var film1 = service.filmFabric(name, description, year);
        service.add(film1);
    }

    public List<Film> getAll() {
        return service.getAll();
    }

    public Film getById(UUID id) {
        return service.getById(id);
    }

    public void delete(UUID id) {
        service.delete(id);
    }

    public void update(Film film, UUID id) {
        service.update(film, id);
    }

    public Film filmFabric(String name, String description, Integer year) {
        return service.filmFabric(name, description, year);

    }
}
