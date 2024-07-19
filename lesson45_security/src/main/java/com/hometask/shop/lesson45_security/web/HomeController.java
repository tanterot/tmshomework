package com.hometask.shop.lesson45_security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/order")
    public String order() {
        return "order";
    }

    @GetMapping("/task")
    public String task() {
        return "task";
    }

}
