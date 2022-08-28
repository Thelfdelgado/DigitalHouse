package com.projeto.ClinicaOdontologica.Dao;

public interface IDao <T> {
    T adicionar(T t);
    T modificar(Integer id);
    T excluir(Integer id);
}
