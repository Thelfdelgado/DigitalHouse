package com.example.Clinica.service;

import com.example.Clinica.model.Dentista;
import com.example.Clinica.model.Usuario;

import java.util.List;

public interface ClinicaService {
    List<Usuario> usuarioList();
    List<Dentista> dentistaList();
}
