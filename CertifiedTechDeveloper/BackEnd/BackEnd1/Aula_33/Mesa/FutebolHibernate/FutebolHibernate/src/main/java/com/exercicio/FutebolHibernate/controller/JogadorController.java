package com.exercicio.FutebolHibernate.controller;

import com.exercicio.FutebolHibernate.entity.JogadorEntity;
import com.exercicio.FutebolHibernate.service.impl.JogadorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    @Autowired
    JogadorServiceImpl jogadorService;

    @PostMapping
    public JogadorEntity addJogador(@RequestBody JogadorEntity jogadorEntity){
        return jogadorService.cadastrar(jogadorEntity);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<JogadorEntity> listarJogadores(){
        return jogadorService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Optional<JogadorEntity> buscarJogadorPorId(@PathVariable Long id){
        return jogadorService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirJogador(@PathVariable Long id){
        jogadorService.excluir(id);
    }

    @PutMapping("/{id}")
    public void atualizarJogador(@RequestBody JogadorEntity jogadorEntity){
        jogadorService.atualizar(jogadorEntity);
    }
}
