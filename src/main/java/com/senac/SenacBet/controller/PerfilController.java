package com.senac.SenacBet.controller;

import com.senac.SenacBet.dao.PerfilDAO;
import com.senac.SenacBet.model.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PerfilController {

    @Autowired
    PerfilDAO dao;

    @GetMapping("/perfil")
    public String abrirTela(Perfil perfil){
        return "perfil";
    }

    @PostMapping("/perfil")
    public String postPerfil(Perfil perfil) {
        dao.save(perfil);

        return "perfil";
    }

    @GetMapping("/lista-perfil")
    public String listarPerfil(Model model) {
        model.addAttribute("perfis", dao.findAll());

        return "lista-perfil";
    }
}
