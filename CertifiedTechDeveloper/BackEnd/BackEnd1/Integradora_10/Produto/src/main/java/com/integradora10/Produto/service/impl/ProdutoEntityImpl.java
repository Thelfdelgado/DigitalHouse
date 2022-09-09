package com.integradora10.Produto.service.impl;

import com.integradora10.Produto.entity.ProdutoEntity;
import com.integradora10.Produto.repository.IProdutoRepository;
import com.integradora10.Produto.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoEntityImpl implements IService<ProdutoEntity> {
    @Autowired
    private IProdutoRepository repository;

    @Override
    public List<ProdutoEntity> findAllProdutos() {
        return repository.findAll();
    }

    @Override
    public Optional<ProdutoEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public String delete(Long id) {
        if (repository.findById(id).isPresent()){
            repository.deleteById(id);
            return "Produto Deletado!";
        }
        return "Produto Nao Encontrado!";
    }
}
