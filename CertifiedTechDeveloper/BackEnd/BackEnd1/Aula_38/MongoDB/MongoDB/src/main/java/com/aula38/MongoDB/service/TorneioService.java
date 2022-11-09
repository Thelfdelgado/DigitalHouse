package com.aula38.MongoDB.service;

import com.aula38.MongoDB.model.TorneioModel;
import com.aula38.MongoDB.repository.ITorneioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorneioService {
    private ITorneioRepository repository;

    public TorneioService(ITorneioRepository repository) {
        this.repository = repository;
    }

    public TorneioModel salvarTorneio(TorneioModel torneioModel){
        return repository.save(torneioModel);
    }

    public List<TorneioModel> listarTorneios(){
        return repository.findAll();
    }
}
