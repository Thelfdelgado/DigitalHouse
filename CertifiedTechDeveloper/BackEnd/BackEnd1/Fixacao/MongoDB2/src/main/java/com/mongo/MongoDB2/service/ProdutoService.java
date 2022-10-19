package com.mongo.MongoDB2.service;

import com.mongo.MongoDB2.model.ProdutoModel;
import com.mongo.MongoDB2.repository.IProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private IProdutoRepository repository;

    public ProdutoService(IProdutoRepository repository) {
        this.repository = repository;
    }

    public ProdutoModel salvar(ProdutoModel produtoModel){
        return repository.save(produtoModel);
    }

    public List<ProdutoModel> buscarTodos(){
        return repository.findAll();
    }
}
