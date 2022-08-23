package Mesa;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EnderecoDaoH2 implements IDao<Endereco>{
    private ConfigJDBC configJDBC;
    final static Logger log = Logger.getLogger(EnderecoDaoH2.class.getName());

    public EnderecoDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Endereco cadastro(Endereco endereco) {
        BasicConfigurator.configure();
        log.info("Registrando um novo endereco: " + endereco.toString());
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("INSERT INTO endereco(rua,numero,cidade,bairro) VALUES ('%s','%s','%s','%s')", endereco.getRua(), endereco.getNumero(),endereco.getCidade(),endereco.getBairro());

        try {
            s = c.createStatement();
            s.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = s.getGeneratedKeys();

            if (keys.next()){
                endereco.setIdEndereco(keys.getInt(1));
                s.close();
                c.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return endereco;
    }

    @Override
    public Endereco buscar(Integer id) {
        BasicConfigurator.configure();
        log.info("Buscando o endereco de id: " + id);
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("SELECT * FROM endereco WHERE id = %s", id);
        Endereco endereco = null;

        try {
            s = c.createStatement();
            ResultSet rs = s.executeQuery(query);

            while (rs.next()){
                System.out.println(endereco = new Endereco(id, rs.getString("rua"), rs.getInt("numero"), rs.getString("cidade"), rs.getString("bairro")));
            }
            s.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return endereco;
    }

    @Override
    public Endereco excluir(Integer id) {
        BasicConfigurator.configure();
        log.info("Excluindo o endereco de id: " + id);
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("DELETE FROM endereco WHERE idPaciente = %s;", id);
        Endereco endereco = null;

        try {
            s = c.createStatement();
            int retorno = s.executeUpdate(query);
            s.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return endereco;
    }
}