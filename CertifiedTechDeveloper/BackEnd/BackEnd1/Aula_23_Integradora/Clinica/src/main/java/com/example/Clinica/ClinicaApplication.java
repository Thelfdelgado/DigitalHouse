package com.example.Clinica;

import com.example.Clinica.dao.ConfigJDBC;
import com.example.Clinica.dao.DentistaDaoH2;
import com.example.Clinica.dao.UsuarioDaoH2;
import com.example.Clinica.model.Usuario;
import com.example.Clinica.service.DentistaService;
import com.example.Clinica.service.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClinicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaApplication.class, args);

		UsuarioService usuarioService;
		DentistaService dentistaService;

		usuarioService = new UsuarioService(new UsuarioDaoH2(new ConfigJDBC()));
		dentistaService = new DentistaService(new DentistaDaoH2(new ConfigJDBC()));


	}
}
