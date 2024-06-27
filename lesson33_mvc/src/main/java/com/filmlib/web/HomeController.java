package com.filmlib.web;

import com.filmlib.model.Film;
import com.filmlib.service.FilmService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;
@Controller
@RequestMapping(value = "/film")
@RequiredArgsConstructor
public class HomeController {

    private final FilmService filmService;

    @GetMapping("/home")
    public ModelAndView film() {
        List<Film> films = filmService.getAll();
        var modelAndView = new ModelAndView("film");
        modelAndView.addObject("films", films);

        return modelAndView;
    }
    @GetMapping("/delete")
    public ModelAndView showDelete(@RequestParam(name = "id") UUID id) {
        filmService.delete(id);
        List<Film> films = filmService.getAll();
        var modelAndView = new ModelAndView("film");
        modelAndView.addObject("films",films);
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView addFilm(@RequestParam(name = "name") String name,
                @RequestParam(name = "description") String description,
                @RequestParam(name = "year") Integer year) {
        Film film = filmService.filmFabric(name, description, year);
        filmService.add(film);
        List<Film> films = filmService.getAll();
        var modelAndView = new ModelAndView("film");
        modelAndView.addObject("films", films);
        return modelAndView;
    }


    @GetMapping("/update")
    public ModelAndView showUpdateForm(@RequestParam(name = "id") UUID id) {
        var film = filmService.getById(id);
        var modelAndView = new ModelAndView("update");
        modelAndView.addObject("films", film);
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(Film film) {
        val filmId = film.getId();
        filmService.update(film, filmId);
        List<Film> updatedFilms = filmService.getAll();
        var modelAndView = new ModelAndView("film");
        modelAndView.addObject("films", updatedFilms);
        return modelAndView;
    }
}
