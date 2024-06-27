package com.project.controller;

import com.project.domen.PersonEntity;
import com.project.service.PersonsDataBaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonsDataBaseService personsDataBaseService;

    @GetMapping
    public String getAll(){
        List<PersonEntity> allPersons = personsDataBaseService.getAllPersons();
        return "";
    }

    @DeleteMapping
    public String delete(@RequestParam(name= "username") String username){
        personsDataBaseService.delete(username);
        return "";


    }
    @PutMapping
    public String update(@RequestParam(name = "username") String username) {
        try {
            personsDataBaseService.update(username);
        } catch (Exception exc) {
            System.out.println("");
        }
        return "";
    }
}

