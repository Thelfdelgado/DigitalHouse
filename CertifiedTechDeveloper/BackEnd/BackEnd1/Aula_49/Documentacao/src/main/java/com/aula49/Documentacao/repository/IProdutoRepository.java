package com.aula49.Documentacao.repository;

import com.aula49.Documentacao.model.ProdutoModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdutoRepository extends MongoRepository<ProdutoModel, Integer> {
}
