package com.aula49.Documentacao.controller;

import com.aula49.Documentacao.model.ProdutoModel;
import com.aula49.Documentacao.service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    private ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @Operation(summary = "Registrando novo produto")// Descricao no Swegger
    @PostMapping
    public ProdutoModel salvarProduto(@RequestBody ProdutoModel produtoModel){
        return service.salvar(produtoModel);
    }

    @GetMapping
    public List<ProdutoModel> buscarTodos(){
        return service.salvarTodos();
    }

    @GetMapping("{id}")
    public ProdutoModel buscarId(@PathVariable Integer id){
        return service.buscarId(id);
    }

    @DeleteMapping("{id}")
    public String deletarProduto(@PathVariable Integer id){
        service.delete(id);
        return "Produto Deletado!";
    }
}
