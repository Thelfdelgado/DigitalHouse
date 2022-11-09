package com.aula38.MongoDB.service;

import com.aula38.MongoDB.model.EstadoModel;
import com.aula38.MongoDB.model.PartidaModel;
import com.aula38.MongoDB.repository.IPartidaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaService {
    private IPartidaRepository repository;

    public PartidaService(IPartidaRepository repository) {
        this.repository = repository;
    }

    public PartidaModel adicionar(PartidaModel partidaModel){
        return repository.save(partidaModel);
    }

    public List<PartidaModel> mostrarTodos(){
        return repository.findAll();
    }

    public List<PartidaModel> partidaAoVivo(){
        return repository.findAllByEstado(EstadoModel.AO_VIVO);
    }
}
