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

    private final DataBaseService dataBaseService;

    @GetMapping("/get")
    public String getAll(Model model) {
        List<PersonEntity> persons = dataBaseService.getAllPersons();
        model.addAttribute("persons", persons);
        return "";
    }

    @DeleteMapping
    public String delete(@RequestParam("id") UUID id) {
        dataBaseService.deletePerson(id);
        return "";

    }

    @PostMapping
    public String savePerson(@ModelAttribute("person") PersonEntity person) {
        dataBaseService.savePerson(person);
        return "";
    }

    @GetMapping("/name")
    public String getByName(@RequestParam("username") String username) {
        List<PersonEntity> persons = dataBaseService.getPersonByUsername(username);
        return "";
    }

    @GetMapping("/age")
    public String findPerson(@RequestParam(name = "age") Integer age) {
        List<PersonEntity> persons = dataBaseService.findPersonByAge(age);
        return "";
    }


}


