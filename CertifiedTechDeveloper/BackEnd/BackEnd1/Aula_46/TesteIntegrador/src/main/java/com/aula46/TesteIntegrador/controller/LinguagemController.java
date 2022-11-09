package com.aula46.TesteIntegrador.controller;

import com.aula46.TesteIntegrador.model.LinguagemModel;
import com.aula46.TesteIntegrador.service.LinguagemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {
    private LinguagemService service;

    public LinguagemController() {
        this.service = new LinguagemService();
    }

    @GetMapping("/linguagens/{tipo}")
    public ResponseEntity<?> buscarPorTipo(@PathVariable ("tipo") String tipo){
        LinguagemModel linguagemModel = service.buscarPorTipo(tipo);

        if (linguagemModel == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(linguagemModel, HttpStatus.OK);
    }

    @GetMapping("/linguagens")
    public ResponseEntity<?> buscarTodos(){
        return new ResponseEntity<>(service, HttpStatus.OK);
    }
}
