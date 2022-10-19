package com.aula38.MongoDB.controller;

import com.aula38.MongoDB.model.PartidaModel;
import com.aula38.MongoDB.service.PartidaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidas")
public class PartidaController {
    private PartidaService service;

    public PartidaController(PartidaService service) {
        this.service = service;
    }

    @PostMapping
    public PartidaModel salvarPartida(@RequestBody PartidaModel partidaModel){
        return service.adicionar(partidaModel);
    }

    @GetMapping
    public List<PartidaModel> listarPartidas(){
        return service.mostrarTodos();
    }

    @GetMapping("/ao-vivo ")
    public List<PartidaModel> mostrarPartidaAoVivo(){
        return service.partidaAoVivo();
    }
}
