package Mesa;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PacienteDaoH2 implements IDao<Paciente>{
    private ConfigJDBC configJDBC;

    final static Logger log = Logger.getLogger(PacienteDaoH2.class);

    public PacienteDaoH2(ConfigJDBC configJDBC) {
        this.configJDBC = configJDBC;
    }

    @Override
    public Paciente cadastro(Paciente paciente) {
        BasicConfigurator.configure();
        log.info("Cadastrando um novo Paciente: " + paciente.toString());
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format(
                "INSERT INTO clinica(idPaciente,nome,sobrenome,rg,dataCadastro,idEndereco) VALUES ('%s','%s','%s','%s','%s','%s')",paciente.getNome(),paciente.getSobrenome(),paciente.getRg(),paciente.getDataCadastro(),paciente.getIdEndereco());

        try {
            s = c.createStatement();
            s.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = s.getGeneratedKeys();

            if (keys.next()){
                paciente.setIdPaciente(keys.getInt(1));
                s.close();
                c.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return paciente;
    }

    @Override
    public Paciente buscar(Integer id) {
        BasicConfigurator.configure();
        log.info("Buscando o paciente de id: " + id);
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format(
                "SELECT * FROM clinica WHERE idPaciente = %s", id);
        Paciente paciente = null;

        try {
            s = c.createStatement();
            ResultSet rs = s.executeQuery(query);

            while (rs.next()){
                System.out.println(paciente = new Paciente(rs.getInt("idPaciente"), rs.getString("nome"), rs.getString("sobrenome"), rs.getString("rg"), rs.getString("dataCadastro"),rs.getInt("idEndereco")));
            }
            s.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return paciente;
    }

    @Override
    public Paciente excluir(Integer id) {
        BasicConfigurator.configure();
        log.info("Excluindo o paciente de id: " + id);
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("DELETE FROM clinica WHERE idPaciente = %s;", id);
        Paciente paciente = null;

        try {
            s = c.createStatement();
            int retorno = s.executeUpdate(query);
            s.close();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return paciente;
    }
}
