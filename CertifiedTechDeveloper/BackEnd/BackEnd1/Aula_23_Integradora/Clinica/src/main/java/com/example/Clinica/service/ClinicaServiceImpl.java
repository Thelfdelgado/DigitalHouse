package com.example.Clinica.service;

import com.example.Clinica.model.Dentista;
import com.example.Clinica.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClinicaServiceImpl implements ClinicaService{
    @Override
    public List<Usuario> usuarioList() {
        return Arrays.asList(new Usuario("Luiz", "luiz@dh.com", "1234", 2),
                new Usuario("Luiz2", "luiz2@dh.com", "4321", 1));
    }

    @Override
    public List<Dentista> dentistaList() {
        return Arrays.asList(new Dentista("Delgado", 123345234, true),
                new Dentista("Delgado2", 123123123, false));
    }
}
