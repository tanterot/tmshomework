package com.project.controller;

import com.project.domen.PersonEntity;
import com.project.service.DataBaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final DataBaseService personsDataBaseService;

    @GetMapping
    public String getAll(Model model) {
        List<PersonEntity> persons = personsDataBaseService.getAllPersons();
        model.addAttribute("persons", persons);
        return "persons";
    }

    @DeleteMapping
    public String delete(@RequestParam("id") UUID id) {
        personsDataBaseService.deletePerson(id);
        return "redirect:/persons";

    }

    @PostMapping
    public ModelAndView savePerson(@ModelAttribute("person") PersonEntity person) {
        personsDataBaseService.savePerson(person);
        return new ModelAndView("redirect:/persons");
    }

    @GetMapping("/get")
    public ModelAndView getPerson(@RequestParam("username") String username) {
        UUID id = personsDataBaseService.getIdByUsername(username);
        PersonEntity person = personsDataBaseService.getPerson(id);
        ModelAndView modelAndView = new ModelAndView("person");
        modelAndView.addObject("person", person);
        return modelAndView;
    }
}


