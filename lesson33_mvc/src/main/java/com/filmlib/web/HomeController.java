package com.filmlib.web;

import com.filmlib.model.Film;
import com.filmlib.service.FilmService;
import lombok.RequiredArgsConstructor;
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

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView film() {
        List<Film> films = filmService.getAll();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("films", films);

        return modelAndView;
    }
    @GetMapping("/delete")
    public ModelAndView showUpdateForm(@RequestParam(name = "id") UUID id) {
        filmService.delete(id);
        List<Film> films = filmService.getAll();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("films",films);
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView addFilm(Film film) {
        filmService.add(film);
        List<Film> films = filmService.getAll();
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("films", films);
        return modelAndView;
    }
}
