package com.example.Clinica.service;

import com.example.Clinica.dao.IDao;
import com.example.Clinica.model.Dentista;
import com.example.Clinica.model.Usuario;

public class DentistaService {
    private IDao<Dentista> dentistaIDao;

    public DentistaService(IDao<Dentista> dentistaIDao) {
        this.dentistaIDao = dentistaIDao;
    }

    public Dentista cadastro(Dentista dentista){
        return dentistaIDao.cadastrar(dentista);
    }

    public Dentista buscar(Integer id){
        return dentistaIDao.buscar(id);
    }

    public Dentista excluir(Integer id){
        return dentistaIDao.excluir(id);
    }
}
