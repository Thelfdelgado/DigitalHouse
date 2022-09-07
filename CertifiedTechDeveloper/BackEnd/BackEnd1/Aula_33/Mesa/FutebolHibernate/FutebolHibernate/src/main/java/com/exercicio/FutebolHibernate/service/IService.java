package com.exercicio.FutebolHibernate.service;

import java.util.List;
import java.util.Optional;

public interface IService <T>{
    T cadastrar(T t);
    List<T> buscarTodos();
    Optional<T> buscarPorId(Long id);
    void excluir(Long id);
    void atualizar(T t);
}
