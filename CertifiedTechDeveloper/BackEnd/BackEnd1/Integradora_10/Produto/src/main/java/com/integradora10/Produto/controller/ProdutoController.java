package com.integradora10.Produto.controller;

import com.integradora10.Produto.entity.ProdutoEntity;
import com.integradora10.Produto.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    IService service;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<ProdutoEntity> buscarTodos(){
        return service.findAllProdutos();
    }

    @GetMapping("/{id}")
    public Optional<ProdutoEntity> buscarPorId(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public String excluir(@PathVariable Long id){
        return service.delete(id);
    }
}
