package com.project.controller;

import com.project.domen.OrderEntity;
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
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final DataBaseService dataBaseService;

    @GetMapping
    public String getAllOrders(Model model) {
        List<PersonEntity> persons = dataBaseService.getAllPersons();
        model.addAttribute("persons", persons);
        return "";

    }

    @DeleteMapping
    public String deleteOrder(@RequestParam("id") UUID id) {
        dataBaseService.deleteOrder(id);
        return "";
    }

    @PostMapping
    public String saveOrder(@ModelAttribute("order") OrderEntity order) {
        dataBaseService.saveOrder(order);
        return "";
    }

    @GetMapping("/get")
    public String getOrder(@RequestParam("description") String description) {
        UUID id = dataBaseService.getIdByDescription(description);
        var order = dataBaseService.getOrder(id);
        ModelAndView modelAndView = new ModelAndView("person");
        modelAndView.addObject("order", order);
        return "";
    }
}
