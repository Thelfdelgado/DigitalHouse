package com.projetoJPA.ClinicaOdontologicaJPA.service;

import java.util.List;
import java.util.Optional;

public interface IService <T>{
    T adicionar(T t);
    List<T> mostrarTodos();
    void modificar(T t);
    Optional<T> buscarPorId(Long id);
    void excluir(Long id);
}
