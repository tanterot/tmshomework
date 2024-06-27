package com.filmlib.web;

import com.filmlib.model.Film;
import com.filmlib.service.FilmService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public ModelAndView film(@ModelAttribute(name = "filmModel") Film film) {
        List<Film> films = filmService.getAll();
        var modelAndView = new ModelAndView("film");
        modelAndView.addObject("films", films);

        return modelAndView;
    }

    @GetMapping("/delete")
    public ModelAndView showDelete(@ModelAttribute(name = "filmModel") Film film, @RequestParam(name = "id") UUID id) {
        filmService.delete(id);
        List<Film> films = filmService.getAll();
        var modelAndView = new ModelAndView("film");
        modelAndView.addObject("films", films);
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView addFilm(@ModelAttribute(name = "filmModel") @Valid Film film1, BindingResult bindingResult, Model model) {

        if (!bindingResult.hasErrors()) {
            model.addAttribute("filmModel", new Film());
        }

        filmService.add(film1);
        List<Film> films = filmService.getAll();
        var modelAndView = new ModelAndView("film");
        modelAndView.addObject("films", films);
        return modelAndView;
    }


    @GetMapping("/update")
    public ModelAndView showUpdateForm(@RequestParam(name = "id") String id) {
        UUID uuid = UUID.fromString(id);
        var film = filmService.getById(uuid);
        var modelAndView = new ModelAndView("update");
        modelAndView.addObject("films", film);
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(@ModelAttribute(name = "filmModel") @Valid Film film) {
        val filmId = film.getId();
        filmService.update(film, filmId);
        List<Film> updatedFilms = filmService.getAll();
        var modelAndView = new ModelAndView("film");
        modelAndView.addObject("films", updatedFilms);
        return modelAndView;
    }

}
