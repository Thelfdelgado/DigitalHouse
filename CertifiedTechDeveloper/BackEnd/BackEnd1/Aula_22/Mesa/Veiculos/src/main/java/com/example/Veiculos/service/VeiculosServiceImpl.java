package com.example.Veiculos.service;

import com.example.Veiculos.modal.Veiculos;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VeiculosServiceImpl implements VeiculosService{
    @Override
    public List<Veiculos> listVeiculos() {
        return Arrays.asList(new Veiculos("Civic"), new Veiculos("Supra"));
    }
}
