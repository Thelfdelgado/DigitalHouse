package com.aula34.EsporteHQL.service.impl;

import com.aula34.EsporteHQL.entity.JogadorEntity;
import com.aula34.EsporteHQL.repository.IJogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {
    private IJogadorRepository jogadorRepository;

    @Autowired
    public JogadorService(IJogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    public List<JogadorEntity> buscarTodos(){
        return jogadorRepository.findAll();
    }

    public JogadorEntity buscarPorNome(String nome){
        return jogadorRepository.findJogadorByName(nome).get();
    }
}
