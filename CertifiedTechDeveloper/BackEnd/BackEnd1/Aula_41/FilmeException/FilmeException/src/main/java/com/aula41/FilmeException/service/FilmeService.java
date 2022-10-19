package com.aula41.FilmeException.service;

import com.aula41.FilmeException.model.FilmeModel;
import com.aula41.FilmeException.repository.IFilmeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {
    private final IFilmeRepository repository;

    public FilmeService(IFilmeRepository repository) {
        this.repository = repository;
    }

    public FilmeModel salvar(FilmeModel filmeModel){
        return repository.save(filmeModel);
    }

    public List<FilmeModel> buscarTodos(){
        return repository.findAll();
    }

    public FilmeModel buscarPorId(Integer id){
        return repository.findById(id).get();
    }

    public FilmeModel atualizar(FilmeModel filmeModel){
        return repository.saveAndFlush(filmeModel);
    }

    public void deletar(Integer id){
        repository.deleteById(id);
    }
}
