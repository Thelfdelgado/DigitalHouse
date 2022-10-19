package com.aula38.MongoDB.repository;

import com.aula38.MongoDB.model.EstadoModel;
import com.aula38.MongoDB.model.PartidaModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPartidaRepository extends MongoRepository<PartidaModel, Integer> {
    List<PartidaModel> findAllByEstado(EstadoModel estado);
}
