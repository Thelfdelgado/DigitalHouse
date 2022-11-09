package com.mongo.MongoDB2.controller;

import com.mongo.MongoDB2.model.ProdutoModel;
import com.mongo.MongoDB2.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public ProdutoModel salvarProduto(@RequestBody ProdutoModel produtoModel){
        return service.salvar(produtoModel);
    }

    @GetMapping
    public List<ProdutoModel> buscarTodos(){
        return service.buscarTodos();
    }
}
