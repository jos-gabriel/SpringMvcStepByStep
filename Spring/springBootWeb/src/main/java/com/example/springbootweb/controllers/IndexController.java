package com.example.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

    //@RequestMapping (value = "/index", method = RequestMethod.GET)
    @GetMapping (value = {"/index", "/", "","/home"})
    public String index(Model model){
        model.addAttribute("titulo", "Hola Spring Framework Model");
        return "index";
    }
}