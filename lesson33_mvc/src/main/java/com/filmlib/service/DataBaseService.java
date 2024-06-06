package com.filmlib.service;

import com.filmlib.model.Film;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
@Data
public class DataBaseService {
    private static List<Film> films = new ArrayList<>();

    static {
        films.add(new Film("Titanic","Titanic is a 1997 American epic romantic disaster film directed, written, produced, and co-edited by James Cameron. Incorporating both historical and fictionalized aspects, it is based on accounts of the sinking of RMS Titanic in 1912. Leonardo DiCaprio and Kate Winslet star as members of different social classes who fall in love during the ship's maiden voyage."
                ,1995,true));
        films.add(new Film("RoboCop","RoboCop is a 1987 American science fiction action film directed by Paul Verhoeven and written by Edward Neumeier and Michael Miner"
                ,1999,true));
    }

    public void add(Film film){
        films.add(film);
    }

    public List<Film> getAll(){
        return films;
    }

    public Film getById(UUID id){
        var film = films.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst();
        return film
                .orElseThrow(()-> new RuntimeException("film not found"));
    }

    public void delete(UUID id) {
        Film byId = getById(id);
        films.remove(byId);
    }

    public void update(Film film, UUID id) {
        for (var items: films){
            if (items.getId().equals(id)){
                items.setName(film.getName());
                items.setDescription(film.getDescription());
                items.setYear(film.getYear());
                items.setViewed(film.getIsViewed());
            }
        }
    }
}
