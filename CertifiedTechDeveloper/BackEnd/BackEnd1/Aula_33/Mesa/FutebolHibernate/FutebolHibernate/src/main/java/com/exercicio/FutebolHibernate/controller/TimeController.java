package com.exercicio.FutebolHibernate.controller;

import com.exercicio.FutebolHibernate.entity.TimeEntity;
import com.exercicio.FutebolHibernate.service.impl.TimeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/times")
public class TimeController {
    @Autowired
    TimeServiceImpl timeService;

    @PostMapping
    public TimeEntity cadastrarTime(@RequestBody TimeEntity timeEntity){
        return timeService.cadastrar(timeEntity);
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<TimeEntity> listarTimes(){
        return timeService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Optional<TimeEntity> listarTimePorId(@PathVariable Long id){
        return timeService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirTime(@PathVariable Long id){
        timeService.excluir(id);
    }

    @PutMapping("/{id}")
    public void atualizarTime(@RequestBody TimeEntity timeEntity){
        timeService.atualizar(timeEntity);
    }
}
