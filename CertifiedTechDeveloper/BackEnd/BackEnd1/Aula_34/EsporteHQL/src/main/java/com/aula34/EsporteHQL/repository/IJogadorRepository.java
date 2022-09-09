package com.aula34.EsporteHQL.repository;

import com.aula34.EsporteHQL.entity.JogadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IJogadorRepository extends JpaRepository<JogadorEntity, Long> {

    @Query("select jogador j from Jogador where j.nome = ?1")
    Optional<JogadorEntity> findJogadorByName(String name);// ?1 pega o nome passado no 'findJogadorByName'
}
