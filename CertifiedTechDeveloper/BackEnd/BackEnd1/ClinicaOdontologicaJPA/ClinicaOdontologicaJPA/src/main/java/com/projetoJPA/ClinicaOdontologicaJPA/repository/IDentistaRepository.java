package com.projetoJPA.ClinicaOdontologicaJPA.repository;

import com.projetoJPA.ClinicaOdontologicaJPA.entity.DentistaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDentistaRepository extends JpaRepository<DentistaEntity, Long> {
}
