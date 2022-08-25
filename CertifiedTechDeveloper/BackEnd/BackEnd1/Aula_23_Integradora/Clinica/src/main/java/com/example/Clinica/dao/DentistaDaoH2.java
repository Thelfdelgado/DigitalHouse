package com.example.Clinica.dao;

import com.example.Clinica.model.Dentista;
import com.example.Clinica.model.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DentistaDaoH2 implements IDao<Dentista> {
    private ConfigJDBC configJDBC;

    public DentistaDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Dentista cadastrar(Dentista dentista) {
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("INSERT INTO dentistas(nome,numMatricula,atendeConvenio) VALUES ('%S','%S','%S')", dentista.getNome(),dentista.getNumMatricula(),dentista.getAtendeConvenio());
        try {
            s = c.createStatement();
            s.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = s.getGeneratedKeys();
            if (keys.next()){
                dentista.setIdDentista(keys.getInt(1));
                s.close();
                c.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return dentista;
    }

    @Override
    public Dentista buscar(Integer id) {
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("SELECT * FROM dentistas WHERE id = %s", id);
        Dentista dentista = null;
        try {
            s = c.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()){
                System.out.println(dentista = new Dentista(id, rs.getString("nome"), rs.getInt("numMatricula"), rs.getBoolean("atendeConvenio")));
            }
            s.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return dentista;
    }

    @Override
    public Dentista excluir(Integer id) {
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("DELETE FROM dentistas WHERE id = %s", id);
        Dentista dentista = null;
        try {
            s = c.createStatement();
            int retorno = s.executeUpdate(query);
            s.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return dentista;
    }
}
