package com.integradora10.Produto.repository;

import com.integradora10.Produto.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}
