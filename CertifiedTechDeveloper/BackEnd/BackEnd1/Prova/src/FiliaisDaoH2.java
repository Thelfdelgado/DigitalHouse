import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FiliaisDaoH2 implements IDao<Filiais> {
    private ConfigJDBC configJDBC;

    final static Logger log = Logger.getLogger(FiliaisDaoH2.class);

    public FiliaisDaoH2(ConfigJDBC configJDBC){
        this.configJDBC = configJDBC;
    }

    @Override
    public Filiais salvar(Filiais filiais) {
        log.info("Registrando uma nova filial: " + filiais.toString());
        Connection c = configJDBC.conectarComBancoDeDados();
        Statement s = null;
        String query = String.format("INSERT INTO filiais(id,nomeFilial,rua,numero,cidade,estado,cincoEstrelas) VALUES ('%s','%s','%s','%s','%s','%s','%s')",
                filiais.getId(),filiais.getNomeFilial(),filiais.getRua(),filiais.getNumero(),filiais.getCidade(),filiais.getEstado(),filiais.isCincoEstrelas());

        try {
            s = c.createStatement();
            s.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = s.getGeneratedKeys();

            if (keys.next()){
                filiais.setId(keys.getInt(1));
                s.close();
                c.close();
            }
        }catch (SQLException e){
            log.error("Filial não salva");
            e.printStackTrace();
        }
        return filiais;
    }
}
