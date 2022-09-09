package com.projetoJPA.ClinicaOdontologicaJPA.service.impl;

import com.projetoJPA.ClinicaOdontologicaJPA.entity.DentistaEntity;
import com.projetoJPA.ClinicaOdontologicaJPA.repository.IDentistaRepository;
import com.projetoJPA.ClinicaOdontologicaJPA.service.IService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.LogManager.getLogger;

@Service
public class DentistaServiceImpl implements IService<DentistaEntity> {
    final static Logger log = getLogger(DentistaServiceImpl.class);

    @Autowired
    IDentistaRepository repository;

    @Override
    public DentistaEntity adicionar(DentistaEntity dentistaEntity) {
        if (dentistaEntity != null){
            log.info("Adicionando novo Dentista: " + dentistaEntity.getNome());
            return repository.save(dentistaEntity);
        }
        return new DentistaEntity();
    }

    @Override
    public List<DentistaEntity> mostrarTodos() {
        log.info("Listando Dentistas!");
        return repository.findAll();
    }

    @Override
    public void modificar(DentistaEntity dentistaEntity) {
        if (dentistaEntity != null && repository.findById(dentistaEntity.getId()).isPresent()){
            log.info("Modificando Dentista: " + dentistaEntity.getId());
            repository.saveAndFlush(dentistaEntity);
        }
        log.error("Dentista Nao Encontrado!");
    }

    @Override
    public Optional<DentistaEntity> buscarPorId(Long id) {
        log.info("Listando Dentista Por Id: " + id);
        return repository.findById(id);
    }

    @Override
    public void excluir(Long id) {
        if (repository.findById(id).isPresent()){
            log.info("Excluindo Dentista: " + id);
            repository.deleteById(id);
        }
        log.error("Dentista Nao Encontrado!");
    }
}
