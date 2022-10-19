package com.aula28.EcommerceCliente;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ProdutoClienteController {
    private ProdutoCliente produtoCliente = new ProdutoCliente();

    @PostMapping("/salvar")
    public Produto salvarProduto(@RequestBody Produto produto){
        return produtoCliente.salvar(produto);
    }

    @GetMapping
    public List<Produto> buscarTodos(){
        return produtoCliente.buscarTodos();
    }

    @PutMapping("/alterar")
    public Produto alterar(@RequestBody Produto produto){
        return produtoCliente.alterar(produto);
    }

    @DeleteMapping("/{id}")
    public String excluir(@PathVariable int id){
        return produtoCliente.excluir(id);
    }
}
