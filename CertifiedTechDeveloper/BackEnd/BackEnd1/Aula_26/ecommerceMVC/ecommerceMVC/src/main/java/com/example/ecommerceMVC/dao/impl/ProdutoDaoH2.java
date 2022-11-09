package com.example.ecommerceMVC.dao.impl;

import com.example.ecommerceMVC.dao.ConfigJDBC;
import com.example.ecommerceMVC.dao.IDao;
import com.example.ecommerceMVC.model.Produto;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.apache.logging.log4j.LogManager.getLogger;


@Configuration
public class ProdutoDaoH2 implements IDao<Produto> {
    private ConfigJDBC configJDBC;

    final static Logger log = getLogger(ProdutoDaoH2.class);

    @Override
    public Produto salvar(Produto produto) throws SQLException {
        log.info("Abrindo conexao");
        String sqlInsert = String.format("INSERT INTO produto (nomeProduto,valor)" +
                "VALUES ('%s','%s')",produto.getNomeProduto(),produto.getValor());
        Connection c = null;

        try {
            log.info("Salvando produto: " + produto.getNomeProduto());
            configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            c = configJDBC.getConnection();
            Statement s = c.createStatement();
            s.execute(sqlInsert,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = s.getGeneratedKeys();

            if (rs.next()){
                produto.setId(rs.getInt(1));
            }
        }catch (Exception e){
            e.printStackTrace();
            log.error("Erro ao inserir o produto: " + e.getMessage());
        }finally {
            log.info("Fechando a conexao");
            c.close();
        }
        return produto;
    }

    @Override
    public List<Produto> buscarTodos() throws SQLException {
        log.debug("Abrindo uma conexao no banco");
        Connection c = null;
        Statement s = null;
        String query = "SELECT * FROM produto";
        List<Produto> produtos = new ArrayList<>();

        try {
            configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            c = configJDBC.getConnection();
            s = c.createStatement();
            ResultSet rs = s.executeQuery(query);
            log.debug("Buscando todos os produtos do banco");

            while (rs.next()){
                produtos.add(criarObjetoProduto(rs));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            log.debug("Fechando a conexao no banco");
            s.close();
        }
        return produtos;
    }

    @Override
    public Produto alterar(Produto produto) throws SQLException {
        String sqlUpdate = String.format("UPDATE produto set valor = '%s' WHERE id = '%s';",produto.getValor(),produto.getId());
        Connection c = null;

        try {
            log.info("Alterando o valor do produto: " + produto.getId());
            configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            c = configJDBC.getConnection();
            Statement s = c.createStatement();
            s.execute(sqlUpdate);
        }catch (Exception e){
            e.printStackTrace();
            log.error("Erro ao alterar o produto: " + e.getMessage());
        }finally {
            log.info("Fechando conexao");
            c.close();
        }
        return produto;
    }

    @Override
    public Optional<Produto> buscarPorId(int id) throws SQLException {
        log.debug("Abrindo uma conexao no banco");
        Connection c = null;
        Statement s = null;
        String query = String.format("SELECT * FROM produto WHERE id = %s",id);
        Produto produto = null;

        try {
            configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            c = configJDBC.getConnection();
            log.debug("Buscando produto por id: " + id);
            s = c.createStatement();
            ResultSet rs = s.executeQuery(query);

            while (rs.next()){
                produto = criarObjetoProduto(rs);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            log.debug("Fechando conexao no banco");
            s.close();
        }
        return produto != null ? Optional.of(produto) : Optional.empty();
    }

    @Override
    public String excluir(int id) throws SQLException {
        log.info("Abrindo conexao");
        Connection c = null;
        Statement s = null;
        String sqlDelete = String.format("DELETE FROM produto WHERE id = %s",id);

        try {
            configJDBC = new ConfigJDBC("org.h2.Driver","jdbc:h2:~/ecommerce;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
            c = configJDBC.getConnection();
            log.debug("Excluindo produto com id: " + id);
            s = c.createStatement();
            s.execute(sqlDelete);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            log.debug("Fechando conexao");
            c.close();
        }
        return sqlDelete;
    }

    private Produto criarObjetoProduto(ResultSet rs) throws SQLException{
        Integer id = rs.getInt("id");
        String nomeProduto = rs.getString("nomeProduto");
        double valor = rs.getDouble("valor");
        return new Produto(id,nomeProduto,valor);
    }
}
