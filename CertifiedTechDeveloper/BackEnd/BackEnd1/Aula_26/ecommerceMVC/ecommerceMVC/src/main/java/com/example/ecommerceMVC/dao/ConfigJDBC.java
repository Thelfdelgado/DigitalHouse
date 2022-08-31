package com.example.ecommerceMVC.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfigJDBC {
    private String jdbcDriver, dbUrl, usuario, senha;

    public ConfigJDBC(String jdbcDriver, String dbUrl, String usuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Connection getConnection(){
        Connection c = null;
        try {
            Class.forName(this.jdbcDriver);
            c = DriverManager.getConnection(this.dbUrl,this.usuario,this.senha);
        }catch (Exception e){
            e.printStackTrace();
        }
        return c;
    }
}
