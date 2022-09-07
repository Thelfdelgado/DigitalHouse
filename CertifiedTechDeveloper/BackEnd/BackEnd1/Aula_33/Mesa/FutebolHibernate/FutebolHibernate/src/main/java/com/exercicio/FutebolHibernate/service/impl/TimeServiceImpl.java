package com.exercicio.FutebolHibernate.service.impl;

import com.exercicio.FutebolHibernate.entity.TimeEntity;
import com.exercicio.FutebolHibernate.repository.ITimeRepository;
import com.exercicio.FutebolHibernate.service.IService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.LogManager.getLogger;

@Service
public class TimeServiceImpl implements IService<TimeEntity> {
    final static Logger log = getLogger(TimeServiceImpl.class);

    @Autowired
    ITimeRepository iTimeRepository;

    @Override
    public TimeEntity cadastrar(TimeEntity timeEntity) {
        if (iTimeRepository != null){
            log.info("Time Cadastrado: " + timeEntity.getNome());
            iTimeRepository.save(timeEntity);
        }
        return new TimeEntity();
    }

    @Override
    public List<TimeEntity> buscarTodos() {
        log.info("Listando Todos os Times!");
        return iTimeRepository.findAll();
    }

    @Override
    public Optional<TimeEntity> buscarPorId(Long id) {
        log.info("Listando Time Pela Id: " + id);
        return iTimeRepository.findById(id);
    }

    @Override
    public void excluir(Long id) {
        if (iTimeRepository != null){
            log.info("Time Excluido: " + id);
            iTimeRepository.deleteById(id);
        }
        log.error("Time Nao Encontrado!");
    }

    @Override
    public void atualizar(TimeEntity timeEntity) {
        if (iTimeRepository != null){
            log.info("Time Atualizado: " + timeEntity.getId());
            iTimeRepository.saveAndFlush(timeEntity);
        }
        log.error("Time Nao Encontrado!");
    }
}
