package com.aula46.TesteIntegrador.service;

import com.aula46.TesteIntegrador.model.LinguagemModel;
import com.aula46.TesteIntegrador.repository.LinguagemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinguagemService {
    private LinguagemRepository repository;

    public LinguagemService() {
        this.repository = new LinguagemRepository();
    }

    public LinguagemModel buscarPorTipo(String tipo){
        return repository.buscarPorTipo(tipo);
    }

    public List<LinguagemModel> buscarTodos(){
        return repository.buscarTodos();
    }
}
