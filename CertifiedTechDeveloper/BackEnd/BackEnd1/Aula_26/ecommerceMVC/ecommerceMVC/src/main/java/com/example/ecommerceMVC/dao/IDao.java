package com.example.ecommerceMVC.dao;

import com.example.ecommerceMVC.model.Produto;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IDao <T>{
    Produto salvar(Produto produto) throws SQLException;
    public List<T> buscarTodos() throws SQLException;
    public T alterar(T t) throws SQLException;
    public Optional<T> buscarPorId(int id) throws SQLException;
    public String excluir(int id) throws SQLException;
}
