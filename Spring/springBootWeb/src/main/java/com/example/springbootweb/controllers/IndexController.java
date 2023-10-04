package com.example.springbootweb.controllers;

import com.example.springbootweb.models.Usuario;
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

    @RequestMapping("/perfil")
    public String perfil(ModelMap model){

        Usuario usuario = new Usuario();
        usuario.setNombre("Andrés");
        usuario.setApellido("Pérez");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));

        return "perfil";
    }
}