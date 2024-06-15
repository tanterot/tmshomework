package com.filmlib.service;
import com.filmlib.model.Film;
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

    public void add(Film film) {
        service.add(film);
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
}
