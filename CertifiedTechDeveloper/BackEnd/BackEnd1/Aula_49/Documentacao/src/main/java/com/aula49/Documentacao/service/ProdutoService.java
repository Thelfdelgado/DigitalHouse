package com.aula49.Documentacao.service;

import com.aula49.Documentacao.model.ProdutoModel;
import com.aula49.Documentacao.repository.IProdutoRepository;
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

    public List<ProdutoModel> salvarTodos(){
        return repository.findAll();
    }

    public ProdutoModel buscarId(Integer id){
        return repository.findById(id).get();
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
