package com.example.Clinica.controller;

import com.example.Clinica.model.Dentista;
import com.example.Clinica.model.Usuario;
import com.example.Clinica.service.ClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clinica")
public class ClinicaController {
    private ClinicaService clinicaService;

    @Autowired
    public ClinicaController(ClinicaService clinicaService) {
        this.clinicaService = clinicaService;
    }

    @GetMapping("/usuario")
    public List<Usuario> getUsuario(){
        return clinicaService.usuarioList();
    }

    @GetMapping("/dentista")
    public List<Dentista> getDentista(){
        return clinicaService.dentistaList();
    }
}
