package com.aula38.MongoDB.repository;

import com.aula38.MongoDB.model.TorneioModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITorneioRepository extends MongoRepository<TorneioModel, Integer> {
}
