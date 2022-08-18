import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigJDBC {
    private String jdbc, dbUrl, nomeUsuario, senha;

    public ConfigJDBC(String jdbc, String dbUrl, String nomeUsuario, String senha) {
        this.jdbc = jdbc;
        this.dbUrl = dbUrl;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public ConfigJDBC() {
        this.jdbc = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:filiais;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nomeUsuario = "sa";
        this.senha = "";
    }

    public Connection conectarComBancoDeDados(){
        Connection c = null;

        try {
            c = DriverManager.getConnection(dbUrl, nomeUsuario, senha);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return c;
    }
}
