package com.filmlib.web;

import com.filmlib.model.Film;
import com.filmlib.service.FilmService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/film")
@RequiredArgsConstructor
public class UpdateController {
    FilmService filmService = new FilmService();
    @GetMapping("/update")
    public ModelAndView showUpdateForm(@RequestParam(name = "id") UUID id) {
        Film film = filmService.getById(id);
        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject("films", film);
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(Film film) {
        filmService.update(film, film.getId());
        List<Film> updatedFilms = filmService.getAll();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("films", updatedFilms);
        return modelAndView;
    }
}
