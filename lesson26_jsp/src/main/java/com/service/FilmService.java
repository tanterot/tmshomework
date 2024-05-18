package com.service;

import com.model.Film;

import java.util.List;
import java.util.UUID;

public class FilmService {
    DataBaseService service = new DataBaseService();

    public void add(Film film){
        service.add(film);
    }
    public List<Film> getAll(){
        return service.getAll();
    }

    public Film  getById(UUID id){
        return service.getById(id);
    }

    public void delete(UUID id) {
        service.delete(id);
    }

    public void update(Film film, UUID id) {
        service.update(film,id);
    }
}
