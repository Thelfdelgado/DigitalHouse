package com.projetoJPA.ClinicaOdontologicaJPA.service.impl;

import com.projetoJPA.ClinicaOdontologicaJPA.entity.PacienteEntity;
import com.projetoJPA.ClinicaOdontologicaJPA.repository.IPacienteRepository;
import com.projetoJPA.ClinicaOdontologicaJPA.service.IService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.LogManager.getLogger;

@Service
public class PacienteServiceImpl implements IService<PacienteEntity> {
    final static Logger log = getLogger(PacienteServiceImpl.class);

    @Autowired
    IPacienteRepository repository;

    @Override
    public PacienteEntity adicionar(PacienteEntity pacienteEntity) {
        if (pacienteEntity != null){
            log.info("Adicionando Paciente: " + pacienteEntity.getNome());
            return repository.save(pacienteEntity);
        }
        return new PacienteEntity();
    }

    @Override
    public List<PacienteEntity> mostrarTodos() {
        log.info("Listando Pacientes!");
        return repository.findAll();
    }

    @Override
    public void modificar(PacienteEntity pacienteEntity) {
        if (pacienteEntity != null && repository.findById(pacienteEntity.getId()).isPresent()){
            log.info("Modificando Paciente: " + pacienteEntity.getId());
            repository.saveAndFlush(pacienteEntity);
        }
        log.error("Paciente Nao Encontrado!");
    }

    @Override
    public Optional<PacienteEntity> buscarPorId(Long id) {
        log.info("Listando Paciente Por Id: " + id);
        return repository.findById(id);
    }

    @Override
    public void excluir(Long id) {
        if (repository.findById(id).isPresent()){
            log.info("Excluindo Paciente: " + id);
            repository.deleteById(id);
        }
        log.error("Paciente Nao Encontrado!");
    }
}
