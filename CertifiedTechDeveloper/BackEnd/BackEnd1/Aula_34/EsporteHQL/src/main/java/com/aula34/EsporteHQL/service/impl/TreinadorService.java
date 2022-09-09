package com.aula34.EsporteHQL.service.impl;

import com.aula34.EsporteHQL.entity.TreinadorEntity;
import com.aula34.EsporteHQL.repository.ITreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreinadorService {
    private ITreinadorRepository repository;

    @Autowired
    public TreinadorService(ITreinadorRepository repository){
        this.repository = repository;
    }

    public List<TreinadorEntity> buscarTodos(){
        return repository.findAll();
    }

    public TreinadorEntity buscarPorIdade(Integer idade){
        return repository.findTreinadorByAge(idade).get();
    }
}
