package com.projetoJPA.ClinicaOdontologicaJPA.controller;

import com.projetoJPA.ClinicaOdontologicaJPA.entity.DentistaEntity;
import com.projetoJPA.ClinicaOdontologicaJPA.service.impl.DentistaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dentistas")
public class DentistaController {
    @Autowired
    DentistaServiceImpl service;

    @PostMapping("/adicionar")
    public DentistaEntity addDentista(@RequestBody DentistaEntity dentistaEntity){
        return service.adicionar(dentistaEntity);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<DentistaEntity> mostrarDentistas(){
        return service.mostrarTodos();
    }

    @PutMapping("/modificar/{id}")
    public void modificarDentista(@RequestBody DentistaEntity dentistaEntity){
        service.modificar(dentistaEntity);
    }

    @GetMapping("/{id}")
    public Optional<DentistaEntity> buscarDentistaPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluirDentista(@PathVariable Long id){
        service.excluir(id);
    }
}
