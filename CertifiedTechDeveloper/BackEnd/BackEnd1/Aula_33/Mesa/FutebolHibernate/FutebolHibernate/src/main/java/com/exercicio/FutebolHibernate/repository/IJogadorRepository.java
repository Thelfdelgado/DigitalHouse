package com.exercicio.FutebolHibernate.repository;

import com.exercicio.FutebolHibernate.entity.JogadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJogadorRepository extends JpaRepository<JogadorEntity, Long> {
}
