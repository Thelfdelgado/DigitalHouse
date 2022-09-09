package com.projetoJPA.ClinicaOdontologicaJPA.controller;

import com.projetoJPA.ClinicaOdontologicaJPA.entity.PacienteEntity;
import com.projetoJPA.ClinicaOdontologicaJPA.service.impl.PacienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    PacienteServiceImpl service;

    @PostMapping("/adicionar")
    public PacienteEntity addPaciente(@RequestBody PacienteEntity pacienteEntity){
        return service.adicionar(pacienteEntity);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<PacienteEntity> listarPacientes(){
        return service.mostrarTodos();
    }

    @PutMapping("/modificar/{id}")
    public void modificarPaciente(@RequestBody PacienteEntity pacienteEntity){
        service.modificar(pacienteEntity);
    }

    @GetMapping("/{id}")
    public Optional<PacienteEntity> buscarPacientePorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluirPaciente(@PathVariable Long id){
        service.excluir(id);
    }
}
