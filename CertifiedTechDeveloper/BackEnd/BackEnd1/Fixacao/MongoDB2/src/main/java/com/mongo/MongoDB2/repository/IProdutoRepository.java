package com.mongo.MongoDB2.repository;

import com.mongo.MongoDB2.model.ProdutoModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdutoRepository extends MongoRepository<ProdutoModel, Integer> {
}
