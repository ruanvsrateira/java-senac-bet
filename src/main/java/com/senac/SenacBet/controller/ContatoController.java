package com.senac.SenacBet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContatoController {

    @GetMapping("/contato")
    public String abrirContato(){
        return "contato";
    }

    @PostMapping("/contato")
    public String processarContato(){
        return "contato";
    }

}
