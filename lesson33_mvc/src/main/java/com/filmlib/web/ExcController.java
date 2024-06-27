package com.filmlib.web;

import com.filmlib.exc.DescriptionException;
import com.filmlib.exc.NameException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcController {


    @ExceptionHandler(NameException.class)
    public String processErrors(NameException exc, Model model) {
        model.addAttribute("message", exc.getMessage());
        return "errorPages";
    }

    @ExceptionHandler(DescriptionException.class)
    public String processErrors(DescriptionException exc, Model model) {
        model.addAttribute("message", exc.getMessage());
        return "errorPages";
    }
}


