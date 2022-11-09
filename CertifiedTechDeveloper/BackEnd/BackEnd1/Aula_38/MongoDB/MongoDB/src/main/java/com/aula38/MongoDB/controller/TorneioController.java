package com.aula38.MongoDB.controller;

import com.aula38.MongoDB.model.TorneioModel;
import com.aula38.MongoDB.service.TorneioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/torneios")
public class TorneioController {
    private TorneioService service;

    public TorneioController(TorneioService service) {
        this.service = service;
    }

    @PostMapping
    public TorneioModel addTorneio(@RequestBody TorneioModel torneioModel){
        return service.salvarTorneio(torneioModel);
    }

    @GetMapping
    public List<TorneioModel> mostrarTorneios(){
        return service.listarTorneios();
    }
}
