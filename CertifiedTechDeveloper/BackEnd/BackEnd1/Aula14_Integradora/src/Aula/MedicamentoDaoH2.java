package Aula;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicamentoDaoH2 implements IDao<Medicamento> {
    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger log = Logger.getLogger(MedicamentoDaoH2.class);

    public MedicamentoDaoH2(ConfiguracaoJDBC configuracaoJDBC){
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) {
        log.info("Registrando um novo medicamento: " + medicamento.toString());
        Connection c = configuracaoJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("INSERT INTO medicamentos(nome,laboratorio, quantidade, preco) VALUES ('%s','%s','%s','%s')",
        medicamento.getNome(),medicamento.getLaboratorio(),medicamento.getQuantidade(),medicamento.getPreco());

        try {
            s = c.createStatement();
            s.executeQuery(query);
            ResultSet keys = s.getGeneratedKeys();

            if (keys.next()){
                medicamento.setId(keys.getInt(1));
                s.close();
                c.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return medicamento;
    }

    @Override
    public Medicamento buscar(Integer id) {
        log.info("Buscando medicamento com id: " + id);
        Connection c = configuracaoJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("SELECT id,nome,laboratorio,quantidade,preco FROM medicamentos WHERE id = '%s",id);

        Medicamento medicamento = null;

        try {
            s = c.createStatement();
            ResultSet rs = s.executeQuery(query);

            while (rs.next()){
                medicamento = new Medicamento(rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("laboratorio"),
                        rs.getInt("quantidade"),rs.getDouble("preco"));
            }
            s.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return medicamento;
    }
}
