package com.integradora10.Produto.service;

import java.util.List;
import java.util.Optional;

public interface IService<T>{
    List<T> findAllProdutos();
    Optional<T> findById(Long id);
    String delete(Long id);
}
