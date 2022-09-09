package com.projetoJPA.ClinicaOdontologicaJPA.repository;

import com.projetoJPA.ClinicaOdontologicaJPA.entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepository extends JpaRepository<PacienteEntity, Long> {
}
