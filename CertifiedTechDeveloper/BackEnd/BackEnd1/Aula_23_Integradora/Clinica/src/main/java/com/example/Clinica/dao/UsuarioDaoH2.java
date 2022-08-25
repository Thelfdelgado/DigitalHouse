package com.example.Clinica.dao;

import com.example.Clinica.model.Usuario;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDaoH2 implements IDao<Usuario> {
    private ConfigJDBC configJDBC;

    public UsuarioDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Usuario cadastrar(Usuario usuario) {
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("INSERT INTO usuarios(nome,email,senha,nivelAcesso) VALUES ('%S','%S','%S','%S')", usuario.getNome(),usuario.getEmail(),usuario.getSenha(),usuario.getNivelAcesso());
        try {
            s = c.createStatement();
            s.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = s.getGeneratedKeys();
            if (keys.next()){
                usuario.setIdUsuario(keys.getInt(1));
                s.close();
                c.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public Usuario buscar(Integer id) {
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("SELECT * FROM usuarios WHERE id = %s", id);
        Usuario usuario = null;
        try {
            s = c.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()){
                System.out.println(usuario = new Usuario(id, rs.getString("nome"), rs.getString("email"), rs.getString("senha"), rs.getInt("nivelAcesso")));
            }
            s.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return usuario;
    }

    @Override
    public Usuario excluir(Integer id) {
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("DELETE FROM usuarios WHERE id = %s", id);
        Usuario usuario = null;
        try {
            s = c.createStatement();
            int retorno = s.executeUpdate(query);
            s.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return usuario;
    }
}
