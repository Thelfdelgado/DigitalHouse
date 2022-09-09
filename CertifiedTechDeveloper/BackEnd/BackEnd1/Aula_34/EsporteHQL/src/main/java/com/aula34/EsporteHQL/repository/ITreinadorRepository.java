package com.aula34.EsporteHQL.repository;

import com.aula34.EsporteHQL.entity.TreinadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ITreinadorRepository extends JpaRepository<TreinadorEntity, Long> {
    @Query("select treinador t from Treinador where r.idade = ?1")
    Optional<TreinadorEntity> findTreinadorByAge(Integer idade);
}
