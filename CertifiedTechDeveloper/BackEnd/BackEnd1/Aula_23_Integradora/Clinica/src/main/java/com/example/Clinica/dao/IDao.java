package com.example.Clinica.dao;

public interface IDao <T> {
    T cadastrar(T t);
    T buscar(Integer id);
    T excluir(Integer id);
}
