package com.example.ecommerceMVC.service;

import com.example.ecommerceMVC.dao.IDao;
import com.example.ecommerceMVC.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    IDao<Produto> produtoIDao;
    public Produto salvar(Produto produto) throws SQLException {
        return produtoIDao.salvar(produto);
    }

    public List<Produto> buscarTodos() throws SQLException {
        return produtoIDao.buscarTodos();
    }

    public Produto alterar(Produto produto) throws SQLException {
        return produtoIDao.alterar(produto);
    }

    public String excluir(int id) throws SQLException {
        return produtoIDao.excluir(id);
    }

    public Optional<Produto> buscarPorId(int id) throws SQLException {
        return produtoIDao.buscarPorId(id);
    }
}
