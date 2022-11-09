package com.aula41.FilmeException.repository;

import com.aula41.FilmeException.model.FilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFilmeRepository extends JpaRepository<FilmeModel, Integer> {
}
