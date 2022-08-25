package com.example.Veiculos.controller;

import com.example.Veiculos.modal.Veiculos;
import com.example.Veiculos.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {
    private final VeiculosService veiculosService;

    @Autowired
    public VeiculosController(VeiculosService veiculosService){
        this.veiculosService = veiculosService;
    }

    @GetMapping
    public List<Veiculos> getVeiculos(){
        return veiculosService.listVeiculos();
    }
}
