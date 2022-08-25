package com.example.Clinica.service;

import com.example.Clinica.dao.IDao;
import com.example.Clinica.model.Usuario;

public class UsuarioService {
    private IDao<Usuario> usuarioIDao;

    public UsuarioService(IDao<Usuario> usuarioIDao) {
        this.usuarioIDao = usuarioIDao;
    }

    public Usuario cadasrto(Usuario usuario){
        return usuarioIDao.cadastrar(usuario);
    }

    public Usuario buscar(Integer id){
        return usuarioIDao.buscar(id);
    }

    public Usuario excluir(Integer id){
        return usuarioIDao.excluir(id);
    }
}
