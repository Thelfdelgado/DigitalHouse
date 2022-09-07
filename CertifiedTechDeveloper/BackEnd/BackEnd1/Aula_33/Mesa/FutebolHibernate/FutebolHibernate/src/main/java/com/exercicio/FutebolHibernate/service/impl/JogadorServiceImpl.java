package com.exercicio.FutebolHibernate.service.impl;

import com.exercicio.FutebolHibernate.entity.JogadorEntity;
import com.exercicio.FutebolHibernate.repository.IJogadorRepository;
import com.exercicio.FutebolHibernate.service.IService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.LogManager.getLogger;

@Service
public class JogadorServiceImpl implements IService<JogadorEntity> {
    final static Logger log = getLogger(JogadorServiceImpl.class);

    @Autowired
    IJogadorRepository iJogadorRepository;

    @Override
    public JogadorEntity cadastrar(JogadorEntity jogadorEntity) {
        if (iJogadorRepository != null){
            log.info("Jogador Cadastrado: " + jogadorEntity.getNome());
            iJogadorRepository.save(jogadorEntity);
        }
        return new JogadorEntity();
    }

    @Override
    public List<JogadorEntity> buscarTodos() {
        return iJogadorRepository.findAll();
    }

    @Override
    public Optional<JogadorEntity> buscarPorId(Long id) {
        return iJogadorRepository.findById(id);
    }

    @Override
    public void excluir(Long id) {
        if (iJogadorRepository != null){
            log.info("Jogador Excluido: " + id);
            iJogadorRepository.deleteById(id);
        }
        log.error("Jogador Nao Encontrado!");
    }

    @Override
    public void atualizar(JogadorEntity jogadorEntity) {
        if (iJogadorRepository != null){
            log.info("Jogador Atualizado: " + jogadorEntity.getId());
            iJogadorRepository.saveAndFlush(jogadorEntity);
        }
        log.error("Jogador Nao Encontrado!");
    }
}
